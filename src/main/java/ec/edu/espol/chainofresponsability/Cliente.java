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
public class Cliente {
    private static  Manejador getCadena(){
        Manejador mgarantia = new ManejadorGarantia();
        Manejador mexistencia = new ManejadorExistencia();
        Manejador mprecio = new ManejadorPrecio();
        mgarantia.setNext(mexistencia);
        mexistencia.setNext(mprecio);
        return mgarantia;
    }
}
