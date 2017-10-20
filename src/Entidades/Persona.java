/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Persona {
    private long dni;
    private String nombre;

    public Persona(long dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void llamarMensajear(Telefono tel,long nroDestino, String mensaje){
       if(mensaje.isEmpty()){
        if(tel.llamar(nroDestino)){
            System.out.println("Llamada exitosa");            
        }
       }
       else if (tel instanceof Celular){
                if(((Celular)tel).enviarMensaje(nroDestino, mensaje)){
                    System.out.println("Llamada exitosa");
                }            
        }
       
           
       
    }
}
