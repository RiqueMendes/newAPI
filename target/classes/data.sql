INSERT INTO pessoa (cpf, nome)
VALUES
  	('56637927082', 'Pessoa 1'),
  	('56637927082', 'Pessoa 2'),
  	('56637928787', 'Pessoa 3');

INSERT INTO produto (descricao, valor_unitario)
VALUES
  	('Produto 1', 30.0),
  	('Produto 2', 20.0),
  	('Produto 3', 20.0)
  	;
  	
INSERT INTO pedido (id_pessoa)
VALUES
	(1),
	(1),
	(2);
	
INSERT INTO pedido_item (id_produto, id_pedido, quantidade)
VALUES
	(1, 1, 3),
	(2, 1, 1),
	(1, 2, 2),
	(2, 2, 10);
	