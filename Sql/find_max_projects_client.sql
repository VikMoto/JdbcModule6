SELECT c.name AS c_lient, count(*) AS client_max
FROM project
INNER JOIN client c ON project.client_id = c.id
GROUP BY c.name
HAVING count(*) = (
    SELECT max(p_c)
    FROM (
        SELECT c.id, count(*) AS p_c
        FROM project
        INNER JOIN client c ON project.client_id = c.id
        GROUP BY c.id
    ) cts
);