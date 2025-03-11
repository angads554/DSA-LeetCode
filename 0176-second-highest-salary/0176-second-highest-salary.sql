# Write your MySQL query statement below
with cte as (select salary , DENSE_RANK() over (order by salary desc) as ran from Employee)

select max(salary) as SecondHighestSalary  from cte where ran = 2 