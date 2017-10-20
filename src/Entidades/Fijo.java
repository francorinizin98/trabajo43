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
public class Fijo extends Telefono{
    private String tipoDeLinea;

    public Fijo(String tipoDeLinea, long numero, String modelo, String marca) {
        super(numero, modelo, marca);
        this.tipoDeLinea = tipoDeLinea;
    }

    public String getTipoDeLinea() {
        return tipoDeLinea;
    }

    public void setTipoDeLinea(String tipoDeLinea) {
        this.tipoDeLinea = tipoDeLinea;
    }

    @Override
    public boolean llamar(long nroDestino) {
        System.out.println("Llamando...");
        return true;
    }
    
    
    
}
