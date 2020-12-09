create database Assignment3;
use  Assignment3;

create table Department (
dept_id integer not null primary key,
dept_name varchar(50));

insert into Department values (1,"Finance");
insert into Department values (2,"Training");
insert into Department values (3,"Marketing");


create table Employee(
empid integer not null primary key,
emp_name varchar(20),
salary	integer(7),
dept_id integer(4),
CONSTRAINT dept_id_fk FOREIGN KEY (dept_id) REFERENCES Department(dept_id));

insert into Employee values(1,"Arun",25000,1);
insert into Employee values(2,"Kiran",15000,1);
insert into Employee values(3,"Scott",35000,2);
insert into Employee values(4,"Max",16000,2);
insert into Employee values(5,"Jack",30000,3);
insert into Employee values(6,"King",10000,3);

SELECT empid,emp_name,dept_id,sum(salary)sum_of_salary from Employee group by dept_id;
select * from employee where salary>1700 group by dept_id;


SELECT dept_id,sum(salary) FROM Employee GROUP BY dept_id HAVING sum(salary) > 45000 ;
SELECT dept_id,sum(salary) FROM Employee GROUP BY dept_id HAVING sum(salary) < 45000 ;
  
SELECT * FROM Employee ORDER BY emp_name DESC;
SELECT * FROM Employee ORDER BY emp_name ASC;
SELECT * FROM Employee ORDER BY salary DESC;
SELECT * FROM Employee ORDER BY salary ASC;
