<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'
    integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>
    
</head>

<body>
    <header>
        <table border="1">
        <h3>
            list = 게시판 페이지<br>
            view = 선택 항목 상세보기 페이지<br>
            form = 항목 추가하는 페이지<br>
            edit = 수정 항목 페이지 
        </h3>          
        </table>     
    </header>

    <hr class="bg-1">    
   
    <h5>list -> view -> list</h5>
    <div><a href="/board/view">/board/view BoardController view() /board/view.jsp</a></div>
    <h5>list -> form -> form with Post -> list</h5>
    <div><a href="/board/form">/board/form BoardController form() /board/form.jsp</a></div>
   
    
    <hr class="bg-1">

    <h>되돌아가시겠습니까?</h>
    <a href="/src/main/webapp/WEB-INF/views/board/list.jsp" target ="_self">누르기</a> 

    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'
        integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'
        crossorigin='anonymous'></script>
    </div>
</body>
</html>