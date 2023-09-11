--how can we rename the column we displayed
SELECT first_name AS "given_name", last_name as "surname"
FROM employees;

SELECT first_name||' '||last_name AS "full_name"
FROM employees;

--TASK
-- add @cydeo.com and name new column to full_email

SELECT email||'@cydeo.com' AS "full_email"
FROM employees;

--lower case
SELECT lower(email||'@cydeo.com') AS "full_email"
FROM employees;

--upper case
SELECT upper(email||'@cydeo.com') AS "full_email"
FROM employees;

SELECT first_name,length(first_name) as "length_name"
FROM employees;

--substr(colName,begIndex,NumberOfChar)
SELECT substr(first_name,1,1)||'.'||substr(last_name,1,1) AS "initials"
FROM employees;

-- initials, fullname, email(cydeo)(lower)
CREATE VIEW Emaillist AS SELECT substr(first_name,1,1)||'.'||substr(last_name,1,1) AS "initials",
       first_name||' '||last_name AS "full_name",
       lower(email||'@cydeo.com') AS "e-mail"
FROM employees;

SELECT full_name
FROM emaillist;

--to remove view
DROP VIEW emaillist;