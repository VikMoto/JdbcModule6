SELECT
    CASE
        WHEN age(birthday) = (SELECT max(age(birthday)) FROM worker) THEN 'OLDEST'
        WHEN age(birthday) = (SELECT min(age(birthday)) FROM worker) THEN 'YOUNGEST'
        ELSE ''
    END AS TYPE,
    name,
    birthday

FROM worker
WHERE age(birthday) = (SELECT max(age(birthday)) FROM worker) OR
      age(birthday) = (SELECT min(age(birthday)) FROM worker)
ORDER BY TYPE;