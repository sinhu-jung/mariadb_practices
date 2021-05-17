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


