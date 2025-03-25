# Write your MySQL query statement below

select Round(Count(Distinct player_id) / (Select count(Distinct player_id)from Activity),2) as fraction
from Activity
where (select player_id ,DATE_SUB(event_date, interval 1 day))
in 
(Select player_id, Min(event_date) as firstLogin
from Activity
group by player_id)
