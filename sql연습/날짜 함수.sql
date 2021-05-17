-- 함수: 날짜 함수

-- CURDATE(), CURRENT_DATE
select CURDATE(), CURRENT_DATE;

-- CURTIME(), CURRENT_TIME
select CURTIME(), CURRENT_TIME;

-- now() vs sysdate();
select now(), sysdate();
select now(), Sleep(2), now();
select sysdate(), Sleep(2), sysdate();