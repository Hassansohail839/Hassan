-- Crear tabla de FABRICANTES
CREATE TABLE FABRICANTES (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL
);

-- Crear tabla de ARTICULOS
CREATE TABLE ARTICULOS (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Precio INT NOT NULL,
    Fabricante INT NOT NULL,
    FOREIGN KEY (Fabricante) REFERENCES FABRICANTES(Codigo)
);
-- Insertar fabricantes
INSERT INTO FABRICANTES (Nombre) VALUES 
('Asus'),
('HP'),
('Logitech'),
('Apple');

-- Insertar artículos
INSERT INTO ARTICULOS (Nombre, Precio, Fabricante) VALUES 
('Portátil ASUS VivoBook', 600, 1),
('Impresora HP LaserJet', 120, 2),
('Ratón Logitech M185', 15, 3),
('Teclado Logitech K380', 35, 3),
('iPhone 13', 899, 4),
('AirPods', 179, 4),
('HP Monitor 24"', 199, 2),
('USB-C Hub', 60, 1);

1.1
SELECT Nombre 
FROM ARTICULOS;

1.2
SELECT Nombre, Precio 
FROM ARTICULOS;

1.3
SELECT Nombre 
FROM ARTICULOS
WHERE Precio <= 200;

1.4
SELECT * 
FROM ARTICULOS
WHERE Precio BETWEEN 60 AND 120;

1.5
SELECT Nombre, Precio * 166.386 AS PrecioEnPesetas 
FROM ARTICULOS;
    