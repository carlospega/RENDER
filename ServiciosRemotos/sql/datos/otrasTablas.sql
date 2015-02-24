-- Tablas accesorias dependientes -- 
Insert into accesos (idAcceso, acceso) values ('DIAL_UP','DIAL UP');
Insert into accesos (idAcceso, acceso) values ('ADSL','ADSL');
Insert into accesos (idAcceso, acceso) values ('CABLEMODEN','CABLEMODEN');
Insert into accesos (idAcceso, acceso) values ('WIRELESS','WIRELESS');
Insert into accesos (idAcceso, acceso) values ('CELULAR','CELULAR');
Insert into accesos (idAcceso, acceso) values ('SATELITAL','SATELITAL');
Insert into accesos (idAcceso, acceso) values ('BPL','BPL');
Insert into accesos (idAcceso, acceso) values ('WIMAX','WIMAX');
Insert into accesos (idAcceso, acceso) values ('FIBRA_OPTICA','FIBRA OPTICA');
Insert into accesos (idAcceso, acceso) values ('OTROS','OTROS');

Insert into servicios (idServicio, servicio) values ('610','610');
Insert into servicios (idServicio, servicio) values ('611','611');
Insert into servicios (idServicio, servicio) values ('612','612');
Insert into servicios (idServicio, servicio) values ('NRO_GEOGRAFICO','Nº GEOGRAFICO');
Insert into servicios (idServicio, servicio) values ('BANDA_ANCHA','BANDA ANCHA');
Insert into servicios (idServicio, servicio) values ('OTROS','OTROS');

Insert into accesos_servicio (idAcceso, idServicio) values ('DIAL_UP','610');
Insert into accesos_servicio (idAcceso, idServicio) values ('DIAL_UP','611');
Insert into accesos_servicio (idAcceso, idServicio) values ('DIAL_UP','612');
Insert into accesos_servicio (idAcceso, idServicio) values ('DIAL_UP','NRO_GEOGRAFICO');
Insert into accesos_servicio (idAcceso, idServicio) values ('DIAL_UP','OTROS');
Insert into accesos_servicio (idAcceso, idServicio) values ('ADSL','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('CABLEMODEN','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('WIRELESS','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('CELULAR','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('SATELITAL','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('BPL','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('WIMAX','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('FIBRA_OPTICA','BANDA_ANCHA');
Insert into accesos_servicio (idAcceso, idServicio) values ('OTROS','OTROS');




