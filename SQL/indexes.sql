CREATE TABLE Towns (
                       id SERIAL UNIQUE NOT NULL,
                       code VARCHAR(10) NOT NULL, -- not unique
                       article TEXT,
                       name TEXT NOT NULL -- not unique
);


insert into towns (
    code, article, name
)
select
    left(md5(i::text), 10),
    md5(random()::text),
    md5(random()::text)
from generate_series(1, 1000000) s(i);

SELECT COUNT(*)
FROM towns;

SELECT * FROM towns;

--BREAK UNTIL 12:05

EXPLAIN ANALYSE
SELECT *
FROM towns
WHERE name = '0d6442eb71fa171cef891133c55b7d50';
--43ms
EXPLAIN ANALYSE
SELECT *
FROM Towns
WHERE id =1232;

--0.04ms

CREATE INDEX idx_towns_name ON towns(name);

--how to drop index
DROP INDEX IF EXISTS idx_towns_name;

--how to check available indexes in database
SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;


