C-- Crear la base de datos
CREATE DATABASE EmpresaDirectores;
USE EmpresaDirectores;

-- Crear tabla DESPACHOS
CREATE TABLE Despachos (
    Numero INT PRIMARY KEY,
    Capacidad INT
);

-- Crear tabla DIRECTORES
CREATE TABLE Directores (
    DNI VARCHAR(8) PRIMARY KEY,
    NomApels NVARCHAR(255),
    DNIJefe VARCHAR(8),
    Despacho INT,
    FOREIGN KEY (DNIJefe) REFERENCES Directores(DNI),
    FOREIGN KEY (Despacho) REFERENCES Despachos(Numero)
);