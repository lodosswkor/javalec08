-- SQL 문 
-- Ansi SQL 문 (모든 데이터베이스 시스템에서 사용가능)
-- Ansi SQL + 자체 SQL => 데이터베이스 밴더가 사용 
-- MSSQL 자체 SQL문을 T-SQL (Transaction SQL) 
-- Oracle 자체 SQL문을 PL/SQL

-- SQL문의 주석(한줄 주석) 
/*
    여러줄 주석 
*/

-- CRUD
-- DML(Data Manipulation Language) - 데이터 조작어 
-- C : Create (생성) - INSERT 
-- R : Read - SELECT 
-- U : Update - Update
-- D : Delete - Delete

-- DDL - 데이터베이스 관리/정의 
-- ( 데이터베이스를 생성하거나 정의) 
-- C : Create - Create  
-- R : Read - show 
-- U : Update - Update 
-- D : Delete - Drop 


SELECT * FROM user; -- 조건을 부여가능 Where 절
-- user 테이블에서 id 가 rdsadmin 인 rows만 가져와 
SELECT * FROM user WHERE user = 'rdsadmin'; 
-- Select_priv 컬럼이 Y고 Host가 localhost인 모든 
-- 데이터를 가지고 와라 
SELECT HOST, user, select_priv
FROM user WHERE select_priv = 'Y' AND HOST = 'localhost'
-- OR

 

 

