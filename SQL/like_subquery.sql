--get me all employees whose first name starts with C
SELECT * FROM employees
WHERE first_name LIKE 'C%';

-- get me first name where second char is u;
SELECT * FROM employees
WHERE first_name LIKE '_u%'

--get me all names where it contains c

SELECT * FROM employees
WHERE first_name ILIKE '%c%'

--ILIKE make search case insensitive

-------------------------------------
SELECT MIN(salary)
FROM employees;

SELECT MAX(salary)
FROM employees;

SELECT SUM(salary)
FROM employees;

SELECT AVG(salary)
FROM employees;

SELECT ROUND(AVG(salary),2)
FROM employees;

--how to find who is making highest salary ?
SELECT MAX(salary)
FROM employees;
--max is 24000

--SubQuery
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);

--how to find who is making second highest salary ?
----how to find what is the second highest salary ?
SELECT MAX(salary)
FROM employees;

--second highest salary
SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);

SELECT *
FROM employees
WHERE salary = ( SELECT MAX(salary) FROM employees WHERE salary <
                    (SELECT MAX(salary) FROM employees));

SELECT *
FROM employees
ORDER BY salary DESC
LIMIT 1;

SELECT *
FROM employees
ORDER BY salary DESC
OFFSET 6
LIMIT 3;


--who is making 14th highest salary ?
select distinct salary
from employees
order by salary desc;
--14th highest salary (removing duplicates)
Select distinct salary
from employees
order by salary desc
offset 13
limit 1;

-- who is making nth highest salary ? change offset value n-1
select *
from employees
where salary = (Select distinct salary
                from employees
                order by salary desc
                offset 5
                limit 1);