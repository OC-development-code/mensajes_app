/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajes.app;

import java.sql.Connection;

/**
 *
 * @author Omar Cadiz
 */
public class MensajesApp {

    public static void main(String[] args) {
        conexion conex= new conexion();        
        try (Connection cnx= conex.get_connexion()) {            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}