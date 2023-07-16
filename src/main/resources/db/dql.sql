-- Get all information about one postage stamp(id = 5)
SELECT stamp.catalog_no, stamp.item_name, stamp.item_year, stamp.item_date, s.series_name,
       stamp.denomination, stamp.image_link, stamp.circulation,
       CONCAT(a.first_name, ' ', a.last_name) AS design
FROM items stamp
    INNER JOIN series s ON stamp.series_id = s.id
    JOIN design d on stamp.id = d.item_id
    JOIN authors a on a.id = d.author_id
WHERE stamp.id = 5;