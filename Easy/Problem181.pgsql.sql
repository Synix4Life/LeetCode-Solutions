-- Runtime: 636ms -> Beats 33.16% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT e.name as Employee FROM Employee as e
WHERE e.salary > (
    SELECT x.salary FROM Employee as x
    WHERE e.managerId = x.id
)