-- subquery
-- 1) from절의 서브쿼리
select now() as n, sysdate() as b, 3 + 1 as c;
select s.n, s.b, s.c from(select now() as n, sysdate() as b, 3 + 1 as c) s;

-- 2) where
select a.emp_no, a.first_name from employees a, dept_emp b where a.emp_no = b.emp_no and b.dept_no = 
(select b.dept_no from employees a, dept_emp b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' and concat(a.first_name, ' ' , a.last_name) = 'Fai Bale');

-- 2-1) where 절의 서브 쿼리 : 단일행
-- 단일행 연산자: =, > , < , >=, <=, <>, !=

-- 실습문제 1
select a.first_name, b.salary from employees a, salaries b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' 
and b.salary < (select avg(salary) from salaries where to_date = '9999-01-01' ) order by salary desc;

-- 실습문제 2
select b.title as n, avg(c.salary) as a from titles b, salaries c where b.emp_no = c.emp_no and c.to_date ='9999-01-01' and b.to_date = '9999-01-01'  group by b.title;
-- sol1.
select b.title as n, avg(c.salary) as a from titles b, salaries c where b.emp_no = c.emp_no and c.to_date ='9999-01-01' and b.to_date = '9999-01-01'  group by b.title having a = 
(select min(s.a) from(select b.title as n, avg(c.salary) as a from titles b, salaries c where b.emp_no = c.emp_no and c.to_date ='9999-01-01' and b.to_date = '9999-01-01'  group by b.title) as s);

-- sol2.
select b.title as n, avg(c.salary) as a from titles b, salaries c where b.emp_no = c.emp_no and c.to_date ='9999-01-01' and b.to_date = '9999-01-01'  group by b.title order by a asc limit 0, 1;

-- 2-2) where 절의 서브 쿼리 : 복수행
-- 복수행 연산자: in, not in, any, all

-- any 사용법
-- 1. =any : in과 동일
-- 2. >any, >=any : 최소값
-- 3. <any, <=any : 최대값
-- 4. <>any : not in 과 동일

-- all 사용법
-- 1. =all
-- 2. >all, >=all : 최대값
-- 3. <all, <=all : 최소값

-- 실습 문제 3
-- sol1
select a.first_name, b.salary from employees a, salaries b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' and (a.emp_no, salary) 
in (select emp_no, salary from salaries where to_date = '9999-01-01' and salary > 50000) order by b.salary asc;

-- sol2
select emp_no, salary from salaries where to_date = '9999-01-01' and salary > 50000 order by salary asc;
select a.first_name, b.salary from employees a, salaries b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' and b.salary > 50000 order by b.salary asc;

-- sol3
select a.first_name, b.salary from employees a, salaries b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' and (a.emp_no, salary) 
= any(select emp_no, salary from salaries where to_date = '9999-01-01' and salary > 50000) order by b.salary asc;

-- 실습 문제 4
-- 각 부서별로 최고 월급을 받는 직원의 이름과 월급을 출력 
-- 둘리 40000
select b.dept_no, max(salary) from dept_emp b , salaries c where b.emp_no = c.emp_no group by b.dept_no;

-- sol1: where subquery = any
select c.dept_no, a.first_name, b.salary from employees a, salaries b, dept_emp c where a.emp_no = b.emp_no and b.emp_no = 
c.emp_no and b.to_date = '9999-01-01' and c.to_date = '9999-01-01' and (c.dept_no, b.salary) = 
any(select b.dept_no, max(salary) from dept_emp b , salaries c where b.emp_no = c.emp_no and b.to_date='9999-01-01' and c.to_date ='9999-01-01' group by b.dept_no);

-- sol2: from subquery
select c.dept_no, a.first_name, b.salary from employees a, salaries b, dept_emp c, 
(select b.dept_no, max(salary) as max from dept_emp b , salaries c where b.emp_no = c.emp_no and b.to_date='9999-01-01' and c.to_date ='9999-01-01' group by b.dept_no) d 
where a.emp_no = b.emp_no and b.emp_no = c.emp_no and c.dept_no = d.dept_no and b.to_date = '9999-01-01' and c.to_date = '9999-01-01' and b.salary = d.max;

