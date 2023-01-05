<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h3><div>여기는 form입니다.</div> </h3>
    <hr class="bg-1">
    <form action="/board/form" method="post">
        <div>
        <input type="text" name="title" id="">
        </div>
        <div>
             
           <a href="/board/list"><button>Submit 하면 list로 돌아간다구</button></a>
        </div>
    </form>   
</body>
</html>