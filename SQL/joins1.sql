SELECT * FROM  customer;
SELECT * FROM address;

SELECT first_name,last_name,address,phone
FROM customer INNER JOIN address
ON customer.address_id = address.address_id;

SELECT first_name,last_name,address,phone
FROM customer LEFT JOIN address
ON customer.address_id = address.address_id;

SELECT first_name,last_name,address,phone
FROM customer RIGHT JOIN address
ON customer.address_id = address.address_id;

SELECT first_name,last_name,c.address_id,a.address_id,address,phone
FROM customer c FULL OUTER JOIN address a
ON c.address_id = a.address_id;