# Write your MySQL query statement below
select u.NAME,sum(t.amount) as BALANCE 
from Users u
join 
Transactions t
on u.account = t.account
group by u.name
having (BALANCE > 10000);