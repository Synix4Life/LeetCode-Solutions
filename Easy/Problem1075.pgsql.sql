-- Runtime: 1078ms -> Beats 24.16% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT P.project_id, round(avg(E.experience_years), 2) AS average_years FROM Project P
JOIN Employee E ON E.employee_id = P.employee_id
GROUP BY P.project_id
ORDER BY P.project_id ASC;
