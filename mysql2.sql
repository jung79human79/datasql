-- Q : 모든 고객의 정보를 출력하세요alter
-- CRUD 연습

select * from t_customer;                        -- read가 중요
select customer_name,phone from t_customer;
-- insert into t_customer(customer_name, phone, email, address, region_code)    따옴표가 잘못됨
-- values('손흥민','010-1234-7894',‘son@gmail.com’,'서울특별시 강남구 삼성동',‘02’);
-- insert into t_customer(customer_name, phone, email, address, region_code)
-- values('박태환',‘010-1234-5555’,‘park@gmail.com’,'제주특별자치도 제주시 일도',‘064’);

insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02');

insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

-- Q : 손흥민 고객의 주소를 수정하세요.
update t_customer set address='서울특별시 강남구 일동' where id=7;             -- where = pk가 조건

-- Q : 홍길동 고객을 삭제하세요.
delete from t_customer where id=1;      -- 반드시 pk를 줘야함,한사람만 선택되야 하므로~   id1인 사람이 구매테이블에 구매한 것이 있으므로 삭제가 안됨 -- 구매 정보에서 삭제를 해야 삭제됨
select * from t_sales;                   


-- Q. 서울에 거주하는 고객을 출력하세요. 
 select * from t_customer where region_code='02';    
 
 
-- Q. 박태환 고객이 물건(노토)을 2개를 주문했을 경우 구매 테이블에 입력하세요. 
 insert into t_sales(customer_id, product_code, qty) values(8,'P003',2);
 select * from t_product;
 
 -- Q2. 특정 지역(예: '서울특별시')에 사는 고객의 이름과 전화번호를 가져오는 질의:
 SELECT customer_name, phone      --  read=SELECT
FROM t_customer
WHERE region_code = '02';

-- q. 모든 고객의 정보를 출력하세요 단 고객번호 , 이름 ,지역명)   조인하는 방법 =연결 공동키값이 있어야함 
select *                                             -- 두테이블 전체표현
FROM t_customer tc                                   -- 테리블명 약어 tc, ;안넣음, t_customer as tc에서 as는 생략가능
inner join t_region tr
on tc.region_code=tr.region_code;                    -- 같은 것들을 =로 표시

select tc.id, tc.customer_name, tr.region_name       -- tc. tr. 을 적음(테이블소속) 컬럼이 중복될수도 있으므로 region_code만 적으면 안됨 tr.region_code를 적는다.
FROM t_customer tc                                    -- 테리블명 약어 tc ;안넣음
inner join t_region tr                               -- inner join은 교집합
on tc.region_code=tr.region_code;                    -- on조건절 같은 것들을 =로 표시

-- right join   지역테이블 기준           -- 전체 지역이 나온다. 교집합도 나오고 오른쪽(지역테이블)을 기준으로 다 출력 (영상참고)
-- left join    고객테이블 기준           -- 왼쪽(고객테이블)을 기준으로 다 출력

