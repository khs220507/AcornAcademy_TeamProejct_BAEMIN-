<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
       <style>
       /* 태그 파트 */
       *{
			margin: 0;
			padding: 0;
            box-sizing: border-box;
		}
       a{
			text-decoration: none;
		}
        header{
            background-color: #48D1CC;
            height: 100px;
        }
        section{

        }
        footer{

        }
		button{
			outline: none;	
			cursor: pointer;	/* 손가락모양 */
		} 

        /* 해더 */
        .header-wrap{
            width: 1280px;
            border: 1px solid black;
            height: 100px;
            margin: 0 auto;
        }
        /* 세션 */
        .section-line{
            width: 100%;
            height: 50px;
            margin: 0 auto;
            border-bottom: 2px solid gainsboro;
        }
        .section-wrap{
            margin: 0 auto;
            width: 60%;
        }
        .store-list{
            height: 150px;
            display: flex;
            border-bottom: 1px solid gray;
        }
        .store-img-wrap{
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .store-img{
            width: 100px;
            height: 100px;
            background-color: yellowgreen;
        }
        .store-info-wrap{
            flex: 4;
            display: flex;
            align-items: center;
        }
        .store-info,.store-info2{
           padding: 10px;
           flex: 1;
           font-weight: bolder;
        }
        .store-but-wrap{
            display: flex;
            justify-content: center;
            align-items: center;
            flex: 1;
            
        }
        .store-but{
            display: flex;
            width: 110px;
            justify-content: space-between;
        }
        .store-but div{
            padding: 5px;
            text-align: center;
            background-color: gainsboro;
            width: 50px;
            border-radius: 5px;
        }
        .store-plus{
            padding: 40px 20px 20px 20px;
            border-bottom: 1px solid gray;
            display: none;
        }
        .store-plus-info{
            width: 320px;
            margin: 0 auto;
            text-align: right;
            padding: 5px;
        }
        .store-plus-info span{
            font-size: 20px;
            font-weight: bolder;
        }
        .store-plus div input{
            height: 35px;
            margin-left:15px;
        }
        .store-plus-but{
            margin: 20px auto 20px auto;
            padding: 5px;
            width: 100px;
            border-radius: 10px;
            background-color: gainsboro;
            text-align: center;
        }
        .plus-but{
            height:  150px;
            border-bottom: 1px solid gray;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .plus-but div{
            width: 100px;
            height: 100px;
            border-radius: 50%;
            background-color: gray;
            display: flex;
            justify-content: center;
            align-items: center;
            cursor: pointer;
            
            
        }
        .plus-but span{
            
            font-size: 100px;
            color: white;
            margin-bottom:20px ;
            
        }
        
        .section-wrap, .store-img-wrap, .store-img,  .store-info-wrap  ,.store-info,.store-info2,.store-but-wrap,.store-but,.store-plus,.store-plus-img{


        }
        /* 풋터 */
    </style>
    <script>
    $(document).ready(function() {
            $("#plus-click").click(function(){
            	$("#store-plus").css("display","block"),
            	$("#plus-but").css("display","none");
            })
        })
    </script>
<title>Insert title here</title>
</head>
<body>
 <header>
        <div class="header-wrap">해더</div>
    </header>
   <section>
        <div class="section-line"></div>
        <div class="section-wrap">
            <div class="store-list">
                <div class="store-img-wrap">
                    <div class="store-img">

                    </div>
                </div>
                <div class="store-info-wrap">
                    <div class="store-info">
                        <div>교촌치킨 홍대점</div>
                        <div>⭐4.8(+100)</div>
                        <div>최소주문: 15000</div>
                    </div>
                    <div class="store-info2">
                        <div>
                            10년동안 자리를 지켰습니다. 정성껏 
                            요리하겠습니다.
                        </div>
                    </div>
                </div>
                <div class="store-but-wrap">
                    <div class="store-but">
                        <div>수정</div>
                        <div>삭제</div>
                    </div>
                </div>
            </div>
           
            <div class="store-plus" id="store-plus"> 
                <div class="store-plus-info">
                    <span>매장이름</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>음식카테고리</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>매장사진</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>매장주소</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>매장전화번호</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>최소주문금액</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>배달비</span><input type="text">
                </div>
                <div class="store-plus-info">
                    <span>배달지역</span><input type="text">
                </div>
                <div class="store-plus-but">
                    저장하기
                </div>
            </div>

            <div class="plus-but" id="plus-but" >
                
                <div id="plus-click" ><span>+</span></div>    
               
            </div>
        </div>

        

    </section>
    <footer>

    </footer>
</body>
</html>