/*
create table syntax:
    create table TableName(
        colName1 DataType Constraints,
        colName2 DataType Constraints(optional)
        colName3 DataType Constraints,
        ...
    );
*/

CREATE TABLE ScrumTeam(
    Emp_ID Integer PRIMARY KEY,
    FirstName varchar(30) NOT NULL,
    LastName varchar(30),
    JobTitle varchar(20)
);

SELECT * FROM scrumteam;


/*
INSERT INTO tableName (column1, column2,…)
VALUES (value1, value2 … );
*/

INSERT INTO ScrumTeam (Emp_ID, FirstName, LastName, JobTitle)
VALUES (1,'Severus','Snape','Tester');

INSERT INTO ScrumTeam VALUES (2,'Harold','Finch','Developer');

INSERT INTO ScrumTeam VALUES (3,'Phoebe','Buffay','ScrumMaster');

INSERT INTO ScrumTeam VALUES (4,'Michael','Scofield','PO');

--how to update data
/*
UPDATE table_name
SET column1 = value1,
column2 = value2 , …
WHERE condition;
*/

UPDATE ScrumTeam
SET jobtitle = 'DevOps'
WHERE Emp_ID = 4;


--Delete from table
/*
DELETE FROM table_name
WHERE condition;
*/

DELETE FROM ScrumTeam
WHERE emp_id = 3;

commit






