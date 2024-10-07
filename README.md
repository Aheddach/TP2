# Système de Messagerie d'Entreprise avec Java et MySQL

## Aperçu

Ce projet est une application de messagerie interne pour une entreprise, développée en Java et connectée à une base de données MySQL. L'application permet aux employés d'envoyer et de recevoir des messages, tout en utilisant JDBC pour gérer la connexion à la base de données.

## Technologies Utilisées

- **Java** : Langage de programmation principal utilisé pour le développement de l'application.
- **JDBC (Java Database Connectivity)** : API utilisée pour la connexion à la base de données MySQL et l'exécution de requêtes SQL.
- **MySQL** : Système de gestion de base de données utilisé pour stocker les informations sur les employés et les messages.
- **IDE Java** : Outils comme IntelliJ IDEA ou Eclipse pour le développement du projet.
- **Maven** (optionnel) : Outil de gestion des dépendances.

## Fonctionnalités Clés

1. **Gestion des Employés** : Insertion, modification, suppression et récupération d'employés dans la base de données.
2. **Système de Messagerie** : Envoi de messages entre employés et récupération des messages reçus par un employé spécifique.
3. **Gestion des Connexions** : Utilisation de JDBC pour gérer la connexion à la base de données, exécuter des requêtes SQL, et gérer les résultats.
4. **Gestion des Erreurs** : Gestion des exceptions liées aux opérations de base de données pour garantir la stabilité du système.

## Structure du Code

- **ma.projet.beans.Employe** : Classe représentant un employé avec un identifiant (ID), un nom et un prénom.
- **ma.projet.beans.Message** : Classe représentant un message avec un objet, un sujet, une date, et des informations sur l'émetteur et le récepteur.
- **ma.projet.service.EmployeService** : Classe gérant les opérations CRUD (Create, Read, Update, Delete) pour les employés.
- **ma.projet.service.MessageService** : Classe gérant les opérations CRUD pour les messages.
- **ma.projet.connexion.Connexion** : Classe gérant la connexion à la base de données MySQL.
- **ma.projet.test.Messagerie** : Classe contenant la méthode principale qui teste les différentes fonctionnalités (création d'employés, envoi de messages, affichage des messages).

## Configuration de la Base de Données

1. **Créer la base de données** : Créez une base de données nommée `messagerie`.
2. **Tables** : Exécutez les requêtes SQL ci-dessous pour créer les tables `employe` et `message` dans la base de données.

```sql
CREATE TABLE IF NOT EXISTS `employe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `objet` varchar(50) NOT NULL,
  `sujet` varchar(500) NOT NULL,
  `date` date NOT NULL,
  `idE` int(11) NOT NULL,
  `idR` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`idE`) REFERENCES `employe`(`id`),
  FOREIGN KEY (`idR`) REFERENCES `employe`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
## démonstration :

https://github.com/user-attachments/assets/9e59323c-dea1-4cdc-9993-08462e967984


