/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

/**
 *
 * @author Pepe
 */
public class Camino {
    
    /*
    La clase camino representa el enlace existente entre cada uno de los nodos, la cual tendrá como atributos el si existe el enlace entre nodo y nodo,
    la distancia del mismo y la cantidad de ferormonas que posee.
    */

    private boolean arista;
    private int distancia;
    private int feromonas;

    public Camino() {
        this.arista = arista;
        this.distancia = distancia;
        this.feromonas = feromonas;
    }

    // Setter y getters

    public int getDistancia() {
        return distancia;
    }

    public int getFeromonas() {
        return feromonas;
    }

    public void setArista(boolean arista) {
        this.arista = arista;
    }

    public boolean isArista() {
        return arista;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setFeromonas(int feromonas) {
        this.feromonas = feromonas;
    }
    
    
}
