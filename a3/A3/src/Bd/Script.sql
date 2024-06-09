
create table usuarios(
    id int auto_increment  primary key,
    nome varchar(200),
    email varchar(200),
    usuario varchar(200),
    senha varchar(200),
    cpf varcha(20)
);

insert into usuarios (id, nome, fone, email,cpf)
values (1,"Vitor","11 6373-2112", "abila@exemplo.com.br","111.111.111-11");

insert into usuarios (nome, fone, email)
values ("Joao","11 4002-8922", "jp@exemplo.com.br"),
	   ("Cadu","99 9999-9999", "cadu@exemplo.com.br"),
       ("Isabely", "11 6666-6666", "isa@exemplo.com.br");


           

select * from usuarios;





create table consultas(
nome-paciente VARCHAR(100),
CPF-paciente VARCHAR(100) primary key,
unidade VARCHAR(100),
cidade VARCHAR(100),
Especialidade VARCHAR(100),
dataHora DATE ); 







