/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author afelr
 */
public class Nodo {
    private int nombre;
    private int cantRecibos;
    
    public Nodo(int nombre, int cantRecibos){
        this.nombre=nombre;
        this.cantRecibos=cantRecibos;
    }
    
    public int getNombre(){
        return nombre;
    }
    
    public int getRecibos(){
        return cantRecibos;
    }
}
