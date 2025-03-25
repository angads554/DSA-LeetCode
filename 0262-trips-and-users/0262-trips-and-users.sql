select t.request_at as Day,
round(sum(CASE when t.status like "cancelled%" then 1 else 0 end)/Count(*),2) as "Cancellation Rate"
from trips t 
left join Users u1 
on u1.users_id=t.client_id 
left join Users u2 
on u2.users_id= t.driver_id
where u1.banned = "No" 
and u2.banned = "No" 
and t.request_at between "2013-10-01" and "2013-10-03"
group by t.request_at 
order by t.request_at asc