-- Runtime: 771ms -> Beats 10.36% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT(
    SELECT DISTINCT salary as SecondHighestSalary FROM Employee
    ORDER BY salary DESC OFFSET 1 LIMIT 1
)