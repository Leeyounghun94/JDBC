
create tablespace board datafile 'c:\board.dbf' size 20m; -- create tablespace board; -> 익스프레스는 여기까지 작성할것.
-- 10-3에 db 생성

create user boardtest identified by boardtest;
-- id boardtest/ pw boardtest

grant connect, resource to boardtest;
-- boardtest 계정에게 접속 권한, 일반 조원 권한 부여

alter user boardtest default tablespace board;
--boardtest 계정에 기본 데이터베이스를 board를 지정

alter user boardtest temporary tablespace temp;
-- boardtest 계정에 임시 데이터베이스 배정( 생략 가능하다)


--> boardtest 계정으로 접속 해야 한다.

--system 계정으로 데이터베이스 연결 -> DB 생성 -> 유저 계정 생성(ID.PW 생성) -> 권한 부여 -> 유저 계정으로 DB연결 -> 임시테이블 생성(생략가능) -> system 계정을 끊어. -> user 계정 연결하고 만들 sql파일에 테이블 생성 -> 더미데이터 입력.
-- 그다음에 DAO(데이터베이스 연결파일)에다가 메서드 생성(C , R, U, D 생성) -> Main()에서 DAO 객체 생성 한 후 DAO.메서드 //