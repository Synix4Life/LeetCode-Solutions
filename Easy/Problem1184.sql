# MySQL
# Runtime: 761ms -> Beats 51.24% of users with MySQL
# Memory: nullMB -> Beats null% of user with PostgreSQL

# Write your MySQL query statement below
SELECT DISTINCT author_id id FROM views
WHERE author_id = viewer_id
ORDER BY id asc;