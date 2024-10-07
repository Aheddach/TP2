# Système de Messagerie d'Entreprise avec Java et MySQL

## Aperçu

Ce projet est une application de messagerie interne pour une entreprise, développée en Java et connectée à une base de données MySQL. L'application permet aux employés d'envoyer et de recevoir des messages, tout en utilisant JDBC pour gérer la connexion à la base de données.

## Technologies Utilisées

- **Java** : Langage de programmation principal utilisé pour le développement de l'application.
- **JDBC (Java Database Connectivity)** : API utilisée pour la connexion à la base de données MySQL et l'exécution de requêtes SQL.
- **MySQL** : Système de gestion de base de données utilisé pour stocker les informations sur les employés et les messages.
- **IDE Java** :  neatbeans pour le développement du projet.
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


# Système de Gestion des Employés en Java avec MySQL

## Aperçu

Ce projet simule la gestion hiérarchique des employés dans une petite entreprise, en mettant en place une structure où chaque employé peut avoir un supérieur hiérarchique. Le système utilise une base de données MySQL pour stocker les informations sur les employés et leurs relations hiérarchiques, permettant ainsi d'afficher les noms et les salaires des employés de haut en bas de la hiérarchie.

## Technologies Utilisées

- **Java** : Langage de programmation principal utilisé pour implémenter la logique métier et les accès aux données.
- **JDBC (Java Database Connectivity)** : API utilisée pour interagir avec la base de données MySQL.
- **MySQL** : Base de données relationnelle utilisée pour stocker les informations des employés.

## Fonctionnalités Clés

1. **Connexion à la Base de Données** : Gestion de la connexion à la base de données MySQL via un fichier `properties` contenant les informations d'identification.
2. **Gestion Hiérarchique des Employés** : Modélisation de la hiérarchie de l'entreprise avec des classes représentant différentes catégories d'employés (Directeur général, Manager, Développeur).
3. **Opérations CRUD** : Ajout, modification, suppression et récupération des informations sur les employés.
4. **Affichage Hiérarchique** : Affichage des employés, de haut en bas, avec leurs noms et salaires selon la hiérarchie de l'entreprise.

## Structure du Projet

- **ma.projet.connexion** : Contient la classe `Connexion` pour gérer la connexion à la base de données.
- **ma.projet.beans** : Contient les classes représentant les différents types d'employés (`Personne`, `Manager`, `Developpeur`).
- **ma.projet.dao** : Interface `IDao` pour définir les méthodes CRUD à implémenter.
- **ma.projet.service** : Implémente les opérations CRUD pour chaque type d'employé dans les classes `ManagerService` et `DeveloppeurService`.
- **ma.projet.test** : Contient la classe `Entreprise` qui teste les différentes fonctionnalités, crée et gère les employés dans l'entreprise, et affiche leurs salaires et noms dans l'ordre hiérarchique.

## Diagramme de Classe

Le diagramme de classe pour ce projet modélise la hiérarchie des employés, avec un Directeur général au sommet, un Manager sous sa direction, et plusieurs Développeurs sous la responsabilité du Manager.

## Exemple d'Utilisation

Dans la classe `Entreprise`, voici un exemple d'actions effectuées :

1. Création de deux développeurs.
2. Création d'un manager responsable des deux développeurs.
3. Ajout d'un troisième développeur.
4. Ajout d'un directeur général supervisant le manager et le troisième développeur.
5. Affichage des employés de haut en bas avec leurs salaires.

