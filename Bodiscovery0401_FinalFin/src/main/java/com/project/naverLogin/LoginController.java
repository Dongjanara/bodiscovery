package com.project.naverLogin;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.project.user.service.UserService;
import com.project.user.vo.UserVO;

/** * Handles requests for the application home page. */
@Controller
public class LoginController {
   
   /* NaverLoginBO */ 
   private NaverLoginBO naverLoginBO;
   private String apiResult = null;
   
   
   @Resource(name="userService")
   private UserService userService;

   @Autowired   
   private void setNaverLoginBO(NaverLoginBO naverLoginBO) {      
      this.naverLoginBO = naverLoginBO;   
      
   } 
   
   // 로그인 첫 화면 요청 메소드 
   @RequestMapping(value = "/Naverlogin", method = {RequestMethod.GET, RequestMethod.POST })
   public String login(Model model,HttpSession session) { 
      
      /* 네이버아이디로 인증 URL을 생성하기 위하여 naverLoginBO클래스의 getAuthorizationUrl메소드 호출 */ 
      String naverAuthUrl = naverLoginBO.getAuthorizationUrl(session);

      //https://nid.naver.com/oauth2.0/authorize?response_type=code&client_id=sE***************&
      //redirect_uri=http%3A%2F%2F211.63.89.90%3A8090%2Flogin_project%2Fcallback&state=e68c269c-5ba9-4c31-85da-54c16c658125
   System.out.println("네이버로그인으로 시도중입니다" + naverAuthUrl); 
   
   //네이버 
   model.addAttribute("url",naverAuthUrl); 
   return "login"; 
   } 
   
   
   //네이버 로그인 성공시 callback호출 메소드
   @RequestMapping(value = "/callback", method = { RequestMethod.GET,RequestMethod.POST }) 
   public String callback(Model model, @RequestParam String code, @RequestParam String state, HttpSession session, UserVO userVO) throws IOException, ParseException { 
      
      System.out.println("callback중입니다.");
    
      OAuth2AccessToken oauthToken; 
      oauthToken = naverLoginBO.getAccessToken(session, code, state); 
      
      //1. 로그인 사용자 정보를 읽어온다.
    apiResult = naverLoginBO.getUserProfile(oauthToken); //String형식의 json데이터 
    
    /**
    apiResult json 구조 {"resultcode":"00", "message":"success",
    "response":{"id":"33666449","nickname":"shinn****","age":"20-29","gender":"M","email":"sh@naver.com","name":"\uc2e0\ubc94\ud638"}}
    **/ 
    
       //2. String형식인 apiResult를 json형태로 바꿈 
       JSONParser parser = new JSONParser(); 
       Object obj = parser.parse(apiResult); 
       JSONObject jsonObj = (JSONObject) obj; 
       
       //3. 데이터 파싱 
       //Top레벨 단계 _response 파싱 
       JSONObject response_obj = (JSONObject)jsonObj.get("response"); 
       
       //response의 nickname값 파싱 
       String name = (String)response_obj.get("name");
       String email = (String)response_obj.get("email");
       String gender = (String)response_obj.get("gender");
       String birthyear = (String)response_obj.get("birthyear");
       String mobile = (String)response_obj.get("mobile");
       String id = (String)response_obj.get("nickname");
       String age = (String)response_obj.get("age");
       
       System.out.println("로그인 시도한 사람의 이름" + name);
       System.out.println(name + "님의 정보");
       System.out.println(email);
       System.out.println(gender);
       System.out.println(birthyear);
       System.out.println(mobile);
       System.out.println(id);
       System.out.println(age);
       
       
       userVO.setEmail(email);
	   UserVO NaverLogin;
	try {
		NaverLogin = userService.kakaologin(userVO);
		session.setAttribute("user", NaverLogin);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       return "main"; 
       
   } 
   
   //로그아웃
   @RequestMapping(value = "/Naverlogout", method = { RequestMethod.GET, RequestMethod.POST })
   public String logout(HttpSession session)throws IOException { 
      System.out.println("여기는 logout"); 
      session.invalidate(); 
      
      return "redirect:index.jsp"; 
      } 
   }