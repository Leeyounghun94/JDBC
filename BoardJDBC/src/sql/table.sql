-- system 계정이 db와 계정과 권한을 준 다음에 다음 작업 시작!

drop table board; -- 기존 board 테이블 삭제

create table board (
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
);

drop sequence board_seq; -- 기본 자동생성번호 삭제
create sequence board_seq increment by 1 start with 1 nocycle nocache ;


select * from board ;

insert into board (bno, btitle, bcontent, bwriter, bdate) 
values (board_seq.nextval, '비오내요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '비오는데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate);



--Member 테이블 생성

drop table member;

create table member (

mno number(5) primary key,
mid nvarchar2(10) not null,
mpw nvarchar2(10) not null,
mdate date not null

);


insert into member (mno, mid, mpw, mdate) values (board_seq.nextval, '이영훈','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (board_seq.nextval, 'member1','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (board_seq.nextval, 'member2','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (board_seq.nextval, 'member3','1234', sysdate );
insert into member (mno, mid, mpw, mdate) values (board_seq.nextval, 'member4','1234', sysdate );

select * from member;

--Member 회원가입

--update member set mid = ? where mid = ?;

-- Member 업데이트(수정) 
update member set mid = '조용재', mpw = '4567' where mid ='이영훈' and  mpw = '1234';
update member set mid = '멤버7', mpw = '4567' where mid ='member1' and mpw = '1234';
update member set mid = '멤버8', mpw = '4567' where mid ='member2' and mpw = '1234';
update member set mid = '멤버9', mpw = '4567' where mid ='member3' and mpw = '1234';
update member set mid = '멤버10', mpw = '4567' where mid ='member4' and mpw = '1234';


select * from member;

-- Member 삭제
delete from member where mid = '조용재';
delete from member where mid = '멤버7';
update member set mid = '3' where mid = '1';
