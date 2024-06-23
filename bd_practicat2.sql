create database bd_practicat2;

use bd_practicat2;

CREATE TABLE Medico
(
 IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)
);

insert into Medico values 
(1, 'Juan', 'Escudero', '2003-09-26'), 
(2, 'Mateo', 'Alonso', '2001-11-15'), 
(3, 'Sebastian', 'Masias', '2000-07-30'),
(4, 'Jefferson', 'Roca', '1998-05-08'),
(5, 'Diego', 'Alfonzo', '1995-12-13');

CREATE TABLE Especialidad
(
 IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)
 );
 
 insert into Especialidad values
 (1, 'Odontología', 'Dientes', '2023-06-25', 5),
 (2, 'Podología', 'Pies', '2024-07-20', 4),
 (3, 'Cirugía General', 'Cirugías', '2022-08-12', 3),
 (4, 'Dermatología', 'Piel', '2022-09-14', 2),
 (5, 'Cardiología', 'Corazón', '2020-03-10', 1);