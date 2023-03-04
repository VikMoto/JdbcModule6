WITH tempTable(name, project_id, interval_month) AS
(SELECT c.name, p.id AS project_id,
       (date_part('year',finish_date::date) - date_part('year', start_date::date)) * 12 +
        (date_part('month',finish_date::date) - date_part('month', start_date::date)) AS interval_month
FROM project AS p
JOIN client AS c on c.id = p.client_id)

SELECT name, project_id, tempTable.interval_month AS timeMonth
FROM tempTable
WHERE tempTable.interval_month = (SELECT max(tempTable.interval_month) FROM tempTable)
      OR tempTable.interval_month = (SELECT min(tempTable.interval_month) FROM tempTable) ;