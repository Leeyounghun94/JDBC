-- system 계정이 db와 계정과 권한을 준 다음에 다음 작업 시작!

--emp 테이블 삭제용
drop table emp;

--emp 테이블 생성
create table emp (
 num number(5) primary key,	-- 숫자 필드, 숫자 5, 기본키 설정
 name varchar2(16) not null, --이름 필드, 문자 16, 공백 허용 안함.
 dept varchar2(16), -- 부서 필드, 문자 16
 score number(7, 2)); --점수, 숫자7, 소수2자리
 
 --emp테이블에서 자동 번호 배정용 객체 생성
 create sequence emp_seq
 	increment by 1 -- 1씩 증가값
 	start with 1 -- 1 시작값
 	nocache; -- 미리 만들지 않음
 	
-- 자동 번호 초기화 -> Drop -> Create
 
drop sequence emp_seq;

insert into emp(num, name, dept, score) values (emp_seq.nextval, '이영훈', 'DB', '95');
insert into emp(num, name, dept, score) values (emp_seq.nextval, '김기원', 'JAVA', '100');
insert into emp(num, name, dept, score) values (emp_seq.nextval, '문지현', 'JAVA', '59');
insert into emp(num, name, dept, score) values (emp_seq.nextval, '김지선', 'DB', '77');
insert into emp(num, name, dept, score) values (emp_seq.nextval, '조용재', 'DB', '88');

select * from emp;



--Member 테이블 생성
create table member (

mno number(5) primary key,
mid nvarchar2(10) not null,
mpw nvarchar2(10) not null,
mdate date not null

);


--Member 로그인
insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, '이영훈','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, 'member1','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, 'member2','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, 'member3','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (emp_seq.nextval, 'member4','1234', sysdate );

select * from MEMBER;


--Member 회원가입

