/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.connexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACCENT W5000
 */
public class Connexion {
    private static Connection connection;
     private static FileInputStream f = null;
    private static Properties p = null;
    private static Connection cn = null;

    static {
       
        try {
        FileInputStream f = new FileInputStream("ffff.properties");
        Properties p = new Properties();
        p.load(f);
        String url = p.getProperty("jdbc.url");
        String login = p.getProperty("jdbc.username");
        String password = p.getProperty("jdbc.password");
        String driver = p.getProperty("jdbc.driver");
        Class.forName(driver);
        connection = DriverManager.getConnection(url, login, password);
        } catch (Exception ex) {
        System.out.println(""+ex.getMessage());
        }
        }
            public static Connection getConnection() {
                return connection;
            }
}
