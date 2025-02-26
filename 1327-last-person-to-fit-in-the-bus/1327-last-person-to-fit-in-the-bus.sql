# Write your MySQL query statement below
with cte as
(select Turn , person_id, person_name, weight , sum(weight) over(order by turn) as Total_Weight
from Queue)

-- select * from CTE

select person_name 
from cte where Total_Weight<=1000
order by Total_Weight DESC
LIMIT 1