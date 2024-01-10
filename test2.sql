INSERT INTO t_cus (customer_num,customer_name,address)
VALUES    
(001, '가길동', '수원시'),
(002, '나길동', '안산시'),
(003, '조길동', '서울시'),
(004, '홍길동', '안양시');
select * from t_cus;

INSERT INTO  t_order (order_num,product_name,quantity,price,customer_num)
VALUES    
(001, '사과', 2, 300, 001),
(002, '우유', 3, 200, 001),
(003, '시금치', 4, 100, 002),
(004, '콜라', 7, 200, 002),
(005, '두부', 5, 300, 003),
(006, '햄버거', 2, 200, 003),
(007, '빵', 3, 100, 003),
(008, '감자', 1, 200, 003),
(009, '오이', 5, 100, 004);
select * from t_order;

SELECT customer_name,address,product_name, quantity, price
FROM t_cus tc
INNER JOIN t_order tr
ON tc.customer_num = tr.customer_num
where tc.customer_name='조길동';

SELECT sum(price) TOTAL
FROM t_cus  tc
INNER JOIN t_order tr
ON  tc.customer_num = tr.customer_num
WHERE tc.customer_num = '002';

update t_order set price=200 where order_num=9;

SELECT tc.customer_num, sum(tr.price) 금액
FROM t_cus  tc
INNER JOIN t_order  tr
ON tc.customer_num = tr.customer_num
GROUP BY tc.customer_num; 

SELECT tc.customer_num,tc.customer_name,tc.address
FROM t_cus tc
order by tc.customer_name desc;

update t_cus 
set customer_name ='홍길순', address= '인천시' 
where customer_num=4;

select tr.order_num ,tr.product_name
from t_order tr
where char_length(tr.product_name)=3;