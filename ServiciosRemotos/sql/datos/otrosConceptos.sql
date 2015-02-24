--canales
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (1,'Atencion_Telefonica','Atencion Telefonica',null,'canal');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (2,'Atencion_Personalizada_Sucursal','Atencion Personalizada - Sucursal',null,'canal');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (3,'Atencion_en_Redes_Sociales','Atención en Redes Sociales / Web / Mail / Postal u otros medios Escritos',null,'canal');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (4,'Otros','Otros',null,'canal');

--tiposcontacto
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (5,'Reclamo','Reclamo',null,'contacto');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (6,'Consulta','Consulta',null,'contacto');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (7,'Asistencia','Asistencia',null,'contacto');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (8,'Solicitud_de_alta_de_servicio','Solicitud de alta de servicio',null,'contacto');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (9,'Otros','Otros',null,'contacto');

--tiposinfo1
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (11,'Audio','Audio',null,'tipo_informacion1');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (12,'Audio_Bidireccional','Audio Bidireccional',null,'tipo_informacion1');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (13,'Video','Video',null,'tipo_informacion1');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (14,'Video_Bidireccional','Video Bidireccional',null,'tipo_informacion1');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (15,'Datos','Datos',null,'tipo_informacion1');

--tiposinfo2
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (16,'Audio','Audio',null,'tipo_informacion2');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (17,'Audio_Bidireccional','Audio Bidireccional',null,'tipo_informacion2');

--areasred
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (18,'Area_de_Red_Interna_1','Area de Red Interna 1',null,'red_interna');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (19,'Area_de_Red_Interna_2','Area de Red Interna 2',null,'red_interna');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (20,'Area_de_Red_Interna_3','Area de Red Interna 3',null,'red_interna');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (21,'Area_de_Red_Interna_4','Area de Red Interna 4',null,'red_interna');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (22,'Area_de_Red_Interna_5','Area de Red Interna 5',null,'red_interna');

--unidades
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (23,'mbps','Mbps',null,'unidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (24,'n*E1','n*E1',null,'unidad');

--tecnologias
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (25,'SDH','SDH',null,'tecnologia');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (26,'DWDM','DWDM',null,'tecnologia');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (27,'PDH','PDH',null,'tecnologia');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (28,'IP','IP',null,'tecnologia');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (29,'Otros','Otros',null,'tecnologia');

--medios
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (30,'FO','FO',null,'medio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (31,'MW','MW',null,'medio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (32,'Otros','Otros',null,'medio');

--tendidos
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (33,'AEREO','AEREO',null,'tendido');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (34,'SUBTERRANEO','SUBTERRANEO',null,'tendido');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (35,'Otros','Otros',null,'tendido');

--aplicaciones
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (36,'MASIVA','MASIVA',null,'aplicacion');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (37,'POR ADHESION','POR ADHESION',null,'aplicacion');

--segmentos
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (38,'HOGARES','HOGARES',null,'segmento');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (39,'COMERCIAL','COMERCIAL',null,'segmento');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (40,'JUBILADOS','JUBILADOS',null,'segmento');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (41,'GOBIERNO','GOBIERNO',null,'segmento');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (42,'PROFESIONALES','PROFESIONALES',null,'segmento');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (43,'OTROS','OTROS',null,'segmento');

--modalidades1
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (44,'POSPAGO','POSPAGO',null,'modalidad1');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (45,'MIXTO','MIXTO',null,'modalidad1');

--modalidades2
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (46,'POSPAGO','POSPAGO',null,'modalidad2');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (47,'PREPAGO','PREPAGO',null,'modalidad2');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (48,'MIXTO','MIXTO',null,'modalidad2');

--recargas
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (49,'Hasta_10_pesos','Hasta 10 pesos.',null,'recargaTipo');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (50,'desde_10_hasta_20_pesos','desde 10 hasta 20 pesos.',null,'recargaTipo');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (51,'desde_20_hasta_30_pesos','desde 20 hasta 30 pesos.',null,'recargaTipo');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (52,'desde_30_hasta_50_pesos','desde 30 hasta 50 pesos.',null,'recargaTipo');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (53,'desde_50','desde 50.',null,'recargaTipo');

--anios
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (54,'2010','2010',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (55,'2011','2011',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (56,'2012','2012',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (57,'2013','2013',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (58,'2014','2014',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (59,'2015','2015',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (60,'2016','2016',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (61,'2017','2017',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (62,'2018','2018',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (63,'2019','2019',null,'anio');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (64,'2020','2020',null,'anio');

--instituciones
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (65,'BIBLIOTECAS','BIBLIOTECAS',null,'institucion');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (66,'FINES_COMERCIALES','FINES COMERCIALES',null,'institucion');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (67,'FINES_SOCIALES','FINES SOCIALES',null,'institucion');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (68,'INSTITUCIONALES','INSTITUCIONALES',null,'institucion');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (69,'ESPACIO PUBLICOS','ESPACIO PUBLICOS',null,'institucion');

--velocidades
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (70,'HASTA512kbps','HASTA 512 kbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (71,'512Kbps_1Mbps','+ 512 Kbps - 1 Mbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (72,'1Mbps_6Mbps','+ 1 Mbps - 6 Mbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (73,'6Mbps_10Mbps','+ 6 Mbps - 10 Mbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (74,'10Mbps_20Mbps','+ 10 Mbps - 20 Mbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (75,'20Mbps_30Mbps','+ 20 Mbps - 30 Mbps',null,'velocidad');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (76,'30Mbps','+ 30 Mbps',null,'velocidad');

--subidas
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(77,'HASTA512kbps','HASTA 512 kbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(78,'512Kbps_1Mbps','+ 512 Kbps - 1 Mbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(79,'1Mbps_6Mbps','+ 1 Mbps - 6 Mbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (80,'6Mbps_10Mbps','+ 6 Mbps - 10 Mbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (81,'10Mbps_20Mbps','+ 10 Mbps - 20 Mbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (82,'20Mbps_30Mbps','+ 20 Mbps - 30 Mbps',null,'velocidadSubida');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (83,'30Mbps','+ 30 Mbps',null,'velocidadSubida');

--bajadas
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (84,'HASTA512kbps','HASTA 512 kbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (85,'512Kbps_1Mbps','+ 512 Kbps - 1 Mbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (86,'1Mbps_6Mbps','+ 1 Mbps - 6 Mbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (87,'6Mbps_10Mbps','+ 6 Mbps - 10 Mbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (88,'10Mbps_20Mbps','+ 10 Mbps - 20 Mbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (89,'20Mbps_30Mbps','+ 20 Mbps - 30 Mbps',null,'velocidadBajada');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (90,'30Mbps','+ 30 Mbps',null,'velocidadBajada');

--abonos
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (91,'Hasta_10_pesos','Hasta 10 pesos.',null,'abono');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (92,'desde_10_hasta_20_pesos','desde 10 hasta 20 pesos.',null,'abono');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (93,'desde_20_hasta_30_pesos','desde 20 hasta 30 pesos.',null,'abono');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (94,'desde_30_hasta_50_pesos','desde 30 hasta 50 pesos.',null,'abono');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES (95,'desde_50','desde 50.',null,'abono');

--destinos
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(96,'Prestador','Prestador',null,'destino');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(97,'NAP','NAP',null,'destino');

--tarifasAcceso
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(98,'ADSL','ADSL',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(99,'BPL','BPL',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(100,'CABLEMODEN','CABLEMODEN',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(101,'CELULAR','CELULAR',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(102,'DIAL_UP','DIAL_UP',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(103,'FIBRA_OPTICA','FIBRA_OPTICA',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(104,'OTROS','OTROS',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(105,'SATELITAL','SATELITAL',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(106,'WIMAX','WIMAX',null,'tarifasAcceso');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(107,'WIRELESS','WIRELESS',null,'tarifasAcceso');

--planesAcceso
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(108,'ADSL','ADSL',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(109,'BPL','BPL',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(110,'CABLEMODEN','CABLEMODEN',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(111,'CELULAR','CELULAR',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(112,'DIAL_UP','DIAL_UP',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(113,'FIBRA_OPTICA','FIBRA_OPTICA',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(114,'OTROS','OTROS',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(115,'SATELITAL','SATELITAL',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(116,'WIMAX','WIMAX',null,'planesAccesos');
INSERT INTO conceptos (id,nombre, valor, idpadre, tipo) VALUES(117,'WIRELESS','WIRELESS',null,'planesAccesos');

