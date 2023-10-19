-- 한줄주석 
/* 여러줄 주석 */
/* SQL문에서 문자열은 'A' 싱글쿼테이션 사용 */
/*
   기본 SQL 
   Insert, Select, Update, Delete 
   ( CRUD ) 
*/

SHOW DATABASES; -- DBMS에 있는 모든 데이터베이스를 보여줘라

-- 데이터베이스 생성 
CREATE DATABASE javalec08; 

-- javalec08 데이터베이스를 사용하겠다 (javalec08 폴더를 열어주세요) 
USE javalec08; 

-- 데이터를 담을 excel 파일을 만들어보자 
-- 데이터베이스는 excel -> table 이라고 함. 
-- CREATE TABLE 테이블명 ( 옵션 ); 
CREATE TABLE test_table (
   user_no INT, 
   user_name VARCHAR(50) 
); 

-- 현재 선택된 데이터베이스에 모든 테이블을 가지고 오삼. 
SHOW TABLES; 


-- Read (데이터 꺼내기) - Select 
-- SELECT 대상컬럼, 혹은 전체(*) FROM 테이블명 
SELECT * FROM test_table; 

-- Create (데이터 생성) - Insert 
-- Insert into 테이블명 (컬럼1,컬럼2....) 
-- values (데이터1, 데이터2) 
INSERT INTO test_table (user_no, user_name) VALUES (1, '이종석');
INSERT INTO test_table (user_no, user_name) VALUES (2, '박은진');
INSERT INTO test_table (user_no, user_name) VALUES (3, '이지우');


-- (U)pdate (데이터 수정) -- update
-- update 테이블명 set 변경할컬럼1=값, 변경할컬럼2=값.. 
-- Where 비교컬럼1=값 
UPDATE test_table SET user_name = '이종석A'; 
-- 전체 데이터(Rows)의 user_name 컬럼이 모두 바뀐다. 
UPDATE test_table SET user_name = '이종석' WHERE user_no = 1; 
-- user_no가 2이상인 데이터의 user_name을 AAA로 바꿔라. 
UPDATE test_table SET user_name = 'AAA' WHERE user_no >= 2; 
-- Where 조건 
-- && => AND 
-- || => OR 
-- == => = 
-- >=,<=,>,< =>,>=,<=,>,<
-- user_no >= 1 이고(AND) user_name이 '이종석'인 데이터의 user_name을 
-- 'BBB'로 변경하라. 
UPDATE test_table SET user_name = 'BBB' WHERE user_no >= 1 
AND user_name = '이종석';


UPDATE test_table SET user_name = '이종석' WHERE user_no >= 2 
AND user_name = 'AAA';


-- (D)elete -- Delete (데이터삭제) 
-- DELETE FROM 대상테이블 WHERE ....
-- user_name 이 BBB인 사람만 삭제하겠다. 
DELETE FROM test_table WHERE user_name = 'BBB'; 
  
  
-- 난 javalec08 데이터베이스의 test_table이라는 테이블을 아에 삭제하고싶다
-- drop table 테이블명 : drop table test_table;
DROP TABLE test_table;

-- javalec08이라는 데이터베이스(폴더)를 삭제하고 싶어. 
-- drop database 데이터베이스명 drop database javalec08 

DROP DATABASE javalec08; 



































