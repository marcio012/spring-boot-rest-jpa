insert into Usuario(nome, email, senha) values ('Aluno', 'aluno@email.com', '1234567');

insert into Curso(nome, categoria) values ('Spring Boot', 'Programacao');
insert into Curso(nome, categoria) values ('Html 5', 'Front-end');

insert into Topico(titulo, mensagem, data_criacao, autor_id, curso_id) values ('Dúvida', 'Erro ao criar projeto', '2019-06-02', 1, 1);
insert into Topico(titulo, mensagem, data_criacao, autor_id, curso_id) values ('Dúvida 2', 'Projeto não compila', '2019-06-02', 1, 2);
insert into Topico(titulo, mensagem, data_criacao, autor_id, curso_id) values ('Dúvida 3', 'Tag Html', '2019-06-02', 1, 2);
