<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />

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
    <div class="fs-1 fw-bold text-bg-warning text-center">Board EDIT</div>
    <div class="container">
      <form action="/board/list" method="post">
        <table class="table">
          <thead>
            <tr>
              <th class="fs-2">/board/edit</th>
            </tr>
            <td></td>
          </thead>
          <tbody>
            <!-- 첫번째 -->
            <tr>
              <th>title</th>
                <td>
                <input class="form-control" type="text"  name="title" id="" value="제목"/>
                </td>
            </tr>
            <!-- 두번째 -->
            <tr>
              <th>content</th>
              <td>
                <div class="h-50">
                  <textarea class="form-control" name="" id="" cols="30" rows="10">내용</textarea>
                </div>
              </td>
            </tr>
            <!-- 세번째 -->
            <tr>
              <th>userName</th>
              <td>
                <input class="form-control" type="text" name="userName" id="" />
              </td>
            </tr>
            <!-- 네번째 -->
            <tr>
              <th>date</th>
              <td>
                <input class="form-control" type="text" name="date" id="" />
              </td>
            </tr>
          </tbody>
        </table>
                <div class="text-end">
                     <button class="btn btn-outline-primary fw-bold" type="submit">
                         수정완료</button>
                </div>
      </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" 
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" 
    crossorigin="anonymous"></script> 
  </body>
</html>