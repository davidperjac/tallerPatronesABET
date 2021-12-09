/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.chainofresponsability;

/**
 *
 * @author user
 */
public abstract class Manejador {
    public Manejador manejador;
    
    public void setNext(Manejador m){
        manejador=m;
    }
    public abstract void manejar();
}
