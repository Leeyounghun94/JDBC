-- JDBC 순서 : DB -> 계정 -> 권한 -> 테이블

create tablespace board datafile 'c:\board.dbf' SIZE 20m;


CREATE USER boardtest IDENTIFIED BY boardtest;
--MBCUSER 계정 생성, 암호 1234

grant connect, resource to boardtest;


alter user boardtest default tablespace board;
-- 처음 만든 계정과 db와 연결하기

alter user boardtest temporary tablespace temp;
--생략가능 하지만 해두면 좋은 것 ( 임시테이블 db 연결 )
