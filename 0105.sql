INSERT INTO Student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);
select * from student;

-- 학과
-- Insert data into department table
INSERT INTO  department (department_name) VALUES
('컴퓨터공학과'),
('국어국문과'),
('정보통신과'),
('전자공학과');
select * from department;



-- 국어 국문과에 다니는 학생을 출력하세요(학과명 학생이름).

select s.student_name,d.department_name
from student s
inner join department d
on s.department_code=d.department_code;

select d.department_name, count(*) as cnt     -- 반드시 그룹바이 컬럼을 적어여 함  *은 특정 컬럼
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name;

-- 국어 국문과에 다니는 학생을 출력하세요(학과명 학생이름).
select d.department_name,s.student_name             -- where절에 컬럼을 적는다.
from department d
inner join student s
on s.department_code = d.department_code
where d.department_name='국어국문과';                       

-- 학생 이름이 바로 시작하는 학생이름만 출력
select * from student
where student_name like '바%' ;              -- 바로 시작하고 뒤에는 머든 상관 없다

select * from student
where student_name like '%길동' ;             -- 

select * from student
where student_name like '%길%' ;             -- like 는 검색   

-- 학생의 키가 170이상 180이하인 학생만~(논리연산자)               -- 170이상만 이면 관계연산자
  select * from student
  where student_height>=170 and student_height<=180;    
  
  select * from student
  where student_height between 170 and 180;         -- 위와 같은 표현
  
  -- 키가 가장 큰 사람이름 출력
  select student_name from student
  order by student_height desc
  limit 1;                                   -- 페이징 처리 점프 옵셋
  
  
  
  



