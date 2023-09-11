
CREATE TABLE ScrumTeam(
                          Emp_ID Integer PRIMARY KEY,
                          FirstName varchar(30) NOT NULL,
                          LastName varchar(30),
                          JobTitle varchar(20)
);

INSERT INTO ScrumTeam (Emp_ID, FirstName, LastName, JobTitle)
VALUES (1,'Severus','Snape','Tester');

INSERT INTO ScrumTeam VALUES (2,'Harold','Finch','Developer');

INSERT INTO ScrumTeam VALUES (3,'Phoebe','Buffay','ScrumMaster');

INSERT INTO ScrumTeam VALUES (4,'Michael','Scofield','PO');

SELECT * FROM scrumteam;

--write a procedure that will accept 2 params, emp_id, job_title , it will update that employee job title
--based on what we provide

CREATE OR REPLACE PROCEDURE update_jobTitle_by_id(empId integer, job_title varchar)
    language plpgsql
AS
    $$
    BEGIN
        UPDATE scrumteam
        SET jobtitle = job_title
        WHERE emp_id = empId;

    END
    $$;

call update_jobTitle_by_id(4,'Spring Developer');

Select * FRom scrumteam;