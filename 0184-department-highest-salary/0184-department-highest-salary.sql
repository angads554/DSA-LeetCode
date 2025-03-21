select d.name as Department , e.name as Employee , e.Salary
from Employee e left join Department d
on e.departmentId=d.id
where (e.departmentId, e.salary) in (
    select 
    departmentId,
    max(salary)
    from Employee 
    group by departmentId
)