-- --------------------------------------------------
-- LENGUAJE ESTRUCTURADO DE CONSULTAS SQL
-- JULIAN E. PEREZ
-- FICHA 2176068
-- SENA 2021
-- --------------------------------------------------

-- --------------------------------------------------
-- CREACIÓN DE LA BASE DE DATOS
-- --------------------------------------------------

CREATE DATABASE design40;
USE design40;

-- --------------------------------------------------
-- CREACIÓN DE LAS TABLAS
-- --------------------------------------------------

CREATE TABLE horarios(
	nom_hor VARCHAR (30) NOT NULL,
    ini_hor INT NOT NULL,
    fin_hor INT NOT NULL,
    PRIMARY KEY (nom_hor)
);

CREATE TABLE permisos(
	nom_per VARCHAR (30) NOT NULL,
    aut_per VARCHAR (30) NOT NULL,
    PRIMARY KEY (nom_per)
);

CREATE TABLE registro(
	ced_reg INT (30) NOT NULL,
    nom_reg VARCHAR (30) NOT NULL,
    ape_reg VARCHAR (30) NOT NULL,
    car_reg VARCHAR (30) NOT NULL,
    rol_reg VARCHAR (30) NOT NULL,
    tel_reg BIGINT (30) NOT NULL,
    nom_hor_reg VARCHAR (30) NOT NULL,
    cor_reg VARCHAR (30) NOT NULL, 
    nom_per_reg VARCHAR (30) NOT NULL,
    sal_reg INT (30) NOT NULL,
    PRIMARY KEY (ced_reg),
    FOREIGN KEY (nom_hor_reg) REFERENCES horarios(nom_hor) ON DELETE CASCADE,
    FOREIGN KEY (nom_per_reg) REFERENCES permisos(nom_per) ON DELETE CASCADE
);

CREATE TABLE medicion(
	id_med INT AUTO_INCREMENT NOT NULL,
    fec_med DATE NOT NULL,
    ced_reg_med INT NOT NULL,
    ope_med VARCHAR (30) NOT NULL,
    are_med VARCHAR (30) NOT NULL,
    can_med INT NOT NULL,
    tie_med INT NOT NULL,
    for_rep INT NOT NULL,
    PRIMARY KEY (id_med),
    FOREIGN KEY (ced_reg_med) REFERENCES registro(ced_reg) ON DELETE CASCADE
);

CREATE TABLE reportes(
	id_rep INT NOT NULL,
    ced_reg_rep INT NOT NULL,
    id_med_rep INT NOT NULL,
    FOREIGN KEY (ced_reg_rep) REFERENCES registro(ced_reg) ON DELETE CASCADE,
    FOREIGN KEY (id_med_rep) REFERENCES medicion(id_med) ON DELETE CASCADE
);

CREATE TABLE user(
	uname VARCHAR (30) NOT NULL,
    pass VARCHAR (30) NOT NULL,
    fname VARCHAR (30) NOT NULL,
    lname VARCHAR (30) NOT NULL,
    designation VARCHAR (30) NOT NULL,
    ques VARCHAR (30),
    ans VARCHAR (30),
    PRIMARY KEY (uname),
    FOREIGN KEY (designation) REFERENCES permisos(nom_per) ON DELETE CASCADE 
);

-- --------------------------------------------------
-- INSERTAR DATOS
-- --------------------------------------------------

INSERT INTO horarios VALUES
	('Horario...', 0, 0),
    ('Diurno', 6, 14),
    ('Tarde', 14, 22),
    ('Nocturno', 22, 6),
    ('Oficina', 7, 17);

INSERT INTO permisos VALUES
    ('Administrador', 'Escritura'),
    ('Mantenimiento', 'Escritura'),
    ('Analista', 'Escritura'),
    ('Usuario', 'Lectura');

INSERT INTO registro VALUES 
    (1584678, 'Carlos', 'Ramirez', 'Cardador', 'Operario', 3148795, 'Diurno', 'Carlosr@hotmail.com', 'Usuario', 1500000),
    (3548794, 'Marcela', 'Bedoya', 'Troqueladora', 'Operaria', 2846464, 'Tarde', 'Marcebe@gmail.com', 'Usuario', 1200000),   
    (2354855, 'Lina', 'Turbay', 'Secretaria', 'Administracion', 6157845, 'Oficina', 'Linatur@hotmail.com', 'Administrador', 1300000),
    (11463565, 'Jose', 'Benitez', 'Analista', 'Operario', 2648523, 'Nocturno', 'Josebe@hotmail.com', 'Analista', 1200000);

INSERT INTO medicion VALUES 
    (1, '2021-04-20', 1584678, 'Unidad Cardada', 'Planta1', 50, 8, 85),
    (2, '2021-04-21', 3548794, 'Unidad Troquelada', 'Planta1', 60, 8, 95),
    (3, '2021-04-22', 2354855, 'Documentos', 'Centro', 20, 10, 70),
    (4, '2021-04-21', 11463565, 'Tiempo', 'Centro', 8, 8, 100);

INSERT INTO reportes VALUES 
    (1, 1584678, 1),
    (2, 3548794, 2),
    (3, 2354855, 3),
    (4, 11463565, 4);