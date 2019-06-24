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
public class Ciudad {
    private String nombre;
    private int numCiudad;
    private boolean visitada;

    public Ciudad(String nombre, int numCiudad) {
        this.nombre = nombre;
        this.visitada = visitada;
        this.numCiudad = numCiudad;
    }
    
    
    //Setters y getters

    public int getNumCiudad() {
        return numCiudad;
    }

    public void setNumCiudad(int numCiudad) {
        this.numCiudad = numCiudad;
    }
    
    public boolean isVisitada() {
        return visitada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
