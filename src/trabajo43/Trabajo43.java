/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo43;
import Entidades.*;
/**
 *
 * @author Usuario
 */
public class Trabajo43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona yo=new Persona(41664249,"Juan");
        Celular lg=new Celular("Claro",4304897,"Zero","LG");
        yo.llamarMensajear(lg, 4557892, "");
        yo.llamarMensajear(lg, 4557892, "Hola");
    }
    
}
