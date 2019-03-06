
/* Drop Triggers */

DROP TRIGGER TRI_order_board_orderNum;



/* Drop Tables */

DROP TABLE order_board CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_order_board_orderNum;




/* Create Sequences */

CREATE SEQUENCE SEQ_order_board_orderNum INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE order_board
(
	orderNum number(3,0) NOT NULL,
	-- 요청자
	buyer varchar2(100),
	-- 요청자주소
	buyAdr varchar2(1000),
	-- 요청품목
	reqName varchar2(100),
	-- 요청수량
	reqCnt number(10,0),
	-- 시스템연월일
	reqDat char(8),
	-- 시스템 시분초
	reqTim char(6),
	PRIMARY KEY (orderNum)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_order_board_orderNum BEFORE INSERT ON order_board
FOR EACH ROW
BEGIN
	SELECT SEQ_order_board_orderNum.nextval
	INTO :new.orderNum
	FROM dual;
END;

/




/* Comments */

COMMENT ON COLUMN order_board.buyer IS '요청자';
COMMENT ON COLUMN order_board.buyAdr IS '요청자주소';
COMMENT ON COLUMN order_board.reqName IS '요청품목';
COMMENT ON COLUMN order_board.reqCnt IS '요청수량';
COMMENT ON COLUMN order_board.reqDat IS '시스템연월일';
COMMENT ON COLUMN order_board.reqTim IS '시스템 시분초';



