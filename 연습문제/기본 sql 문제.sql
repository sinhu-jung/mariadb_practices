-- 기본 sql 문제
-- 1. 사번이 10944인 사원의 이름은(전체 이름)
select concat(first_name, ' ' , last_name) as name from employees where emp_no = '10944';

-- 2. 전체직원의 다음 정보를 조회하세요. 가장 선임부터 출력이 되도록 하세요. 출력은 이름, 성별,  입사일 순서이고 “이름”, “성별”, “입사일"로 컬럼 이름을 대체해 보세요.
select concat(first_name, ' ' , last_name) as 이름, gender as 성별, hire_date as 입사일 from employees order by hire_date asc;

-- 3. 여직원과 남직원은 각 각 몇 명이나 있나요?
select gender, count(gender) from employees group by gender;

-- 4. 현재 근무하고 있는 직원 수는 몇 명입니까? (salaries 테이블을 사용합니다.)
