/* Write your PL/SQL query statement below */
select un.unique_id as unique_id,emp.name as name 
from employeeuni un,employees emp
where emp.id=un.id(+);