CREATE OR REPLACE FUNCTION get_jobId_count_by_name(job_name varchar)
    returns int
    language plpgsql
AS
    $$
    DECLARE
        jobId_count integer;
    BEGIN
        SELECT COUNT(*)
        INTO jobId_count
        FROM employees
        WHERE job_id = job_name;

        RETURN jobId_count;
    END
    $$;

select get_jobId_count_by_name('SA_REP');

DROP FUNCTION get_jobId_count_by_name(job_name varchar);

CREATE OR REPLACE FUNCTION get_employees_managed_by_id(mngr_id integer)
    returns table
        (
            employee_firstname varchar,
            employee_lastname varchar
        )
    language plpgsql
AS
$$

        BEGIN
            RETURN QUERY
            SELECT first_name,last_name
            FROM employees
            WHERE manager_id = mngr_id;
        END
$$;

SELECT * FROM get_employees_managed_by_id(103);


