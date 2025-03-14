-- Runtime: 481ms -> Beats 97.38% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT V.customer_id, count(V.customer_id) AS count_no_trans FROM Transactions T
FULL OUTER JOIN Visits V ON V.visit_id = T.visit_id
WHERE T.amount IS NULL AND T.transaction_id IS NULL
GROUP BY V.customer_id;
