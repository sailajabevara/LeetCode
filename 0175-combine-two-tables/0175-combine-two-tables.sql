# Write your MySQL query statement below
SELECT p.firstname,p.lastname,a.city,a.state
FROM
Person p
 lEFT JOIN
Address a
ON p.personId = a.personId;

