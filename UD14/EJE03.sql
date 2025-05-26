-- Crear la base de datos
CREATE DATABASE TiendaInformatica;
USE TiendaInformatica;

-- Crear tabla FABRICANTES
CREATE TABLE Fabricantes (
    Codigo INT IDENTITY PRIMARY KEY,
    Nombre NVARCHAR(100)
);

-- Crear tabla ARTICULOS
CREATE TABLE Articulos (
    Codigo INT IDENTITY PRIMARY KEY,
    Nombre NVARCHAR(100),
    Precio INT,
    Fabricante INT,
    FOREIGN KEY (Fabricante) REFERENCES Fabricantes(Codigo)
);