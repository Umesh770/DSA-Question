# Write your MySQL query statement below
SELECT whether1.id
FROM Weather AS whether1
JOIN Weather AS whether2
ON DATEDIFF(whether1.recordDate, whether2.recordDate) = 1
WHERE whether1.temperature > whether2.temperature;