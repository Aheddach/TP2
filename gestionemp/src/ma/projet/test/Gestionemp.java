/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.beans.Developpeur;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;

/**
 *
 * @author ACCENT W5000
 */
public class Gestionemp {


    public static void main(String[] args) {
        
        // Services pour gérer les développeurs et les managers
        DeveloppeurService developpeurService = new DeveloppeurService();
        ManagerService managerService = new ManagerService();
        
        // Créer deux développeurs
        Developpeur dev1 = new Developpeur(1,"Alice", 5000);
        Developpeur dev2 = new Developpeur(2,"Bob", 5500);
        developpeurService.create(dev1);
        developpeurService.create(dev2);

//        // Créer un manager qui gère les deux développeurs
//        Manager manager = new Manager(3, "Charlie", 8000);
//        managerService.create(manager);
//
//        // Créer un 3ème développeur
//        Developpeur dev3 = new Developpeur(4, "David", 6000);
//        developpeurService.create(dev3);
//
//        // Afficher la liste des développeurs et du manager
//        System.out.println("---- Liste des Développeurs ----");
//        for (Developpeur d : developpeurService.getAll()) {
//            System.out.println("Nom: " + d.getNom() + ", Salaire: " + d.getSalaire());
//        }
//
//        System.out.println("---- Liste des Managers ----");
//        for (Manager m : managerService.getAll()) {
//            System.out.println("Nom: " + m.getNom() + ", Salaire: " + m.getSalaire());
//        }
//
//        // Exemple de mise à jour du salaire de dev1
//        System.out.println("\n---- Mise à jour du salaire de Alice ----");
//        dev1.setSalaire(5200);
//        developpeurService.update(dev1);
//
//        // Exemple de suppression d'un développeur
//        System.out.println("\n---- Suppression de Bob ----");
//        developpeurService.delete(dev2);
//
//        // Afficher la liste mise à jour
//        System.out.println("\n---- Liste des Développeurs Mise à jour ----");
//        for (Developpeur d : developpeurService.getAll()) {
//            System.out.println("Nom: " + d.getNom() + ", Salaire: " + d.getSalaire());
//        }
    }
}
    

