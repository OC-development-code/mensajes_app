/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes.app;

/**
 *
 * @author Omar Cadiz
 */
public class Mensajes {
    private int idMensaje;
    private String mensaje;
    private String authorMensaje;
    private String fechaMensaje;

    public Mensajes(){
        
    }

    public Mensajes(String mensaje, String authorMensaje, String fechaMensaje) {
        this.mensaje = mensaje;
        this.authorMensaje = authorMensaje;
        this.fechaMensaje = fechaMensaje;
    }
    
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAuthorMensaje() {
        return authorMensaje;
    }

    public void setAuthorMensaje(String authorMensaje) {
        this.authorMensaje = authorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
    
    
}