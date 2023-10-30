<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script> 
<meta name="viewport" content="width=device-width,initial-scale=1">
<style>
   /* reset css */
        a{
            text-decoration: none;
        }
            
        button{
            outline: none;	
            cursor: pointer;	/* 손가락모양 */
        }
        *{
          margin: 0;
          margin: 0;
          padding: 0;
          box-sizing: border-box;
        }
        body{
          display: flex;
          flex-direction: column;
          align-items: center;
          height: 100vh;
        }
        /* 섹션  ////////////////////////////////////////////////////*/
        section{
          flex: 7.3;
          width: 1280px;
          border: 1px solid black;
          
          overflow-y: auto; /*섹션의 내용이 넘치는 경우 스크롤이 가능*/
        }
    
        /* 푸터  ////////////////////////////////////////////////////*/
        footer{
          flex: 1.5;
          width: 1280px;
          border: 1px solid black;
        }
      </style>
</head>
<body>

	<jsp:include page="../base/header.jsp"/>

      <section>
      	
      	<c:forEach items="${zzimList }" var="zzimList">
      	${zzimList}
      	</c:forEach>
      
      </section>

      <footer></footer>

</body>
</html>