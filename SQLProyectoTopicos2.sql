--Autor: Alan Yahir Japhet Gómez Mireles
--No. Control: 20130820
--Fecha de creación: 01 Abril 2022
--Fecha de última modificación: 06 Abril 2022

--Proyecto Tópico 2
--Topicos Avanzados de programación

--Crear la base de datos

create database ProyectoTopicosG
Go

--Poner en uso la base de datos
use ProyectoTopicosG
Go

--Crear la tabla Pacientes: con Id_paciente, nombre y apellidos, edad, sexo, telefono, Id_cts (LLAVE FORANEA)
--Llave Id_paciente

Create table Pacientes
(
Id_paciente smallint,
Nombre varchar(15),
ApPaterno varchar (15),
ApMaterno varchar (15),
Edad smallint,
Sexo char check(Sexo in ('F','M')),
Telefono varchar(10),
Id_cts smallint
primary key (Id_paciente)
)
Go

--Crear la tabla Catalogo de sangre: con Id_cts y tipo de sangre
--Llave Id_cts
Create table Catalogo
(
Id_cts smallint,
TipoSangre varchar(3),
PorcentajeRareza int
primary key (Id_cts)
)
Go

--Crear la tabla Medicos: con Id_medico, nombre y apellidos, Id_Hospital (LLAVE FORANEA)
--Llave Id_medico
Create table Medicos
(
Id_medico smallint,
NombreM varchar(15),
ApPaternoM varchar(15),
ApMaternoM varchar(15),
Edad int,
AñosExperiencia int,
FamiliasAtiende int,
Id_hospital smallint
primary key (Id_medico)
)
Go

--Crear la tabla Medico_Paciente: con Id_medico y Id_paciente (LLAVES FORANEAS)
Create table Medico_Paciente
(
Id_medico smallint,
Id_paciente smallint
primary key (Id_medico, Id_paciente)
)
Go

--Crear la tabla Hospitales: con Id_hospital, NombreHospital y Direccion
--Llave Id_hospital
Create table Hospitales
(
Id_hospital smallint,
NombreHospital varchar(25),
Direccion varchar (30),
AñosOperando int
primary key (Id_hospital)
)
Go

--RESTRICCIONES--

--1a restriccion
alter table Pacientes
add constraint FK_Cts
foreign key (Id_cts) references Catalogo(Id_cts)
Go

--2a restricción
alter table Medicos
add constraint FK_Hos
foreign key (Id_hospital) references Hospitales(Id_hospital)
Go

--3a, 3b restriccion
alter table Medico_Paciente
add constraint FK_Med
foreign key (Id_medico) references Medicos(Id_medico)
Go
alter table Medico_Paciente
add constraint FK_Pac
foreign key (Id_paciente) references Pacientes(Id_paciente)
Go

--INSERTAR LA INFORMACIÓN
--Tabla Catalogo
insert into Catalogo values (1,'A+',30)
insert into Catalogo values (2,'A-',6)
insert into Catalogo values (3,'B+',9)
insert into Catalogo values (4,'B-',2)
insert into Catalogo values (5,'AB+',4)
insert into Catalogo values (6,'AB-',1)
insert into Catalogo values (7,'O+',39)
insert into Catalogo values (8,'O-',9)

--Tabla Pacientes
insert into Pacientes values (2255, 'Maria','Velez','Boca', 22, 'F', 8714001555, 2)
insert into Pacientes values (1055, 'Arturo','Chile','Chilaca', 18, 'M', 8724001255, 1)
insert into Pacientes values (1415, 'Jose','Mireles','Montoya', 35, 'M', 8714155150, 3)
insert into Pacientes values (2015, 'Ramon','Gomez','Garcia', 45, 'M', 8715153220, 4)
insert into Pacientes values (1698, 'Johana','Gonzalez','Martinez', 19, 'F', 8724586262, 8)
insert into Pacientes values (1000, 'Adriana','Alba','Ocasio', 20, 'F', 8715651414, 5)
insert into Pacientes values (2000, 'Sandra','Perez','Lopez', 22, 'F', 8725055050, 6)
insert into Pacientes values (1100, 'Adrian','Torres','Guerra', 48, 'M', 8715256251, 7)


--Tabla Hospitales
insert into Hospitales values (1333,'General 71', 'Calle Agustin Lara #69',63)
insert into Hospitales values (1221,'General 16', 'Av. Independencia #241',49)
insert into Hospitales values (1789,'Militar Regional', 'Av.20 de Noviembre #10',25)
insert into Hospitales values (1987,'Bitalbe', 'Av. 5 de Mayo #145',10)
insert into Hospitales values (2215,'Hospital Médica Sur','REVOLUCION MEXICANA 60',41)
insert into Hospitales values (2351,'Centro Médico Nacional','AGUSTIN MELGAR 2328',23)
insert into Hospitales values (2415,'Angeles Lomas','FRESNO 905',63)
insert into Hospitales values (2201,'Toronto General','CALLE DE LA REFORMA 269',15)

--Tabla Medicos
insert into Medicos values (1415,'Oscar','Mireles','Lopez',30,9,3,1333)
insert into Medicos values (2115,'Omar','Lopez','Ciseña',46,20,10,2215)
insert into Medicos values (1213,'Gabriela','Luna','Vazquez',65,14,8,1221)
insert into Medicos values (1212,'Marina','Chavez','Arguijo',55,25,12,2351)
insert into Medicos values (1616,'Heidi','Palacios','Garza',49,12,5,2415)
insert into Medicos values (1818,'Alejandra','Cardenas','Martinez',50,5,1,1789)
insert into Medicos values (1234,'Ulises','Gomez','Chavez',58,30,15,1987)
insert into Medicos values (1238,'Jose','Ruiz','Ramoz',65,18,20,2201)

--Tabla Medico_Paciente
insert into Medico_Paciente values (1415,2255)
insert into Medico_Paciente values (1415,1055)
insert into Medico_Paciente values (2115,1415)
insert into Medico_Paciente values (1213,2015)
insert into Medico_Paciente values (1213,1698)
insert into Medico_Paciente values (1212,1000)
insert into Medico_Paciente values (1616,2000)
insert into Medico_Paciente values (1818,1100)


select*from Pacientes
select*from Catalogo
select*from Medicos
select*from Medico_Paciente
select*from Hospitales