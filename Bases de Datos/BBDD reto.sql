CREATE TABLE Usuario (
id_Usuario integer PRIMARY KEY AUTO_INCREMENT,

nombre VARCHAR(14) NOT NULL,

apellido  VARCHAR(14) NOT NULL,

correo   VARCHAR(40) NOT NULL,
    
contrasena   VARCHAR(40) NOT NULL,

telefono  integer NOT NULL,

tipoUsuario ENUM ('administrador', 'cliente') NOT NULL
);


CREATE TABLE Habitaciones(

id_habitacion integer PRIMARY KEY AUTO_INCREMENT,

nºHabitación INTEGER NOT NULL,

nombre VARCHAR(14)  NULL,

capacidad integer NOT NULL,

descripcion  VARCHAR(100)  NULL,

tipoHabitación ENUM ('HabitacionIndividual', 'HabitacionDoble', 'HabitacionDeluxe') NOT NULL


);



CREATE TABLE Hotel (

    idHotel integer PRIMARY KEY AUTO_INCREMENT,

    nombre VARCHAR(14) NOT NULL,

    descripcion TEXT NULL,

    domicilio VARCHAR(200) NOT NULL,

    provincia VARCHAR(20) NOT NULL,

    codPostal integer NOT NULL,

    telefono integer NOT NULL
    );

CREATE TABLE reservas (

    idreserva integer PRIMARY KEY AUTO_INCREMENT,

    idhabitacion integer NOT NULL,

    correousuario VARCHAR(40) NULL,

    fechaentrada VARCHAR(20) NOT NULL,

    fechasalida VARCHAR(20) NOT NULL

    );
