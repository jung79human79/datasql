-- 주문테이블에서 CUST005고객이 주문한 제품의 이름을 출력
select p.product_name
from customer_product cp
inner join product p
on cp.product_number=p.product_number
where cp.customer_id='CUST005';

update  product set inventory=-1       -- 에러 inventory범위때문
where product_number=5;

-- 주문테이블에서 나이가 30세이상인 고객이 주문한 제품의 번호와 주문일자
-- (제품번호 주문일자)
select cp.product_number, cp.order_date
from customer c
inner join customer_product cp
on c.customer_id = cp.customer_id
where c.age>=30;

-- 고객테이블에서 적립금 평균이 80원 이상인 등급에 대해 
-- 등급별 고객수와 적립금 평균을 출력 
select rating,count(*) cnt, avg(reserves) 평균
from customer c
group by rating
having 평균>=80;           -- having avg(reserves)>=80;

-- 고객테이블에서 적립금이 가장 많은 고객의 고객이름과 적립금을 출력
-- 서브쿼리
select customer_name, reserves
from customer c
where reserves =(
 select max(reserves) from customer c
 );
 
 -- 주문테이블에서 CUST005고객이 주문한 제품의 이름과 제조업체를 출력
 select p.product_name,p.manufacturer
 from product p
 where p.product_number in(
 select cp.product_number
 from customer_product cp
 where cp.customer_id
 );
