# Write your MySQL query statement below
with cte as
(select * , rank() over (partition by product_id order by change_date desc ) as rak
from Products
where change_date <="2019-08-16" )


select product_id, new_price as price 
from cte
where rak=1

union 

select product_id, 10 
from Products
where product_id not in (select product_id from cte)