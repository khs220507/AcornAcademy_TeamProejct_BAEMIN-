use baemin_db;

-- 01 회원 user_tbl
create table user_tbl(
    userCode int auto_increment primary key,
    userId varchar(20) not null,
    userPw varchar(30) not null,
    userName varchar(20) not null,
    userNickname  varchar(20) not null,
    userPhone varchar(50) not null,
    userAddress varchar(150) not null,
    userEmail varchar(50) not null,
    userBirth varchar(20) not null,
    userGender tinyint(1) not null, -- 0:남자, 1:여자
    userStatus tinyint(1) not null -- 0:회원탈퇴, 1:정상회원
) auto_increment=10001;

INSERT INTO user_tbl (userId, userPw, userName, userNickname, userPhone, userAddress, userEmail, userBirth, userGender, userStatus)
VALUES
  ('user001', 'password1', 'John Doe', 'johndoe', '123-456-7890', '123 Main St, City, Country', 'john.doe@email.com', '1990-01-15', 0, 1),
  ('user002', 'password2', 'Jane Smith', 'janesmith', '987-654-3210', '456 Elm St, City, Country', 'jane.smith@email.com', '1985-08-22', 1, 1),
  ('user003', 'password3', 'Alice Johnson', 'alice', '555-123-7890', '789 Oak St, City, Country', 'alice.johnson@email.com', '1995-03-10', 1, 1),
  ('user004', 'password4', 'Bob Williams', 'bob', '111-222-3333', '101 Pine St, City, Country', 'bob.williams@email.com', '1982-11-05', 0, 1),
  ('user005', 'password5', 'Eva Brown', 'eva', '222-333-4444', '222 Cedar St, City, Country', 'eva.brown@email.com', '1988-07-28', 1, 1);






-- 02 사장 seller_tbl
create table seller_tbl(
	sellerRegCode int auto_increment primary key,
    sellerId varchar(20) not null,
    sellerPw varchar(30) not null,
    sellerName varchar(20) not null,
    sellerPhone varchar(50) not null,
    sellerEmail varchar(50) not null,
    sellerBirth varchar(20) not null,
	sellerGender tinyint(1) not null, -- 0:남자, 1:여자
    sellerStatus  tinyint(1) not null -- 0:회원탈퇴, 1:정상회원
)auto_increment=20001;

INSERT INTO seller_tbl (sellerId, sellerPw, sellerName, sellerPhone, sellerEmail, sellerBirth, sellerGender, sellerStatus)
VALUES
  ('seller001', 'password1', 'John Seller', '123-456-7890', 'john.seller@email.com', '1980-05-12', 0, 1),
  ('seller002', 'password2', 'Jane Vendor', '987-654-3210', 'jane.vendor@email.com', '1975-10-28', 1, 1),
  ('seller003', 'password3', 'Alice Merchant', '555-123-7890', 'alice.merchant@email.com', '1990-03-15', 1, 1),
  ('seller004', 'password4', 'Bob Retailer', '111-222-3333', 'bob.retailer@email.com', '1983-07-19', 0, 1),
  ('seller005', 'password5', 'Eva Shopkeeper', '222-333-4444', 'eva.shopkeeper@email.com', '1987-12-03', 1, 1);




-- 03. 태민 store_tbl

CREATE TABLE store_tbl (
  storeCode INT AUTO_INCREMENT PRIMARY KEY, 	-- 매장코드
  storeName VARCHAR(50) NOT NULL,    		-- 매장이름
  storeCategory VARCHAR(50) NOT NULL,  		-- 음식 카테고리
  storeImage VARCHAR(200),   			-- 매장사진
  storeAddress VARCHAR(200) default '',  	-- 매장주소
  storePhone VARCHAR(12) NOT NULL,    		-- 매장전화번호
  zzimCount INT default 0,             		-- 찜개수
  reviewCount INT default 0,           		-- 리뷰수
  storeRating DECIMAL(3, 1) default 0,  	-- 매장평점
  storeDescription VARCHAR(1000),     		-- 매장소개글
  minOrderPrice INT NOT NULL,        		-- 최소주문금액
  deliveryFee INT NOT NULL,           		-- 배달비
  operatingTime VARCHAR(50) NOT NULL, 		-- 운영시간
  deliveryArea VARCHAR(50) NOT NULL,  		-- 배달지역
  storeStatus TINYINT NOT NULL        		-- 가게 상태(0:close, 1:open)
) auto_increment = 30001;

INSERT INTO store_tbl (storeName, storeCategory, storeImage, storeAddress, storePhone, zzimCount, reviewCount, storeRating, storeDescription, minOrderPrice, deliveryFee, operatingTime, deliveryArea, storeStatus)
VALUES
  ('Tasty Bites', 'Fast Food', 'tastybites.jpg', '123 Main Street, City, Country', '555-123-4567', 100, 50, 4.2, 'Delicious fast food for everyone.', 15, 3, '10:00 AM - 10:00 PM', 'Local Area', 1),
  ('Pizza Palace', 'Pizza', 'pizzapalace.jpg', '456 Elm Street, City, Country', '777-987-6543', 150, 75, 4.5, 'Home of the best pizza in town!', 20, 5, '11:00 AM - 11:00 PM', 'Citywide', 1),
  ('Sushi Delight', 'Japanese', 'sushidelight.jpg', '789 Oak Street, City, Country', '333-555-7890', 120, 60, 4.4, 'Authentic Japanese sushi and more.', 25, 5, '12:00 PM - 10:00 PM', 'Local Area', 1),
  ('Burger Haven', 'Burgers', 'burgerhaven.jpg', '101 Pine Street, City, Country', '111-222-3333', 80, 40, 4.0, 'Serving mouthwatering burgers.', 10, 2, '10:30 AM - 9:00 PM', 'Local Area', 1),
  ('Healthy Eats', 'Salads', 'healthyeats.jpg', '222 Cedar Street, City, Country', '222-333-4444', 60, 30, 4.3, 'Fresh and healthy salads to boost your day.', 12, 3, '9:00 AM - 8:00 PM', 'Local Area', 1);



-- 04 태민 menu_tbl;

CREATE TABLE menu_tbl (
  menuCode INT AUTO_INCREMENT PRIMARY KEY,     	-- 메뉴코드
  menuName VARCHAR(50) NOT NULL,        	-- 메뉴이름
  menuPrice INT default 0,                     	-- 메뉴가격
  menuImage VARCHAR(50),      			-- 메뉴사진
  menuContent TEXT NOT NULL,           		-- 메뉴설명
  menuClassification VARCHAR(50) NOT NULL, 	-- 메뉴분류
  menuStatus TINYINT NOT NULL           	-- 메뉴상태(0:open, 1:sold out)
) auto_increment = 40001;

INSERT INTO menu_tbl (menuName, menuPrice, menuImage, menuContent, menuClassification, menuStatus)
VALUES
  ('Classic Burger', 10, 'classic_burger.jpg', 'A delicious classic beef burger with all the fixings.', 'Burgers', 0),
  ('Margherita Pizza', 12, 'margherita_pizza.jpg', 'A simple and tasty pizza with tomato, mozzarella, and basil.', 'Pizza', 0),
  ('Sushi Platter', 20, 'sushi_platter.jpg', 'A chefs selection of assorted sushi rolls and sashimi.', 'Japanese', 0),
  ('Greek Salad', 8, 'greek_salad.jpg', 'Fresh and healthy salad with lettuce, tomatoes, olives, and feta cheese.', 'Salads', 0),
  ('Chocolate Brownie', 5, 'chocolate_brownie.jpg', 'Rich and decadent chocolate brownie topped with a scoop of vanilla ice cream.', 'Desserts', 0);




-- 05. 옵션 option_tbl
create table option_tbl (
    optionCode int auto_increment primary key,
    menuCode int,
    optionCategory varchar(255),
    optionSelectType tinyint,
    optionName varchar(255),
    optionPrice int, 
    optionStatus tinyint
)auto_increment = 50001;

INSERT INTO option_tbl (menuCode, optionCategory, optionSelectType, optionName, optionPrice, optionStatus)
VALUES
  (1, 'Toppings', 1, 'Extra Cheese', 2, 1),
  (2, 'Crust', 1, 'Stuffed Crust', 3, 1),
  (3, 'Sauce', 1, 'Extra Marinara', 1, 1),
  (1, 'Toppings', 1, 'Bacon Bits', 2, 1),
  (4, 'Size', 2, 'Large', 5, 1);


-- 06. 장바구니 cart_tbl 테이블 생성
create table cart_tbl (
    cartCode int auto_increment primary key,
    userCode int,
    storeCode int,
    menuCode int,
    optionCode int,
    menuCount int,
    cartPrice int,
    optionStatus tinyint,
    foreign key (userCode) references user_tbl(userCode),
    foreign key  (storeCode) references store_tbl(storeCode),
    foreign key  (menuCode) references menu_tbl(menuCode),
    foreign key  (optionCode) references option_tbl(optionCode)
)auto_increment = 60001;

INSERT INTO cart_tbl (userCode, storeCode, menuCode, optionCode, menuCount, cartPrice, optionStatus)
VALUES
  (10001, 30001, 40001, 50001, 2, 20, 1),
  (10002, 30002, 40002, 50002, 1, 15, 1),
  (10003, 30003, 40003, 50003, 3, 45, 1),
  (10004, 30001, 40004, 50004, 2, 16, 0),
  (10005, 30002, 40005, 50001, 1, 10, 1);





-- 07
CREATE TABLE order_tbl (
    orderNumber INT AUTO_INCREMENT PRIMARY KEY,
    userCode int,
    storeCode int,
    orderDate DATE,
    payType TINYINT(1) UNSIGNED,
    orderType TINYINT(1) UNSIGNED,
    reqToSeller VARCHAR(300),
    reqToRider VARCHAR(300),
    orderStatus VARCHAR(20),
    FOREIGN KEY (userCode) REFERENCES user_tbl(userCode),
    FOREIGN KEY (storeCode) REFERENCES store_tbl(storeCode)
) AUTO_INCREMENT = 70001;

INSERT INTO order_tbl (userCode, storeCode, orderDate, payType, orderType, reqToSeller, reqToRider, orderStatus)
VALUES
  (10001, 30001, '2023-10-30', 1, 1, 'No onions on the burger.', 'Leave at the front door.', 'Pending'),
  (10002, 30002, '2023-10-30', 2, 2, 'Extra ketchup and napkins.', 'Call before arrival.', 'In Progress'),
  (10003, 30003, '2023-10-30', 1, 3, 'Spicy, please!', 'Leave at the side gate.', 'Delivered'),
  (10004, 30001, '2023-10-30', 2, 1, 'No mayo, extra cheese.', 'Ring the doorbell.', 'Pending'),
  (10005, 30002, '2023-10-30', 1, 2, 'Extra pickles and mustard.', 'Leave at the back door.', 'In Progress');



-- 08
CREATE TABLE zzim_tbl (
    userCode int,
    storeCode int,
    FOREIGN KEY (userCode) REFERENCES user_tbl(userCode),
    FOREIGN KEY (storeCode) REFERENCES store_tbl(storeCode)
);


INSERT INTO zzim_tbl (userCode, storeCode)
VALUES
  (10001, 30001),
  (10002, 30002),
  (10003, 30003),
  (10004, 30001),
  (10005, 30002);


-- 09
CREATE TABLE review_tbl (
    reviewCode INT AUTO_INCREMENT PRIMARY KEY,
    menuCode int,
    userCode int,
    storeCode int,
    reviewImage VARCHAR(20) NOT NULL,
    reviewDate DATE NOT NULL,
    reviewRating INT NOT NULL,
    reviewContent VARCHAR(300) NOT NULL,
   FOREIGN KEY (menuCode) REFERENCES menu_tbl(menuCode),
   FOREIGN KEY (userCode) REFERENCES user_tbl(userCode),
   FOREIGN KEY (storeCode) REFERENCES store_tbl(storeCode)
) AUTO_INCREMENT=90001;

-- Insert 5 sample review records
INSERT INTO review_tbl (menuCode, userCode, storeCode, reviewImage, reviewDate, reviewRating, reviewContent)
VALUES
  (40001, 10001, 30001, 'review_image1.jpg', '2023-10-30', 5, 'Excellent burger! It was perfectly cooked and very tasty.'),
  (40002, 10002, 30002, 'review_image2.jpg', '2023-10-29', 4, 'Great pizza, but delivery was a bit slow.'),
  (40003, 10003, 30003, 'review_image3.jpg', '2023-10-28', 3, 'Average sushi, but the ambiance was nice.'),
  (40004, 10004, 30001, 'review_image4.jpg', '2023-10-27', 5, 'The burger was fantastic, and the delivery was fast!'),
  (40005, 10005, 30002, 'review_image5.jpg', '2023-10-26', 4, 'Delicious pizza, but the toppings could have been more generous.');






-- 10
CREATE TABLE answer_tbl (
    answerCode int AUTO_INCREMENT PRIMARY KEY,
    reviewCode int,
    answerDate DATE NOT NULL,
    answerContent VARCHAR(300) NOT NULL,
    FOREIGN KEY (reviewCode) REFERENCES review_tbl(reviewCode)
) AUTO_INCREMENT=100001;

-- Insert 5 sample answer records
INSERT INTO answer_tbl (reviewCode, answerDate, answerContent)
VALUES
  (90001, '2023-10-30', 'Thank you for your positive feedback. We are glad you enjoyed the burger!'),
  (90002, '2023-10-29', 'We apologize for the delay in delivery. We will work on improving our service.'),
  (90003, '2023-10-28', 'We appreciate your feedback. We will strive to improve the sushi quality.'),
  (90004, '2023-10-27', 'We are delighted you liked the burger and fast delivery! Thank you for your review.'),
  (90005, '2023-10-26', 'Thank you for your feedback. We will consider your input on the pizza toppings.');


-- 11 태민 address_tbl;

CREATE TABLE address_tbl (
  addressCode INT AUTO_INCREMENT PRIMARY KEY,			-- 주소코드
  userCode INT,						-- 회원코드
  deliveryAddress VARCHAR(200) NOT NULL,				-- 배달주소
  FOREIGN KEY (userCode) REFERENCES user_tbl(userCode)	-- 회원코드 참조하는 곳
) auto_increment = 110001;

-- Insert 5 sample address records
INSERT INTO address_tbl (userCode, deliveryAddress)
VALUES
  (10001, '123 Main Street, Apt 101, City, Country'),
  (10002, '456 Elm Avenue, Unit 202, Town, Country'),
  (10003, '789 Oak Road, Suite 303, Village, Country'),
  (10004, '321 Pine Lane, Building 404, Suburb, Country'),
  (10005, '654 Maple Drive, Flat 505, Hamlet, Country');




-- Drop all tables
DROP TABLE cart_tbl;
DROP TABLE order_tbl;
DROP TABLE answer_tbl;
DROP TABLE zzim_tbl;
DROP TABLE review_tbl;
DROP TABLE address_tbl;
DROP TABLE option_tbl;
DROP TABLE menu_tbl;
DROP TABLE store_tbl;
DROP TABLE seller_tbl;
DROP TABLE user_tbl;



SHOW TABLES;


