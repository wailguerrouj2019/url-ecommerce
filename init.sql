   CREATE TABLE IF NOT EXISTS product (
     id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(255),
     price DECIMAL(38,2),
     stock INT NOT NULL
   );

   INSERT INTO product (name, price, stock) VALUES
   ('Clavier mécanique', 59.90, 20),
   ('Souris sans fil', 24.50, 35),
   ('Écran 24 pouces', 139.00, 10);