-- Runtime: 438ms -> Beats 62.37% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT name FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;