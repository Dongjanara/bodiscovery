<form align="center">
 <img width="250" src="https://github.com/Dongjanara/goodday/assets/161558210/a91a6c55-e67e-453b-ac0f-6867352352eb"> <h1> Bodiscovery - README, </h1>
</form>

<br>

<form>
  <h2> 기획 의도 </h2>
    <li> 펜데믹 이후, 헬스 케어 산업은 큰 변화를 맞이했습니다.   </li>
    <li> ICT의 발달과 건강에 대한 관심이 맞물려, 디지털 헬스케어 산업은 2026년 기준 약 800조원 규모까지 급부상 할 것이라는 전망입니다. </li>
    <li> 이러한 상황에서 다양한 식품 관련 정보와 헬스 관련 정보 사이트가 등장하였지만, 이것이 통합되어 개발된 웹사이트가 적어서 이용에 불편을 느끼는 경우가 많습니다. </li>
    <li> 앞서 언급한 문제점을 해소하기 위해, 건강에 관련된 식품 요소와 헬스 및 운동요소를 통합한 웹사이트 제작을 하고자 합니다. </li>
    <li> 사용자들은 웹사이트에 접속하여 식단관리 및 체중관리 현황 근처 헬스장 및 운동시설 확인, 건강식품 구매 등의 활동을 할 수 있습니다. </li> 
    <li> 또한 공공데이터를 통해 보다 직관적이고 체계적으로 건강을 관리 할 수 있으며, 이러한 기능 등을 통해 사용자들이 효율적이고 체계적으로 건강을 관리 할 수 있도록 만들고자 합니다. </li>  
</form>

<form>
  <h3> 개발 기간 </h3>
    <li> 2024. 03. 07 ~ 2024. 04. 03 (총 28일) </li>
  <h3> 참여 인원 </h3>
    <li> 4명 </li>
  <h3> 개발 환경 </h3>
    <li> STS3(Spring Tool Suite 3), JDK8(Java Development Kit), Window 10, Mac OS </li>
  <h3> 사용 도구 </h3>
    <li> Oracle, SQLDeveloper, DBeaver, Apache Tomcat v9.0 </li>
  <h3> 사용 기술 </h3>
    <li> JAVA, HTML, CSS, JSP, JavaScript, jQuery, Ajax, JSON, JSTL, 카카오 지도 API, 카카오(토스)결제 API, 카카오 상담톡, 페이징, XML, 공공데이터포털, MyBatis, OAuth2.0 </li>
</form>

<form>
    <h2> 목표 및 설계 </h2>
      <img width="auto" alt="image" align="center"
        src="https://github.com/Dongjanara/bodiscovery/assets/161558210/af0de789-82f8-418f-b328-e8bc12ab36d6">
    <h2> [팀 공통 목표] </h2>
      <li> Spring에서 Mybatis을 활용하여 DB 연동을 위해 Spring의 의존성 추가, Mapper, DAO 구현에 대하여 공부를 하고 팀원들과 의견을 공유합니다. </li>
      <li> 기존 MVC2 모델을 활용한 기능들을 Spring MVC 로 변동하는 과정에서 코드를 어떤 방식으로 변환하면 되는지에 대해 팀원들과 상의하며 이 과정에서 협업 능력을 증진 시킵니다. </li>
      <li> 웹 전체 페이지를 이용자들이 쉽게 접근할 수 있도록 직관적으로 표현합니다. </li>
      <li> 상품, 식단등록 페이지는 Oracle SQL DB를 사용하여 일관성 있게 관리합니다. </li>
      <li> 회원가입 시 개인정보 보호를 위해 암호화를 적용합니다. </li>
      <li> 이메일 인증을 통하여, 본인 인증 절차를 적용합니다. </li>
      <li> 게시판 댓글 기능을 통해 커뮤니티를 활성화합니다. </li>
      <li> 운동 시설 확인은 공공데이터를 활용하여 진행합니다. </li>
      <li> 식품 영양소 또한 공공데이터를 활용하여 진행합니다. </li>
      <li> 매일 프로젝트 진행 후, 화면 설계서 및 기능 명세서를 기반으로 프로젝트 진행 상황을 공유합니다. </li>
    <h2> [개인 목표] </h2> 
  → 프론트
  <li> 목표 : Bodiscovery 웹 페이지 전체 프론트를 사용자 친화적이고, 기능을 돋보일 수 있도록 합니다. </li>
  <li> 구현 계획 : 부트스트랩, CSS 등을 이용하여, 보다 세련되고 사용자 친화적인 UI를 가진 웹페이지가 되도록 구현합니다. </li>
  <br>
  → 간편로그인
  <li> 목표 : 카카오, 네이버 간편 로그인을 통하여, 로그인 기능을 제공합니다. </li>
  <li> 구현 계획 : 간편 로그인 API 를 학습하여, 카카오, 네이버 로그인이 가능하도록 합니다. </li>
  <br>
  → 상품조회
  <li> 목표 : 사용자가 쉽게 상품을 쉽게 볼 수 있도록 합니다. </li>
  <li> 구현 계획 : 상품 보기에 필요한 UI를 적용하여, 보다 직관적으로 상품 정보를 출력하도록 합니다. </li>
  <br>
  → 장바구니
  <li> 목표 : 사용자가 자신이 담은 상품을 쉽게 확인 할 수 있도록 기능을 제공합니다. </li>
  <li> 구현 계획 : 구매 총 수량, 합계 금액을 한눈에 쉽게 가독성을 높여서 구현합니다. 장바구니 비우기를 누를 시, 전체 장바구니가 비워지도록 하며, 개별 상품 삭제 또한 가능하도록 합니다. </li>
  <br>
  → 간편결제
  <li> 목표 : 카카오, 토스페이를 이용한 간편결제 기능을 제공합니다. </li>
  <li> 구현 계획 : 간편 결제 API를 학습하여, 결제기능이 가능하도록 합니다. 추가적으로 결제내역을 열람할 수 있도록 합니다. </li>
  <br>
  → 상담하기
  <li> 목표 : 카카오 상담하기를 이용한 관리자와 사용자 간의 1대1 채팅 기능을 제공합니다. </li>
  <li> 구현 계획 : 카카오 상담하기 API 를 학습하여, 상담 톡 기능이 가능하도록 합니다. </li>
  </form>

  <form>
    <h2> 프로젝트 구조 </h2>
    <h3> ERD 설계 </h3>
      <img width="auto" alt="image" align="center" 
        src=https://github.com/Dongjanara/bodiscovery/assets/161558210/7959cd3e-b81a-4ad0-9e5a-602a66885c1a>
    <h3> 서비스 구조 </h3>
      <img width="auto" alt="스크린샷 2024-04-22 오후 4 02 46"   align="center"
        src="https://github.com/Dongjanara/bodiscovery/assets/161558210/b9388881-51d9-48d7-b092-03212c94fa68">
    <h2> 주요 핵심 기능 </h2>
    <h3> 메인화면 </h3>
      <img width="1512" alt="스크린샷 2024-04-09 오후 3 02 50" align="center"
        src="https://github.com/Dongjanara/bodiscovery/assets/161558210/bff3925b-07dd-4981-8baa-2f1858162a0c">
    <h3> 간편로그인 </h3>
      <li> 네이버 / 카카오 간편 로그인이 가능합니다. </li>
      <img width="400" alt="바디디-간편로그인" align="center"
        src="https://github.com/Dongjanara/bodiscovery/assets/161558210/80df2b1d-6179-4698-b673-660fd6a8b47a">
    <h3> 상품화면 </h3>
      <li> 등록된 상품이 출력되어 보여집니다. </li>
        <img width="auto" alt="상품보기-화면" align="center"
          src="https://github.com/Dongjanara/bodiscovery/assets/161558210/d99145e7-55ad-4833-aef6-215d3efc49a5">
      <li> 상품 선택시, 상품에 대한 세부내역이 출력됩니다. </li>
        <img width="632" alt="스크린샷 2024-04-02 오전 8 59 53" align="center"
          src="https://github.com/Dongjanara/bodiscovery/assets/161558210/df9d7984-833b-4419-92d7-f2a6a3e9bedf">
    <h3> 장바구니 </h3>
      <li> 장바구니가 비었을 경우, 안내 문구가 출력됩니다. </li>
        <img width="544" alt="스크린샷 2024-04-02 오전 9 30 35" align="center" 
          src="https://github.com/Dongjanara/bodiscovery/assets/161558210/ee157aba-3fe0-485b-acf4-48a9d274c36a">
      <li> 장바구니에 상품이 있을 경우, 상품 번호를 기준으로 수량을 업데이트 합니다. </li>
        <img width="1501" alt="스크린샷 2024-04-02 오전 9 30 06" align="center"
          src="https://github.com/Dongjanara/bodiscovery/assets/161558210/8f65cc13-c0a8-416d-a388-eb31c70c95c1">
    <h3> 간편결제 </h3>
      <li> 카카오 / 토스 간편 결제가 가능합니다. </li>
        <img width="400" alt="바디디-간편결제1" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/83841dc0-b432-4de4-8af1-5a3d1f27e3c6">
        <img width="300" alt="바디디-간편결제2" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/4e06cb1f-315b-4c01-9a39-58381f28e538">
        <img width="350" alt="바디디-간편결제3" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/12d7ccf3-0d42-4236-bac2-76acdbaa6f3a">
    <h3> 결제 성공 안내 </h3>
      <li> 사용자 친화적 UI 구현 </li>
      <img width="350" alt="바디디-간편결제3" align="center"
        src="https://github.com/Dongjanara/bodiscovery/assets/161558210/85ba4320-eb4e-4512-b619-878e9f0d4b8e">
    <h3> 식단 등록 </h3>
      <li> 사용자가 섭취한 식단 등록이 가능합니다. </li> <br>
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/deac70a2-3f51-427f-9273-0269b1b9310a">
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/c0c5570a-c72d-48f0-8561-f6fc9cb419b9">
      <li> 섭취 칼로리를 계산하여, 그래프 출력이 가능합니다. </li>
        <img width="auto" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/2c1d325f-75dc-4ca7-9cdd-d564c5dbfa85">
    <h3> 카카오톡 상담하기 API </h3>
      <li> 사용자와 관리자 간의 카카오톡 상담하기 기능이 가능합니다. </li>
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/af3bf635-a1c2-4fc5-9dc1-5ff61f49d9ae">
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/2aed441c-78a2-42ff-9a66-9e977cdfef2b">
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/0d6c308f-a286-426a-af7f-5cfdb271e00d">
        <img width="400" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/5db5beaf-3558-40e0-b161-860d07e51e56">
        <img width="400" src="[https://github.com/Dongjanara/bodiscovery/assets/161558210/5db5beaf-3558-40e0-b161-860d07e51e56">
    <h2> 에필로그 </h2>
    <h3> 기능 구현 후기 및 개선점 </h3>
      <li> Spring으로 진행한 첫번째 프로젝트이기에 MyBatis 활용 및 mapper를 사용하여, 직접 쿼리문 작성, 초기 설정 부분에서 좀 어려운 부분이 있었으나, 
        프로젝트를 진행하면서 점차 손에 익숙해지자 코드량도 줄어 가독성도 좋고, 수정 및 보완에도 강점이 있다고 몸소 느꼈습니다. 
        하지만, 초기 계획 단계에서 Websocket 를 활용한 실시간 채팅 기능을 추가함에 많은 어려움에 부딪혔습니다. 이로 인해 기능을 보다 효율적으로 만들기 위한 추가 학습의 필요성을 느꼈습니다. </li>
    <h3> 개선점 및 향후 계획 </h3> 
      <li> 본 프로젝트에서는 사용자의 사용 환경이 Websocket 보다는 상담톡이 적합하다고 판단하여, 수정하게 되었습니다. 
        하지만, Websocket, WebRTC를 추가 학습하여, 화상채팅도 가능하도록 구현하여, 사용자로 하여금 보다 더 가까운 서비스 제공을 할 예정입니다. </li>
  </form>
  <form>
    <h3> 프로젝트 시연 영상 </h3>
    <li> <img width="20" src="https://github.com/Dongjanara/bodiscovery/assets/161558210/40fcc3ae-104f-4d9a-a5ab-8288ecc40def"> https://youtu.be/pTpmstymQ7s </li>
  </form>
