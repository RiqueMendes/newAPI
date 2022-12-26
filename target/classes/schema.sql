CREATE TABLE pessoa (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  cpf VARCHAR(11) NOT NULL,
  nome VARCHAR(250) NOT NULL
);

CREATE TABLE produto (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  descricao VARCHAR(50) NOT NULL,
  valor_unitario NUMERIC(10,2) NOT NULL
);

CREATE TABLE pedido(
 id INT AUTO_INCREMENT  PRIMARY KEY,
 id_pessoa INT,
 FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);

CREATE TABLE pedido_item(
id INT AUTO_INCREMENT PRIMARY KEY,
id_produto INT,
quantidade INT,
id_pedido INT,
 FOREIGN KEY (id_produto) REFERENCES produto(id),
 FOREIGN KEY (id_pedido) REFERENCES pedido(id)
);





