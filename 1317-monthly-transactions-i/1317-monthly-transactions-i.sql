-- # Write your MySQL query statement below
-- select DATE_FORMAT(trans_date, '%Y-%m')  as month , 
-- country, 
-- count(id) as trans_count, 
-- COUNT (CASE when state = 'approved' then id else null end ) as approved_count,
-- sum(amount) as trans_total_amount , 
-- sum (CASE when state = 'approved' then amount else 0 end ) as approved_total_amount 
-- from Transactions
-- group by country, DATE_FORMAT(trans_date, '%Y-%m') 

    Select DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,
    COUNT(id) AS trans_count,
    COUNT(CASE WHEN state = 'approved' THEN id ELSE NULL END) AS approved_count,
    SUM(amount) AS trans_total_amount,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
FROM Transactions
GROUP BY DATE_FORMAT(trans_date, '%Y-%m'), country;
