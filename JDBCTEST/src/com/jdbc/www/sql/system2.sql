-- JDBC 순서 : DB -> 계정 -> 권한 -> 테이블

CREATE TABLESPACE MBC DATAFILE 'C:\MBC.DBF' SIZE 20M;
--MBC 데이터베이스 생성, 경로 , 사이즈 옵션 적용

CREATE USER MBCUSER IDENTIFIED BY 1234;
--MBCUSER 계정 생성, 암호 1234

grant connect, dba to MBCUSER;
--mbcuser의 권한 배정

alter user MBCUSER default tablespace MBC;
-- 처음 만든 계정과 db와 연결하기

alter user MBCUSER temporary tablespace temp;
--생략가능 하지만 해두면 좋은 것 ( 임시테이블 db 연결 )