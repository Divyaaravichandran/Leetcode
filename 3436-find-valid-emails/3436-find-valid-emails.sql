# Write your MySQL query statement below
SELECT * FROM Users
WHERE email REGEXP '^[a-z0-9]+@[a-z]+\\.com$'
ORDER BY user_id;