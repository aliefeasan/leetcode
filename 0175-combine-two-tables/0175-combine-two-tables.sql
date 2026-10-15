/* Write your PL/SQL query statement below */
select p.firstName,p.lastName,a.city,a.state
from person p,address a
where p.personId=a.personId(+);