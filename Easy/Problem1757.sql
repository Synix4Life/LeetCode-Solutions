-- Runtime: 347ms -> Beats 79.19% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';