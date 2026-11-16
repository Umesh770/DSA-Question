# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
Where Char_Length(content)>15;