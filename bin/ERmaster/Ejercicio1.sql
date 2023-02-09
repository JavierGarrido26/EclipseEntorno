SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Petardos_tienen_Mecha;
DROP TABLE IF EXISTS Mechas;
DROP TABLE IF EXISTS Petardos;




/* Create Tables */

CREATE TABLE Mechas
(
	Cod_Mecha int(100) NOT NULL,
	PRIMARY KEY (Cod_Mecha)
);


CREATE TABLE Petardos
(
	Cod_petardo int(100) NOT NULL,
	Dureza_Petardo float(10,3) NOT NULL,
	PRIMARY KEY (Cod_petardo)
);


CREATE TABLE Petardos_tienen_Mecha
(
	Cod_petardo_fk int(100) NOT NULL,
	Cod_Mecha_fk int(100) NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE Petardos_tienen_Mecha
	ADD FOREIGN KEY (Cod_Mecha_fk)
	REFERENCES Mechas (Cod_Mecha)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Petardos_tienen_Mecha
	ADD FOREIGN KEY (Cod_petardo_fk)
	REFERENCES Petardos (Cod_petardo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



