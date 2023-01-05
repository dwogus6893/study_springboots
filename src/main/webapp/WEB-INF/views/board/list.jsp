<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
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
        <h3><a href="" class="nav-link link-dark">title</a></h3>
        <h3><a href="" class="nav-link link-dark">content</a></h3>
        <h3><a href="" class="nav-link link-dark">userName</a></h3>
        <h3><a href="" class="nav-link link-dark">date</a></h3>
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
                      슬기를 떠난 진영, 틈을 노리는 종우 | 솔로지옥2</a
                    >
              </td>
              <!-- 2번 -->
              <td>
                    민수와 함께 천국도에 간 진영. 그사이 종우는 슬기의 마음을 얻으려
                    노력한다.
              </td>
              <!-- 3번 -->
              <td>Netflix Korea</td>
              <!-- 4번 --> 
              <td>2023.01.04</td>
              </tr>

              <!-- 2번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                [최초공개] LE SSERAFIM(르세라핌) - ANTIFRAGILE</a>
              </td>
              <!-- 2번 -->
              <td>
                #르세라핌 #르세라핌컴백쇼 #LESSERAFIMCOMEBACKSHOW #LESSERAFIM
                #ANTIFRAGILE
              </td>
              <!-- 3번 -->
              <td>Mnet M2 (엠투)</td>
              <!-- 4번 -->
              <td>2022.10.17</td>
              </tr>

              <!-- 3번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                [최초공개] LE SSERAFIM(르세라핌) - ANTIFRAGILE</a>
              </td>
              <!-- 2번 -->
              <td>
                #르세라핌 #르세라핌컴백쇼 #LESSERAFIMCOMEBACKSHOW #LESSERAFIM
                #ANTIFRAGILE
              </td>
              <!-- 3번 -->
              <td>Mnet M2 (엠투)</td>
              <!-- 4번 -->
              <td>2022.10.17</td>
              </tr>

              <!-- 4번째 줄 -->
              <tr>                         
              <!-- 1번 -->
              <td>
                <a href="/board/view" class="text-dark fw-bold" style="text-decoration: none">
                [최초공개] LE SSERAFIM(르세라핌) - ANTIFRAGILE</a>
              </td>
              <!-- 2번 -->
              <td>
                #르세라핌 #르세라핌컴백쇼 #LESSERAFIMCOMEBACKSHOW #LESSERAFIM
                #ANTIFRAGILE
              </td>
              <!-- 3번 -->
              <td>Mnet M2 (엠투)</td>
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