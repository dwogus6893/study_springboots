<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
    <!--header-->
    <header class="d-flex justify-content-between">  
        <!-- 왼쪽 아이콘 -->
        <nav></nav>
    
        <!-- 중간메뉴바    -->
        <div class="d-flex align-items-center">
            <nav class="nav nav-pills d-flex ">
                <h3><a href="/board/view" class="nav-link link-dark">VIEW</a></h3>
                <h3><a href="/board/form" class="nav-link link-dark">FORM</a></h3>
                <h3><a href="/board/edit" class="nav-link link-dark">EDIT</a></h3>
                <h3><a href="/board/list" class="nav-link link-dark">LIST</a></h3>      
            </nav>
        </div>
        
        <!-- 오른쪽 메뉴바 -->
        <div>
            <nav>
            <button class="btn btn-outline-primary my-2 my-sm-2" type="submit">Login</button>        
            </nav>  
        </div>
        </header>
        </div>
        <hr class="1">
        <!--header-->
    <div class="fs-1 fw-bold text-bg-warning text-center">Board VIEW</div>
    <div class="container">
      <table class="table">
        <thead>
          <tr>
            <th class="fs-2">sportalkorea</th>
            <td>2022.12.30</td>
          </tr>
          <tr>
            
          </tr>
        </thead>
        <tbody>
          
          <tr>
            <th class="fs-4">
                <h3>'병역 기피 논란' 석현준, "대한민국 국민으로써 회피할 생각 전혀 없었다"</h3>
            </th>
          </tr>
          <tr>
            <td>
                [스포탈코리아] 곽힘찬 기자= 석현준이 병역 회피 및 귀화설에 대해 입을 열었다.

                석현준은 30일 자신의 인스타그램 계정을 통해 병역 회피설이 불거진 것에 대해 자신의 입장을 밝혔다.
                
                석현준은 "병역 문제로 많은 분들께 실망은 안겨드린 점 죄송하다. 12월 30일부로 경찰-검찰 조사를 마치고 내 병역 문제가 법원으로 넘어가 재판을 기다리게 됐다. 이제야 입장을 밝힐 수 있는 상황이라 판단했다"라고 입을 열었다.
                
                그러면서 병역 회피는 결코 없었다고 강조했다. 석현준은 "단 한 번도 대한민국 국민으로써 병역을 회피할 생각은 전혀 없었다. 국방의 의무를 지고 있는 나는 그동안 해외 구단과 계약을 해지하기 위해 협조 서한을 보내는 등 노력했다"라고 강조했다.
                
                이어 "구단 측에서는 높은 이적료를 지불하는 구단에만 보내기 위해 협조서한을 묵살했고 이로 인해 국내로 복귀해 상무를 갈 수 있는 시기도 놓쳤다. 그나마 지난 여름, 1년의 계약기간만 남아 위약금을 감당할 수 있는 수준이 되자 나는 병역을 위해 위약금을 지불하고 계약해지를 했습니다. 현재는 무적 상태로 국방의 의무를 이행하기 위해 기다리고 있다"라고 해명했다.
                
                석현준은 수많은 논란이 있었음에도 불구하고 어떠한 입장도 내놓지 않았었다. 뒤늦게 입을 연 것에 대해 "명확히 정리되지 않아서다. 군대를 회피하려는 것처럼 보이게 해 죄송하다"라고 고개를 숙였다.
                
                마지막으로 병역 의무를 수행할 것을 약속했다. 석현준은 "제대로 된 시기에 병역을 이행하지 않고 불필요한 오해를 사게 한 부분에 대해 다시 한 번 사과드린다. 최대한 빨리 국방의 의무를 이행하겠다"라고 마무리했다.
                
                석현준은 네덜란드, 포르투갈, 터키 등 다수의 해외 리그에서 활약하며 저니맨 생활을 했다. 그러다 병역 의무를 수행할 시기가 왔지만 계속 해외에 남았고 결국 병무청은 석현준을 병역 기피자로 지정한 바 있다.
                
                사진=게티이미지코리아
            </td>
            
          </tr>
        
        </tbody>
      </table>
      
      <hr class = "1">

      <div class="d-flex justify-content-between">
        <div class="item">
          <a href="/board/list" class="btn btn-outline-dark fw-bold">뒤로가기</a>
        </div>
        <div class="item">
          <a href="/board/edit" class="btn btn-warning fw-bold">수정하기</a>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" 
    crossorigin="anonymous"></script> 
  </body>
</html>