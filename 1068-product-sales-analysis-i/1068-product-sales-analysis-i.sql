SELECT 
    p.product_name,
    s.year,
    s.price
FROM Product p
inner JOIN Sales s
    ON p.product_id = s.product_id
ORDER BY p.product_name, s.year DESC;
