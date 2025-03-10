-- Runtime: 3988ms -> Beats 5.70% of users with PostgreSQL
-- Memory: 0MB -> Beats 100.00% of user with PostgreSQL

-- Write your PostgreSQL query statement below
SELECT P.product_name, S.year, S.price FROM SALES S
LEFT OUTER JOIN PRODUCT P ON P.product_id = S.product_id
WHERE product_name IS NOT NULL;
