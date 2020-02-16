package Clases;

import java.util.ArrayList;


public class Cola {
 
    private ArrayList nodos;

    public Cola(){
        nodos=new ArrayList<Nodo>();
        insertar(0);
    }

    public void insertar(int recibo){
        Nodo n;
        if(getNodos().isEmpty())
            n = new Nodo(0,recibo);
        else
            n = new Nodo(sigNodo(),recibo);
        nodos.add(n);
    }
    public void insertar(int nombre, int recibo){
        Nodo n = new Nodo(nombre,recibo);
        nodos.add(n);
    }

    public void eliminar(){
        nodos.remove(1);
    }

    public void resetear(){
        nodos.clear();
    }


    public ArrayList<Nodo> getNodos() {
        return nodos;
    }


    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
    
    public int sigNodo(){
        ArrayList<Nodo> n = getNodos();
        int l = n.size();
        return n.get(l-1).getNombre()+1;
    }
    public boolean maxRecibos(){
        return getNodos().get(1).getRecibos()>3;
    }
}