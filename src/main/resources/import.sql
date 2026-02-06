insert into genres (no_genre, libelle) values (1, 'Jeu de plateau');
insert into genres (no_genre, libelle) values (2, 'Jeu de cartes');
insert into genres (no_genre, libelle) values (3, 'Jeu de stratégie');
insert into genres (no_genre, libelle) values (4, 'Coopératif');
insert into genres (no_genre, libelle) values (5, 'Jeu de dé');
insert into genres (no_genre, libelle) values (6, 'Jeu d''enquete');
delete from jeux;

-- insert d'adresses
INSERT INTO adresses (id, code_postal, rue, ville) VALUES
(1, '75001', '10 rue de Rivoli', 'Paris'),
(2, '69002', '25 rue de la République', 'Lyon'),
(3, '13001', '5 rue Saint-Ferréol', 'Marseille'),
(4, '31000', '18 place du Capitole', 'Toulouse'),
(5, '44000', '42 quai de la Fosse', 'Nantes');


-- insert de clients
INSERT INTO clients (nom, prenom, email, no_telephone, no_adresse) VALUES
('Dupont', 'Jean', 'jean.dupont@gmail.com', '0612345678', 1),
('Martin', 'Sophie', 'sophie.martin@yahoo.fr', '0623456789', 2),
('Bernard', 'Luc', 'luc.bernard@outlook.com', '0634567890', 3),
('Petit', 'Camille', 'camille.petit@gmail.com', '0645678901', 1),
('Moreau', 'Antoine', 'antoine.moreau@proton.me', '0656789012', 4),
('Leroy', 'Emma', 'emma.leroy@gmail.com', '0667890123', 5);
