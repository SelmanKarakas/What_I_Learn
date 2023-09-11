SELECT * FROM testers;
SELECT * FROM developers;


SELECT names FROM developers
UNION
SELECT names FROM testers;

SELECT names FROM developers
EXCEPT
SELECT names FROM testers;

SELECT * FROM developers
INTERSECT
SELECT * FROM testers;
