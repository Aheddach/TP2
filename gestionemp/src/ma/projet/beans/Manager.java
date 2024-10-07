/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.List;

/**
 *
 * @author ACCENT W5000
 */
public class Manager extends Personne{

   private List<Developpeur> developpeurs;

    public Manager(int id, String nom, int salaire, List<Developpeur> developpeurs) {
        super(id, nom, salaire);
        this.developpeurs = developpeurs;
    }

    public Manager(int id, String nom, int salaire) {
        
    }

    public List<Developpeur> getDeveloppeurs() {
        return developpeurs;
    }

    public void setDeveloppeurs(List<Developpeur> developpeurs) {
        this.developpeurs = developpeurs;
    }
    
    
}
