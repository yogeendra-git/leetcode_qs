# Write your MySQL query statement below
select user_id,count(*) as prompt_count,round(avg(tokens),2) as avg_tokens
from prompts group by user_id having count(*)>=3
and max(tokens)>avg(tokens)
order by avg_tokens desc,user_id asc;