/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;

/**
 *
 * @author ACCENT W5000
 */
public class ManagerService implements IDao<Manager>{

    @Override
    public boolean create(Manager o) {
        try {
            String req = "insert into Developpeur (id, nom, salaire) values(?,?,?)";
            PreparedStatement ps =
            Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
            ps.setString(2, o.getNom());          
            ps.setInt(3, o.getSalaire());
            
            if (ps.executeUpdate() == 1) {
            return true;
            }
        } catch (SQLException ex) {
        Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE,
        null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Manager o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Manager o) {
               boolean r = false;
        try {
            String req = "DELETE FROM `Manager` where id  = ?";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            st.setInt(1, o.getId());
            int n = st.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public Manager getById(int id) {
         try {
            String req = "select * from Manager where id = ?";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Manager(rs.getInt("id"), rs.getString("nom"), rs.getInt("salaire"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Manager> getAll() {
         List<Manager> manager = new ArrayList<>();
        try {
            String req = "select * from Manager";
            PreparedStatement st = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                manager.add(new Manager(rs.getInt("id"), rs.getString("nom"), rs.getInt("salaire")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return manager;
    }
    
}
