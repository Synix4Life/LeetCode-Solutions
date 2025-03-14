-- Runtime: 854ms -> Beats 68.60% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT teacher_id, count(DISTINCT subject_id) cnt FROM Teacher
GROUP BY teacher_id;
