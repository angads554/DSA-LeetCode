# Write your MySQL query statement below
with cte as(select *, count(tiv_2015) over(PARTITION by tiv_2015) as cnt,
 count(tiv_2015) over(PARTITION by lat,lon) as loc
from Insurance )

select round(sum(tiv_2016),2 ) as tiv_2016
from cte 
where cnt > 1 and loc =1