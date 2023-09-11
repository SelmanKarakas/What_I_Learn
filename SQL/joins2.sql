SELECT * FROM employees;

SELECT * FROM departments;

--display firstname,lastname,department name

SELECT first_name,last_name,department_id
FROM employees;

--display firstname,lastname,department name

SELECT first_name,last_name,e.department_id,department_name
FROM employees e LEFT JOIN departments d
ON e.department_id = d.department_id;

--get me first_name,last_name,department_name,city for all employees

SELECT * FROM departments;

SELECT * FROM locations;

SELECT first_name,last_name,department_name,city
FROM employees JOIN departments d
on employees.department_id = d.department_id
JOIN locations l
on d.location_id = l.location_id;

--get me first_name,lastname,department name,city,country_name for all employees

SELECT first_name,last_name,department_name,city,country_name
FROM employees JOIN departments d
on employees.department_id = d.department_id
JOIN locations l
on d.location_id = l.location_id
JOIN countries c
on l.country_id = c.country_id;

SELECT employee_id,first_name,last_name,manager_id
FROM employees;

--self join
SELECT e1.employee_id, e1.first_name,e1.last_name,e1.manager_id,e2.employee_id,e2.first_name,e2.last_name
FROM employees e1 LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id;




