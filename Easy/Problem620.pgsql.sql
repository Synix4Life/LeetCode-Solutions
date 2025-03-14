-- Runtime: 295ms -> Beats 65.06% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT id, movie, description, rating FROM cinema
WHERE description NOT LIKE '%boring%'
AND NOT id % 2 = 0
ORDER BY rating DESC;
