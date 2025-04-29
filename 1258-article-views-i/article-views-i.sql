# Write your MySQL query statement 
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id 
Order By id ;