# Write your MySQL query statement below
with cte as
(Select visited_on, 
    sum(sum(amount)) over (rows between 6 preceding and current row) as amount,
    round(avg(sum(amount)) over (rows between 6 preceding and current row ),2) as average_amount,
    lag(visited_on,6) over() as start_date
from Customer 
group by visited_on 
order by visited_on ASC)


Select visited_on, amount, average_amount 
from cte 
where start_date is not null