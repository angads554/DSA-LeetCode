CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
     SELECT distinct salary AS getNthHighestSalary
     from  (Select *, Dense_rank() over (order by Salary desc)as dnk from Employee) as tab 
     where tab.dnk=n
  );
END