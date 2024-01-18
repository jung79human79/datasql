-- 데이터 베이스 
create database jdbctest;

-- bigdatamember 테이블 생성
-- column
-- id 문자(50) 기본키
-- pw 문자(100) not null
-- b_name 문자(50) not null
-- age 숫자
-- score 숫자

CREATE TABLE jdbctest.bigdatamember (
id VARCHAR(50) PRIMARY KEY,
pw VARCHAR(100) not null,
b_name VARCHAR(50) not null,
age INT,
score INT
);
commit;
select * from bigdatamember;

