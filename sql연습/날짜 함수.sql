-- 함수: 날짜 함수

-- CURDATE(), CURRENT_DATE
select CURDATE(), CURRENT_DATE;

-- CURTIME(), CURRENT_TIME
select CURTIME(), CURRENT_TIME;

-- now() vs sysdate();
select now(), sysdate();
select now(), Sleep(2), now();
select sysdate(), Sleep(2), sysdate();

-- date_format(date, format)
select date_format(now(), '%Y년 %m월 %d일 : %h시 %i분 %s초') as today;
select date_format(now(), '%Y년 %c월 %d일 : %h시 %i분 %s초') as today;

-- period_diff 
-- YYMM, YYYYMM 
select first_name, period_diff(date_format(curdate(), '%Y%m'), date_format(hire_date, '%Y%m')) from employees;

-- date_add(=adddate), date_sub(subdate)
-- 날짜 date에 type(day, month, year) 형식으로 expr 값을 더하거나 뺀다.
-- 각 사원들의 근무 년 수가 5년이 되는 날은 언제 인가요?
select first_name, hire_date, date_add(hire_date ,interval 5 year) from employees;

-- cast
select cast('2021-05-07' as date);
select cast('123412' as int);
select now(), cast(now() as date);
select cast(1-2 as unsigned);
select cast(cast(1-2 as unsigned) as signed);

-- mysql type
-- VARCHAR, CHAR, text, CLOB
-- signed(unsigned) int(integer), medium int, big int, int(11) -> big int
-- float, double
-- time, date, datetime
-- lob(Large OBject) : CLOB, BLOB