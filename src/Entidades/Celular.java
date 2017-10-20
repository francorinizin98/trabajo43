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
public class Celular extends Telefono{
    private String empresa;

    public Celular(String empresa, long numero, String modelo, String marca){
        super(numero, modelo, marca);
        this.empresa=empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public boolean enviarMensaje(long nroDestino, String Mensaje){
        System.out.println("Enviando...");
        return true;
    }
    
    public boolean llamar(long nroDestino){
        System.out.println("Llamando...");
        return true;
    }    
    
    
}
