-- select 연습
select * from departments;
select dept_no, dept_name from departments;

-- concat, alias(as, 생략 가능)
select concat(first_name, " ", last_name) as name, gender, hire_date from employees;
select concat(first_name, " ", last_name) name, gender, hire_date from employees;
select concat(first_name, " ", last_name) as 전체이름, gender as 성별, hire_date as 입사일 from employees;

-- distict
select distinct(title) from titles;

-- titles 테이블에서 모든 직급의 이름 출력
select title from titles;

-- where 절 #1
select concat(first_name, " " , last_name) as name, gender, hire_date from employees where hire_date < '1991-01-01';

-- where 절 #2
select concat(first_name, " " , last_name) as name, gender, hire_date from employees where hire_date < '1989-01-01' and gender = 'F';

-- where 절 #3 IN
select emp_no, dept_no from dept_emp where dept_no = 'd005' or dept_no = 'd009';
select emp_no, dept_no from dept_emp where dept_no in ('d005', 'd009');

-- where 절 #4 LIKE 검색
select * from employees where hire_date between '1988-12-31' and  '1990-01-01';
select concat(first_name, " " , last_name) as name, hire_date from employees where hire_date like '1989-%';

-- Order By 절 # 1
select concat(first_name, " " , last_name) as name, gender, hire_date from employees where gender = 'm' order by hire_date asc;
select emp_no, salary from salaries where from_date like '2001%' order by salary desc;
select emp_no, salary from salaries where from_date like '2001%' and to_date like '2001%' order by salary desc;
select emp_no, salary from salaries order by emp_no asc, salary asc;
