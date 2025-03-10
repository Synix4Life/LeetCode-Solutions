-- Runtime: 1064ms -> Beats 28.41% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT Uni.unique_id, Emp.name FROM Employees Emp
LEFT OUTER JOIN EmployeeUNI Uni ON Emp.id = Uni.id;
