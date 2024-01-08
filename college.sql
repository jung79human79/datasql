-- 학과
-- Insert data into department table
INSERT INTO  department (department_name) VALUES
('컴퓨터공학과'),
('국어국문과'),
('정보통신과'),
('전자공학과');
select * from department;

-- 학생
-- Insert data into Student table
INSERT INTO student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);
select * from student;
delete from student where student_id between 9 and 16;  -- 9번부터~16번까지 레코드 삭제 17번부터 레코드 기록됨.
delete from student where student_id=1 or student_id=8; -- 1번과 8번이 삭제
delete from student where student_id=2 and student_id=7; -- 교집합이므로 삭제없음
delete from student where student_id>=2 and student_id<=7;  -- 2번 부터 7번사이 레코드 삭제됨

DROP TABLE IF EXISTS Department;    -- 5 드랍순서 
DROP TABLE IF EXISTS student;         -- 2      
DROP TABLE IF EXISTS Professor;      -- 4
DROP TABLE IF EXISTS Course;           -- 3
DROP TABLE IF EXISTS Student_Course;    -- 1

--  학생의 학과 정보 출력 (학생이름 ,학과명)
select s.student_name,d.department_name
from student s
inner join department d
on s.department_code=d.department_code;

select  s.student_name,d.department_name                 -- 같은 표현
from student s, department d                             -- 연거푸 나오면 조인의 의미
where s.department_code=d.department_code;   

-- 학과별 학생수 (학과명 ,학생수)
select d.department_name, count(*) as cnt     -- 반드시 그룹바이 컬럼을 적어여 함  *은 특정 컬럼
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name;

-- 학생수가 2명인 이상인 학과를 출력 (-- group by having절)
select d.department_name, count(*) as cnt     -- 반드시 그룹바이 컬럼을 적어여 함  *은 특정 컬럼
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name
having cnt>=2;               -- having =group by한 최종 결과값에서 필터링하는 쿼리문(갯수가 2이상을 필터링)

-- 국어 국문과에 다니는 학생을 출력하세요(학과명 학생이름).
select d.department_name,s.student_name             -- 반드시 where절에 컬럼을 적는다.
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
                                          -- 웹으로 넘어갈 때 페이징 처리 쿼리어 ,점프 ,시작점 옵셋
                                          
INSERT INTO Professor (professor_name, department_code) VALUES
('가 교수', 1),
('나 교수', 1),
('다 교수', 2),
('빌 게이츠', 3),
('스티브 잡스', 4);
select * from Professor;

-- q. 컴퓨터공학과에 소속된 이름을 출력 (학과명 ,교수이름)
select d.department_name ,p.professor_name
from department d
inner join Professor p
on d.department_code= p.department_code
where d.department_name = '컴퓨터공학과' ;

-- q. 학과별 교수의 수를 출력   -- 학과별이므로 department_name
select department_name ,count(professor_name) as cnt
from department d
inner join Professor p
on d.department_code= p.department_code
group by  d.department_name ;

-- q 교수의 수가 2명 이상인 학과를 출력 
select department_name ,count(professor_name) as cnt
from department d
inner join Professor p
on d.department_code= p.department_code
group by  d.department_name 
having cnt>=2;                        -- 맨 마지막에 실행됨.

-- q. 가장 많은 학생이 있는 학과명과 학생수를 출력
select department_name ,count(*) as cnt
from student s
inner join  department d
on d.department_code= s.department_code
group by  d.department_name 
order by  cnt desc
limit 1;   

-- q. 다른방법

select max(department_code) 
from student ;

-- 가장많은 학생 수
select department_code, count(department_code) cnt 
from student
group by  department_code
having cnt>=4;

select department_code
from student
group by  department_code
having count(department_code)=4;

-- 가장많은 학생 수를 가진 학과명 서브쿼리
-- 영상참고(1/8일) 마지막 시간



-- 학생 중 성씨가 아인 학생이 속한 학과명과 학생명을 출력하세요
select department_name,student_name
from student s
inner join department d
on d.department_code= s.department_code
where student_name like '아%';

-- 학생중 키가 175~185 사이의 속하는 학생수를 출력
select count(student_id) as cnt
from student
where student_height between 175 and 185;

-- 다길동 학생과 같은 학과에 속한 학생의 이름을 출력
-- 서브쿼리 이용
-- 먼저 다길동이의 department_code를 구하고     -- 작은 select부터 만든다
-- 구한 department_code를 다시 학생테이블에서 같은 department_code의 학생들만 출력

select st.student_name
from student st
where st.department_code =
    (select s.department_code
	 from student s
     where  s. student_name = '다길동'
     );
     
-- 학과이름 별 키의 최고값과 평균값을 출력
select d.department_name, max(s.student_height) max, avg(s.student_height) avg
from department d
inner join student s
on d.department_code= s.department_code
group by d.department_name;            -- 학과이름으로 그룹화

-- 개설과목
INSERT INTO Course (course_name, professor_code, start_date, 
end_date) VALUES
('교양 영어', 1, '2023-07-01', '2023-08-15'),
('데이터베이스 입문', 2, '2023-07-01', '2023-08-31'),
('회로이론', 3, '2023-07-15', '2023-09-15'),
('공학수학', 4, '2023-07-15', '2023-09-30'),
('객체지향 프로그래밍', 5, '2023-07-01', '2023-08-31');
select * from Course;

-- 빌게이츠가 가리키는 과목이름과 교수이름
select c.course_name,p.professor_name
from Course c
inner join Professor p
on c.professor_code = p.professor_code
where p.professor_name ='빌 게이츠';

select ifnull(max(id),0)+1 from Student_Course;     -- 초기값 널값 만약5라면 5번까지 입력된것임 
-- 수식 넣기전 널체크 필수임 = 맥스를 구하는데 만약 널이면 0으로 치환 후 +1
-- 수강신청하면 1번부터 번호 생성

-- 수강
INSERT INTO Student_Course (id, student_id, course_code) VALUES
(1, 1, 1),             -- 대체키,자동증가 아님=max로 인위적으로 자동 증가, 널아님, pk아님, 유니크임
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4),
(6, 6, 5),
(7, 7, 5);
select * from Student_Course;

                                       