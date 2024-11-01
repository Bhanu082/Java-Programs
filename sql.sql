CREATE DATABASE BHAVANI;
SHOW DATABASES;
USE BHAVANI;
CREATE TABLE Miracle_emp(emp_id int, emp_name varchar(30), emp_designation varchar(35), emp_contact int(12));
INSERT INTO Miracle_emp values(501,'Bhavani','HR',637829),(502,'Surya','DEV',681249),(503,'Ram','Dev',681246),(504,'Durga','Dev',681643),(505,'Giri','DEv',54545);
SELECT * FROM Miracle_emp;
ALTER TABLE Miracle_emp ADD column salary int;
UPDATE Miracle_emp SET salary = 15300 WHERE emp_id = 501;
SET SQL_SAFE_UPDATES = 0;
SELECT * FROM Miracle_emp ORDER BY (emp_id) DESC;
SELECT emp_name FROM Miracle_emp Where emp_name Like '%u%';
SELECT emp_name FROM Miracle_emp WHERE salary>14500;
SELECT * FROM Miracle_emp ORDER BY (emp_id) ASC;

DELETE FROM Miracle_emp WHERE emp_id =6; 
