/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Omar Cadiz
 */
public class conexion {
    
    public Connection get_connexion(){
      Connection con =null;  
      try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        if (con !=null) {
               
        }
      }catch (SQLException ex) {
        System.out.println("Falla en la conexion, verificar los paquetes de coneccion de la DDBB. Puede que este desconectados los complementos de la DDBB o mal escritos los datos de coneccion");     
      }  
      return con;
    }             
}
