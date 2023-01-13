<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First portfolio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>게시판</title>
    
    <style>
        .fakeimg{
          height: 400px;
          background: #aaa;
        }
        /* #project1{
          border: 1px solid slategray;
        } */
    </style>
</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="50">
<div class="container text-white text-center">
        

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


    <!-- 바디바디바디-->
      <div class="container">
      <table class="table">
        <thead>
          <tr>
              <th class="fs-2">바디바디</th>
              <td></td>
              <td></td>
              <td></td>
             
          </tr>
          <tr>
              <th>title</th>
              <th>content</th>
              <th>userName</th>
              <th>date</th>
              
          </tr>
        </thead>
          <tbody>           
            <tr>
             <!-- 1번째 줄 -->
              <!-- 1번 -->
              <td>
                  <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                    '병역 기피 논란' 석현준, "대한민국 국민으로써 회피할 생각 전혀 없었다"</a
                    >
              </td>
              <!-- 2번 -->
              <td>
                석현준은 30일 자신의 인스타그램 계정을 통해 병역 회피설이 불거진 것에 대해 자신의 입장을 밝혔다.<br>
                그러면서 병역 회피는 결코 없었다고 강조했다.<br>
                석현준은 수많은 논란이 있었음에도 불구하고 어떠한 입장도 내놓지 않았었다.<br>
              </td>
              <!-- 3번 -->
              <td>sportalkorea</td>
              <!-- 4번 --> 
              <td>2022.12.30</td>
              </tr>

              <!-- 2번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                  벤투호 상대로 힘도 못 썼던 우루과이 간판 FW, 브라질행 임박</a>
              </td>
              <!-- 2번 -->
              <td>
                카타르 월드컵에서 벤투호를 상대로 힘도 못 쓰면서 가장 먼저 교체로 물러났던 우루과이 간판 공격수 루이스 수아레스가 브라질로 간다.<br>
                캄페오나투 브라질레이루 세리 A로 승격한 그레미우와 계약을 맺었다는 보도다.<br>
                본 매체(골닷컴) 브라질 에디션은 24일(한국시간) 과거 리버풀(잉글랜드)과 바르셀로나(스페인) 등에서 스타 플레이어로 명성을 떨쳤던 <br>
                수아레스는 그레미우에 입단하기로 구두 합의를 마쳤다.<br>
              </td>
              <!-- 3번 -->
              <td>밤낮고구마</td>
              <!-- 4번 -->
              <td>2022.12.25</td>
              </tr>

              <!-- 3번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                  [오피셜] 대한민국, 12월 FIFA 랭킹 25위…브라질 1위·아르헨 2위·일본 20위</a>
              </td>
              <!-- 2번 -->
              <td>
                대한민국 축구 국가대표팀이 12월 국제축구연맹(FIFA) 세계 랭킹 25위에 올랐다.<br>
                아시아축구연맹(AFC) 내 순위에서는 일본과 이란에 이어 3위 자리를 유지했다.<br>
                카타르 월드컵 성적에 따라 순위에 많은 변화가 생긴 가운데, 대한민국 축구 국가대표팀은 9.19점 오르면서 랭킹 포인트 1539.49점으로 25위에 자리했다.<br>
              </td>
              <!-- 3번 -->
              <td>강동훈 기자</td>
              <!-- 4번 -->
              <td>2022.12.23</td>
              </tr>

              <!-- 4번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                  ‘극적 16강 결정’ 벤투호 스마트폰 시청, 카타르 월드컵 10대 명장면</a>
              </td>
              <!-- 2번 -->
              <td>
                대한민국 축구 대표팀이 극적으로 16강행을 확정 지었던 포르투갈전 이후 스마트폰 시청이 전 세계가 주목하는 월드컵 명장면 중 하나로 선택 받았다.<br>
                로이터 통신은 지난 18일(현지시간) 2022 국제축구연맹(FIFA) 카타르 월드컵 명장면 베스트 10을 발표 했다.<br>
                이어 마침내 16강 진출이 확정되자 한국 선수들은 감격에 젖은 팬들을 향해 달려갔다라고 선정 이유를 설명했다.<br>
              </td>
              <!-- 3번 -->
              <td>sportalkorea</td>
              <!-- 4번 -->
              <td>2022.10.17</td>
              </tr>
          </tbody>
      </table>

          <div class="text-end">
            <a href="/board/form" class="btn btn-primary">글쓰기</a>
          </div>
    </div>












    </div>
    <!--footer-->
    <footer class="container-fluid text-bg-dark text-center">
        <div class="mt-5 p-4 bg-dark text-white">
          <address>
            본 페이지는 상업적 목적이 아닌 개인 포트폴리오용으로 제작되었습니다.<br>
            &copy; 2023 Lee, Jae-Hyun. All Rights Reserved.
          </address> 
        </div>
      </footer>
    <!--footer-->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" 
    crossorigin="anonymous"></script>  
     
</body>
</html>