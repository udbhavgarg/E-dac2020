create database Assignment2;
use Assignment2;


CREATE TABLE PUBLISHERS
(
    PUBID      INT(3)   PRIMARY KEY,
    PNAME      VARCHAR(30),
    EMAIL      VARCHAR(50)  UNIQUE,
    PHONE      VARCHAR(30)
);

INSERT INTO PUBLISHERS VALUES (1,'WILLEY','WDT@VSNL.NET','91-11-23260877');
INSERT INTO PUBLISHERS VALUES (2,'WROX','INFO@WROX.COM',NULL);
INSERT INTO PUBLISHERS VALUES (3,'TATA MCGRAW-HILL','FEEDBACK@TATAMCGRAWHILL.COM','91-11-33333322');
INSERT INTO PUBLISHERS VALUES (4,'TECHMEDIA','BOOKS@TECHMEDIA.COM','91-11-33257660');



CREATE TABLE  SUBJECTS
(
    SUBID      VARCHAR(5) PRIMARY KEY,
    SNAME      VARCHAR(30)
);


INSERT INTO SUBJECTS VALUES ('ORA','ORACLE DATABASE 10g');
INSERT INTO SUBJECTS VALUES ('JAVA','JAVA LANGUAGE');
INSERT INTO SUBJECTS VALUES ('JEE','JAVA ENTEPRISE EDITION');
INSERT INTO SUBJECTS VALUES ('VB','VISUAL BASIC.NET');
INSERT INTO SUBJECTS VALUES ('ASP','ASP.NET');



CREATE TABLE  AUTHORS
(
    AUID       INT(5)  PRIMARY KEY,
    ANAME      VARCHAR(30),
    EMAIL      VARCHAR(50)  UNIQUE,
    PHONE      VARCHAR(30)
);

INSERT INTO AUTHORS VALUES (101, 'HERBERT SCHILD','HERBERT@YAHOO.COM',NULL);
INSERT INTO AUTHORS VALUES (102, 'JAMES GOODWILL','GOODWILL@HOTMAIL.COM',NULL);
INSERT INTO AUTHORS VALUES (103, 'DAVAID HUNTER','HUNTER@HOTMAIL.COM',NULL);
INSERT INTO AUTHORS VALUES (104, 'STEPHEN WALTHER','WALTHER@GMAIL.COM',NULL);
INSERT INTO AUTHORS VALUES (105, 'KEVIN LONEY','LONEY@ORACLE.COM',NULL);
INSERT INTO AUTHORS VALUES (106, 'ED. ROMANS','ROMANS@THESERVERSIDE.COM',NULL);



CREATE TABLE  TITLES
(
    TITLEID    INT(5) PRIMARY KEY,
    TITLE      VARCHAR(30),
    PUBID      INT(3),
    SUBID      VARCHAR(5),
    PUBDATE    DATE,
    COVER      CHAR(1)  CHECK ( COVER IN ('P','H','p','h')),
    PRICE      INT(4)
);
ALTER TABLE TITLES ADD  CONSTRAINT TITLES_PUBID_FK FOREIGN KEY (PUBID) REFERENCES PUBLISHERS(PUBID);
ALTER TABLE TITLES ADD CONSTRAINT TITLES_SUBID_FK FOREIGN KEY (SUBID) REFERENCES SUBJECTS(SUBID);


INSERT INTO TITLES VALUES (1001,'ASP.NET UNLEASHED',4,'ASP','2002-04-12','P',540);
INSERT INTO TITLES VALUES (1002,'ORACLE10G COMP. REF.',3,'ORA','2005-05-01','P',575);
INSERT INTO TITLES VALUES (1003,'MASTERING EJB',1,'JEE','2005-02-03','P',475);
INSERT INTO TITLES VALUES (1004,'JAVA COMP. REF',3,'JAVA','2005-04-03','P',499);
INSERT INTO TITLES VALUES (1005,'PRO. VB.NET',2,'VB','2005-06-15','P',450);



CREATE TABLE  TITLEAUTHORS
(
    TITLEID    INT(5) ,
    AUID       INT(5) ,
    IMPORTANCE INT(2),
   PRIMARY KEY(TITLEID,AUID)
 );
ALTER TABLE TITLEAUTHORS ADD CONSTRAINT  TITLESAUTHORS_TITLEID_FK FOREIGN KEY (TITLEID) REFERENCES TITLES(TITLEID);
ALTER TABLE TITLEAUTHORS ADD CONSTRAINT  TITLESAUTHORS_AUTHID_FK FOREIGN KEY (AUID) REFERENCES AUTHORS(AUID);


INSERT INTO TITLEAUTHORS VALUES (1001,104,1);
INSERT INTO TITLEAUTHORS VALUES (1002,105,1);
INSERT INTO TITLEAUTHORS VALUES (1003,106,1);
INSERT INTO TITLEAUTHORS VALUES (1004,101,1);
INSERT INTO TITLEAUTHORS VALUES (1005,103,1);
INSERT INTO TITLEAUTHORS VALUES (1005,102,2);


select pname, phone, email from Publishers;
select aname, phone from Authors;
select titleid, title, pubdate from Titles;
select auid, titleid, importance from titleauthors;

select *from subjects where sname  in ('ORACLE DATABASE 10g');
select *from subjects where sname  regexp 'ORACLE?';

select *from subjects where sname  regexp '^j';
select *from subjects where sname  regexp '[[:<:]]j';

select *from subjects where sname  regexp '.net?';

select *from subjects where sname  regexp 'er$';
select *from subjects where sname  regexp 'er[[:>:]]';

select *from publishers where pname  regexp 'hill?';




select title from titles where price < 500;
select title from titles where pubdate < '2005-04-03';
select sname from subjects where subid="java" or subid="jee";
select aname from authors where auid>103;
select * from titles where titleid=101 or price >400;

select * from publishers where pname ="TECHMEDIA"or pname= "WROX";


select max(price) highest_price from titles;
select avg(importance) avg_importance from titleauthors;
select count(*)as records from authors ;
select sum(price) sum_of_prices from titles;


select title from titles where month(pubdate)=4;
select year(pubdate) from titles ;
select month(pubdate) from titles ;
select last_day(pubdate) from titles where subid="java";



create table Employee(
emp_id integer,
emp_name char(50)) ;

insert into  Employee values(1,'UMESH CHOUDHARI');
insert into  Employee values(2,'UDIT NEMADE');
insert into  Employee values(3,'TEJAS RANE');
alter table employee add column dept_id varchar(20);
alter table employee modify column emp_name varchar(50);
alter table employee rename Scott;
truncate table Scott;


create table Emp( SAL float(7,3));
insert into Emp values(1234.567);
insert into Emp values(1530.567);
insert into Emp values(1652.786);
insert into Emp values(1775.15);

SELECT ROUND(1234.567,-1) AS RoundValue;
SELECT ROUND(1234.567,2) AS RoundValue;

SELECT CEIL(1775.15) AS CeilValue;
SELECT CEIL(1652.786) AS CeilValue;

SELECT CEILING(1775.15) AS CeilValue;
SELECT CEILING(1652.786) AS CeilValue;

SELECT FLOOR(25.75) AS FloorValue;
SELECT FLOOR(25.175) AS FloorValue;

SELECT SIGN(15);
SELECT SIGN(-15);

SELECT 17 MOD 5;

SELECT SQRT(25);

SELECT POWER(4,-2);
SELECT POWER(4,2);


SELECT ASCII('CDAC juhu');
SELECT BIN('CDAC juhu');
SELECT HEX('CDAC juhu');
 SELECT BIT_LENGTH('CDAC juhu');
 SELECT CHAR('CDAC juhu');
 SELECT CHAR_LENGTH('CDAC juhu');
 SELECT CONCAT('CDAC' 'juhu');
 SELECT LCASE('CDAC juhu');
  SELECT LOWER('CDAC juhu');
 SELECT MID('CDAC juhu',4,3);
 SELECT REVERSE('CDAC juhu');
SELECT UPPER('CDAC juhu');
SELECT LEFT('CDAC juhu', 3);
SELECT LENGTH('CDAC juhu');




SELECT DATE_ADD('1998-01-02', INTERVAL 31 DAY);
SELECT ADDTIME('1997-12-31 23:59:59.999999','1 1:1:1.000002');
SELECT CONVERT_TZ('2004-01-01 12:00:00','GMT','MET');
SELECT CONVERT_TZ('2004-01-01 12:00:00','+00:00','+10:00');
SELECT CURDATE();
SELECT CURDATE()+0;
SELECT CURTIME();
SELECT CURTIME()+0;
SELECT DATE('2003-12-31 01:02:03');
SELECT DATEDIFF('1997-12-31 23:59:59','1997-12-30');
SELECT DATE_ADD('1997-12-31 23:59:59', INTERVAL '1:1' MINUTE_SECOND);
SELECT DATE_ADD('1999-01-01', INTERVAL 1 HOUR);
SELECT DATE_FORMAT('1997-10-04 22:23:00', '%W %M %Y');
SELECT DAYNAME('1998-02-05');
SELECT MONTHNAME('1998-02-05');
SELECT DAYOFWEEK('1998-02-03');
SELECT DAYOFYEAR('1998-02-03');
SELECT EXTRACT(YEAR FROM '1999-07-02');
SELECT EXTRACT(YEAR_MONTH FROM '1999-07-02 01:02:03');
SELECT HOUR('10:05:03');
SELECT LAST_DAY('2003-02-05');
 SELECT MAKEDATE(2001,31), MAKEDATE(2001,32);
 SELECT MAKETIME(12,15,30);
 SELECT NOW();