-- inner join 

-- 예제 1.
select * from employees a, titles  b where a.emp_no = b.emp_no; -- join condition

-- 예제 2.
select a.first_name, b.title, a.gender from employees a, titles b where a.emp_no = b.emp_no and a.gender ='f' and b.title = 'engineer';

-- ANSI / ISO SQL1999 JOIN 표준 문법

-- 1. natural join (on a.emp_no = b.emp_no; 생략)
-- 두 테이블의 공통 컬럼이 있으면 별다른 조건없이 묵시적으로 조인됨 (쓸일이 없음)
select a.first_name, b.title from employees a natural join titles b;

-- 2. join ~ using 
select a.first_name, b.title from employees a join titles b using (emp_no);

-- 3. join ~ on
select a.first_name, b.title from employees a join titles b on a.emp_no = b.emp_no;
 
 -- outer join
-- insert into dept values(null, '총무');
-- insert into dept values(null, '개발');
-- insert into dept values(null, '영업');
-- insert into dept values(null, '기획');
 
-- insert into emp values(null, '둘리', 1);
--  insert into emp values(null, '마이콜', 2);
--  insert into emp values(null, '또치', 3);
--  insert into emp values(null, '길동', null);
--  select * from emp;
 
 select a.name, b.name from emp a left join dept b on a.dept_no = b.no;
 select a.name, b.name from emp a right join dept b on a.dept_no = b.no;
 
 select a.name, ifnull(b.name, '없음') as 부서 from emp a left join dept b on a.dept_no = b.no;
 
 -- 실습 문제 1
 select a.emp_no, a.first_name, c.dept_name from employees a, dept_emp b, departments c where a.emp_no = b.emp_no and b.dept_no = c.dept_no and b.to_date = '9999-01-01';
 
 -- 실습 문제 2
 select a.emp_no, a.first_name, b.salary from salaries b, employees a where a.emp_no = b.emp_no and b.to_date = '9999-01-01'