/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.*;

/**
 *
 * @author ricar
 */
public class conexion {
    //Conexión local
        public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_topicos","root","");
            return cn ;
        } catch (SQLException e) {
            System.out.println("Error en conexion local" + e);
        }
        return (null);
    }
}
