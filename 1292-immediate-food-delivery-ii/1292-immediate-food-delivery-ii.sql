# Write your MySQL query statement below

Select  
Round((Count(CASE when  order_date=customer_pref_delivery_date then 1
else null end ) /
count(*) )*100,2) as immediate_percentage 
from 
(Select delivery_id,customer_id, order_date, customer_pref_delivery_date, 
Row_Number() OVER (PARTITION BY customer_id order by order_date) as abc 
from Delivery ) as c  
where abc = 1