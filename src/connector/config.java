/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Brian R
 */
public class config {

    public static Connection connection = null;

    public static Connection Connection() {

        try {
//            String username = "root";
//            String password = "";
            String username = "postgres";
            String password = "brianrizqi";
            String database = "e-waralaba";
//            String url = "jdbc:mysql://localhost/" + database;
//            Class.forName("com.postgresql.jdbc.Driver");
            String url = "jdbc:postgresql://localhost:5432/"+database;
            connection = DriverManager.getConnection(url, username, password);
//            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR");
        }

        return connection;
    }

    public static void main(String[] args) {
        System.out.println(config.Connection());
    }
}
