# Write your MySQL query statement below
with cte as(
    Select num as curr , lead(num,1) over() as next1, lead(num,2) over() as next2
    from Logs
)

select Distinct curr as ConsecutiveNums from cte where curr=next1 and next1=next2 