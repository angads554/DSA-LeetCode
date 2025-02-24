# Write your MySQL query statement below

with singleNum as (select num from MyNumbers group by num  HAVING count(num)=1 ) 

select max(num) as num from singleNum