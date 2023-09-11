SELECT * FROM scrumteam;

--ADDING NEW COLUMN
ALTER TABLE scrumteam ADD salary Integer;

UPDATE ScrumTeam
SET salary = 120000
WHERE Emp_ID = 1;


UPDATE ScrumTeam
SET salary = 150000
WHERE Emp_ID = 2;


UPDATE ScrumTeam
SET salary = 90000
WHERE Emp_ID = 4;

--rename the column
ALTER TABLE scrumteam RENAME COLUMN salary TO annual_salary;

SELECT * FROM scrumteam;

--delete/drop column
ALTER TABLE scrumteam DROP COLUMN annual_salary;

--how to change table name
ALTER TABLE scrumteam RENAME TO agileteam;

SELECT * FROM agileteam;

TRUNCATE TABLE agileteam;

DROP TABLE agileteam;