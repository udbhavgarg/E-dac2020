create database Assig05;
use Assig05;
Create table EMP ( EMPNO numeric(4) not null, ENAME varchar(30) not null, JOB varchar(10), MGR numeric(4), HIREDATE date, SAL numeric(7,2), DEPTNO numeric(2) ); 
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) values(1006,  'Pooja',  'MANAGER'  ,     null    , '2000-02-18' ,6000, 10 );

Create table dept (dno numeric(4) not null, dname varchar(10) not null,
area varchar(30));
Insert into dept(dno,dname,area) values(10,'Store','Mumbai');
Insert into dept(dno,dname,area) values(20,'Purchase','Mumbai');
Insert into dept(dno,dname,area) values(30,'Store', 'Delhi');
Insert into dept(dno,dname,area) values(40,'Marketing','Pune');
Insert into dept(dno,dname,area) values(50,'Finance','Delhi');
Insert into dept(dno,dname,area) values(60,'Accounts','Mumbai');
show databases;
delimiter $$
Create procedure  one01(IN var1 int ,IN var2 int)
BEGIN
SELECT var1 + var2 As alpha;
SELECT var1 - var2 as beta;
SELECT var1 / var2 as gamma;
SELECT var1 * var2 as theta;
end $$
call one01(20,10);
drop procedure one03;

delimiter $$
Create procedure  one02(IN var3 varchar(24))
BEGIN
SELECT reverse(var3);
End $$
call one02("hijndindi");

delimiter $$
Create procedure  one03()
BEGIN
select EMPNO,ENAME,SAL FROM EMP ORDER BY SAL DESC limit 5;
end$$
call one03;

delimiter $$
Create procedure  one04()
BEGIN
Create table emp_test(emp_id int,emp_name varchar(10),emp_date date);
end$$
call one04;

delimiter $$
Create procedure  one05()
BEGIN
insert into DEPT  values(60,'education','pune');
End$$
call one05;

delimiter $$
Create procedure  one05a(IN var1 int,IN var2 varchar(20),IN var3 varchar(20))
BEGIN
insert into DEPT  values(var1,var2,var3);
End$$
call one05a(60,'Education','pune');

delimiter $$
Create procedure  one05b(IN var1 int,IN var2 varchar(20),IN var3 varchar(20))
BEGIN
insert into DEPT  values(var1,var2,var3);
End$$
SET @var1=60;
SET @var2='Eucation';
call one05b(@var1,@var2,'pune');

delimiter $$
Create procedure  one06()
BEGIN
DECLARE num INT;
set num=2;
select num, power(num,2) as square ,power(num,3)as cubeo;
End$$
call one06;

delimiter $$
create procedure one06a( in value int ,out squr int,out cube0 int)
begin 
declare val1 int ;
set val1=value;
select val1;
set squr = power(val1,2);
set cube0 = power(val1,3);
end;$$

call one06a(2,@sqr,@cube0);
select val1;
select @sqr;
select @cube0;

delimiter $$
create procedure one07( in value int ,out squr int)
begin 
declare val1 int ;
set val1=value;
select val1;
set squr = val1;
end;$$

call one07(2,@sqr);
select @sqr;

delimiter $$
create procedure one08( in value int ,out squr int)
begin 
declare val1 int ;
set val1=value;
select val1;
set squr = val1;
end;$$

call one08(2,@sqr);
select @sqr;


