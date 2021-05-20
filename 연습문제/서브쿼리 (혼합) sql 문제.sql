-- practice04(혼합)

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select avg(salary) from salaries;
select count(distinct a.emp_no) from salaries a, (select avg(salary) as c from salaries) b where a.salary > b.c and a.to_date = '9999-01-01';

-- 문제2. 
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 부서 연봉을 조회하세요. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다. 
select a.emp_no, a.first_name, c.dept_name, d.salary from employees a, dept_emp b, departments c, salaries d , 
(select b.dept_name as dept_n, c.emp_no as num ,max(c.salary) as sal from dept_emp a, departments b, salaries c 
where a.dept_no = b.dept_no and a.emp_no = c.emp_no and a.to_date = '9999-01-01' and c.to_date = '9999-01-01' group by b.dept_name) e 
where a.emp_no = b.emp_no and b.dept_no = c.dept_no and e.sal = d.salary and e.num = a.emp_no and b.to_date = '9999-01-01' group by c.dept_name order by d.salary desc;

-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 연봉(salary)이 많은 사원의 사번, 이름과 연봉을 조회하세요 
select a.emp_no, a.first_name, b.salary, c.dept_name from employees a, salaries b , departments c, dept_emp d ,
(select c.dept_name as dep_name, avg(b.salary) as sal from dept_emp a, salaries b, departments c where a.emp_no = b.emp_no and a.dept_no = c.dept_no and a.to_date = '9999-01-01' and b.to_date = '9999-01-01' group by c.dept_name) e
where a.emp_no = b.emp_no and b.emp_no = d.emp_no and c.dept_no = d.dept_no and e.dep_name = c.dept_name and b.salary > e.sal and b.to_date = '9999-01-01' and d.to_date = '9999-01-01';

-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select * from titles;
select a.emp_no, a.first_name  from employees a, dept_manager b, departments c where a.emp_no = b.emp_no and b.dept_no = c.dept_no and b.to_date = '9999-01-01';

-- 문제5.
-- 평균 연봉이 가장 높은 부서는? (이름, 평균연봉)
select a.first_name, b.salary from employees a, salaries b where a.emp_no = b.emp_no and b.to_date = '9999-01-01' and (a.emp_no, salary) 
= any(select emp_no, salary from salaries where to_date = '9999-01-01' and salary > 50000) order by b.salary asc;

select c.dept_name, avg(a.salary) as sal from salaries a, dept_emp b, departments c where a.emp_no = b.emp_no and b.dept_no = c.dept_no group by c.dept_name;
select b.dept_name, max(d.salary) from departments b, dept_emp c, salaries d 
where c.dept_no = b.dept_no and c.emp_no = d.emp_no and (b.dept_name, d.salary) = 
(select c.dept_name as d_n, avg(a.salary) as sal from salaries a, dept_emp b, departments c where a.emp_no = b.emp_no and b.dept_no = c.dept_no group by c.dept_name) 
group by b.dept_name;

-- 문제6.
-- 현재, 평균연봉이 가장 높은 부서의 사원들의 사번, 이름, 직책, 연봉을 조회하고 연봉 순으로 출력하세요.

-- 문제7.
-- 평균 연봉이 가장 높은 직책?

-- 문제8.
-- 현재 자신의 매니저보다 높은 연봉을 받고 있는 직원은?
-- 부서이름, 사원이름, 연봉, 매니저 이름, 메니저 연봉 순으로 출력합니다.