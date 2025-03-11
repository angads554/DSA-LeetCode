# Write your MySQL query statement below
with cte as (select customer_id, count(*) as a from customer group by customer_id )

select customer_id  from customer group by customer_id
having  count( distinct product_key) = (select count(product_key) from Product)
