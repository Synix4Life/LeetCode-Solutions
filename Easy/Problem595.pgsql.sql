-- Runtime: 368ms -> Beats 88.05% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT name, population, area FROM world
WHERE area >= 3000000 OR population >= 25000000;