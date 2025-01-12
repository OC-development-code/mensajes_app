/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensajes.app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Omar Cadiz
 */
public class MensajesApp {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int option=0;
        do {            
            System.out.println("-----------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensaje");
            System.out.println("3. Editar Mensaje");
            System.out.println("4. Eliminar Mensajes");
            System.out.println("5. Salir");
            //Leer la option que el usuario elijio
            option= sc.nextInt();
            
            switch (option) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    
                    break;
            }
            
        } while (option !=5);
       
        
        Conexion conex= new Conexion();        
        try (Connection cnx= conex.get_connexion()) {            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}