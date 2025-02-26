SELECT 'High Salary' AS category, SUM(CASE WHEN income > 50000 THEN 1 ELSE 0 END) AS accounts_count from accounts
UNION ALL
SELECT 'Low Salary', SUM(CASE WHEN income < 20000 THEN 1 ELSE 0 END) from accounts
UNION ALL
SELECT 'Average Salary', SUM(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 ELSE 0 END) from accounts

