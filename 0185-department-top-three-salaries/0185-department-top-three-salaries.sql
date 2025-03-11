# Write your MySQL query statement below
with cte as (Select  Distinct e.salary,  e.name as Employee , Dense_Rank() over(partition by d.name order by e.salary desc) as Ra , d.name as Department 
from Employee e inner join Department d on e.departmentId = d.id)


select Department , Employee , Salary from CTE where ra <=3 group by Department , Employee , Salary