
/* Drop Tables */

DROP TABLE board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	num number(10,0) NOT NULL,
	title varchar2(150),
	content varchar2(4000)
);



