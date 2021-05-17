update pet set death = '2000-01-01' where name='Bowser';

-- 테이블 삭제하기
drop table pet;
-- 테이블 만들기
create table pet(
	name varchar(20),
    owner varchar(20),
    species varchar(20),
    gender char(1),
    birth date,
    death date
    -- varchar는 가변 공간 char는 고정 되어있는 공간check
);
-- scheme 확인
desc pet;

-- 조회
select * from pet;

-- 데이터 넣기(생성, create)
insert into pet values ('성탄이', '정신후', 'dog', 'm', '2018-12-25', null);

-- 데이터 삭제(delete)
delete from pet where name='성탄이';

-- 조회 연습1: where 
-- 1990년 이후에 태어난 아이들은?
select * from pet where birth > '1990-12-31';

-- Gwen과 함께 사는 아이들은?
select * from pet where owner = 'gwen';

-- null 다루기1 : 살아 있는 애들
select * from pet where death is null;

-- null 다루기2 : 죽은 애들
select * from pet where death is not null;

-- like 검색(패턴 매칭): 이름이 b로 시작하는 애들은?
select * from pet where name like 'b%';

-- like 검색(패턴 매칭): 이름이 b로 시작하는 애들중 이름이 6자 인애?
select * from pet where name like 'b_____';

-- 집계(통계) 함수
select count(*) from pet;
-- death 가 null이 아닌 애들 카운트
select count(death) from pet;
select count(*) from pet where death is not null;

-- 조회 연습2 : order by
-- 어린순으로 정렬
select * 
	from pet 
order by birth desc;

-- 어린순으로 정렬후 생일이 같으면 이름순으로 다시 정렬 
select * 
	from pet 
order by birth desc, name asc;