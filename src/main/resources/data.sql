-- Initial Data

INSERT INTO USER(birth_date, cpf, mail, name) 
VALUES({ts '2012-09-17'}, '97697727048', 'lucas@email.com', 'Lucas Gomes'), 
({ts '2012-09-17'}, '97697727043', 'teste@email.com', 'Fernando Souza'),
({ts '2012-09-17'}, '97697727047', 'teste2@email.com', 'Gil Souza');

INSERT INTO ADDRESS (cep, complement, number, street, user_id) VALUES ('35678-000', 'Rua Souza', 124, 'Av. Souza', 1), 
('35678-156', 'Rua Souza', 1248, 'Av. Souza', 2), ('35678-098', 'Rua Souza', 1249, 'Av. Souza', 3);