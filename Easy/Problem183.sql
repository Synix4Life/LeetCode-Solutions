-- Runtime: 330ms -> Beats 13.75% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT c.name AS Customers FROM Customers c
WHERE c.id NOT IN(
    SELECT o.customerId FROM Orders o
);