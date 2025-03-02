-- Runtime: 577ms -> Beats 71.90% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT tweet_id FROM Tweets
WHERE LENGTH(content)>15;