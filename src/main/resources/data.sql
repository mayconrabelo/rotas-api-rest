INSERT INTO ROTA(data, status) VALUES('2019-05-05 18:00:00', 'NOT_STARTED');
INSERT INTO PARADA(descricao, endereço, latitude,longitude,status_Parada,delivery_Radius) VALUES('ezfomeadoz', 'Av. Bulevar', '-3.8351241302460903','-38.51795765097331','NOT_ANSWER','10');

INSERT INTO ROTA_PARADAS(rota_id, paradas_id) VALUES(1, 1);

INSERT INTO ROTA(data, status) VALUES('2021-09-20 20:00:00', 'STARTED');
INSERT INTO PARADA(descricao, endereço, latitude,longitude,status_Parada,delivery_Radius) VALUES('ezfomeadoz 2', 'Av. Bulevar 1', '-3.8351241302460903','-38.51795765097331','NOT_ANSWER','10');

INSERT INTO ROTA_PARADAS(rota_id, paradas_id) VALUES(2, 2);