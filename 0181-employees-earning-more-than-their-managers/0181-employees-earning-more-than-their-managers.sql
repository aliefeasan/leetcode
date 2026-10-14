/* Write your PL/SQL query statement below */
select emp.name as Employee
from employee emp, employee man
where emp.managerId=man.id and emp.salary>man.salary;