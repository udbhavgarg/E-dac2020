show databases;

create database Assignment1;
use Assignment1;

create table Member(Member_Id	int(5),
Member_Name	Varchar(30),
Member_address	Varchar(50),
Acc_Open_Date	Date,
Membership_type	Varchar(20),
Penalty_Amount	int(7));

create table Books(Book_No	int(6),
Book_Name		VarChar(30),
Author_name	Varchar(30),
Cost	int(7),
Category	Char(10));

create table Issue(Lib_Issue_Id	int(10),
Book_No	int(6),
Member_Id	int(5),
Issue_Date	Date,
Return_date	Date);

insert into Member values(1,"Richa Sharma","Pune",'2005-12-10',"Lifetime",null);
insert into Member values(2,"Garima Sen","Pune",'2005-12-10', default,null);

insert into Books values (101,"Let us C","Denis Ritchie",450,'System');
insert into Books values (102,"Oracle – Complete Ref","Loni",550,'Database');
insert into Books values (103,"Mastering SQL","Loni",250,'Database');
insert into Books values (104,"PL SQL-Ref","ScottUrman",750,'Database');
insert into Books values (105,"Jaa - The Complete Refrence","Schildt",400,'System');

insert into Issue values (7001,101,1,'2006-12-10','ON UPDATE');
insert into Issue values (7002,102,2,'2006-12-25',null);
insert into Issue values (7003,104,1,'2006-01-15',null);
insert into Issue values (7004,101,1,'2006-07-04',null);
insert into Issue values (7005,104,2,'2006-11-15',null);
insert into Issue values (7006,101,3,'2006-02-18',null);

select * from Member;
select * from Books;
select * from Issue;