/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

import java.util.Arrays;

/**
 *
 * @author Pepe
 */
public class Grafo {
    
    private Ciudad ciudades [];
    private int [][] matDistancia;
    private double [][] matFeromonas;
    private boolean [][] matAdyacencia;
    private int ciudad; // Cantidad de nodos que posee el grafo

    public Grafo(int ciudad) {
        this.ciudades = new Ciudad [20];
        this.ciudad = ciudad;
        this.matAdyacencia = new boolean [ciudad][ciudad];
        this.matDistancia= new int [ciudad][ciudad];
        this.matFeromonas = new double [ciudad][ciudad];
        
        /*
        Se inicializa la matriz con los valores predeterminados, conociendo que todos los nodos estan enlazados entre sí.
        */
        /*
        Para llenar la matriz de adyacencia como el grafo debeser no dirigido,  totalmente enlazado
        y  no puede haber una arista hacia el mismo. Habrá arista si i es diferente a j
        Inicialmente llenamos la matriz de Distancias con -1, ya que el usuario no ha indicado
        los valores.
        La matriz de feromonas debe estar inicializada en 1/m siendo m
        la cantidad de ciudades.
        */
          for (int i = 0; i < ciudad; i++) {
            for (int j = 0; j < ciudad; j++) {
                
                this.matAdyacencia[i][j] = i != j;
                this.matDistancia[i][j] = 0;
                this.matFeromonas[i][j] = (1d/ciudad);
            }
          }
          
          for (int i = 0; i < ciudad; i++) {
            for (int j = 0; j < ciudad; j++) {
                System.out.println(this.matFeromonas[i][j]);
            }
            
            }
    
    }
    /*
    El método crear ciudad, crea un vector con la mayor cantidad de cuidades 
    y cuando se agrega una ciudad se guarda en el vector junto a su nombre
    */
    public void agregarCiudad(String nombre){
        for (int i = 0; i < ciudades.length ; i++) {
            if(ciudades[i]== null){
                ciudades[i]= new Ciudad(nombre,i);
                System.out.println(ciudades[i].getNombre());
                break;
            }
        }
        
    }

    /*
    El método agregar distancias recorre la matriz de Distancias y la llena con los datos 
    que indica el usuario 
    */
    public void agregarDistancias (int dis, int i , int j){
      
        matDistancia[i][j]=dis;
        matDistancia[j][i]=dis;
      
        for (int k = 0; k < matDistancia.length; k++) {
            for (int l = 0; l < matDistancia.length; l++) {
                System.out.print(matDistancia[k][l]);
            }
            System.out.println("");
        }
        
        System.out.println("");
      
    }
    
    
    public int[][] getMatDistancia() {
        return matDistancia;
    }

    public void setMatDistancia(int[][] matDistancia) {
        this.matDistancia = matDistancia;
    }

    public double[][] getMatFeromonas() {
        return matFeromonas;
    }

    public void setMatFeromonas(double[][] matFeromonas) {
        this.matFeromonas = matFeromonas;
    }

    public boolean[][] getMatAdyacencia() {
        return matAdyacencia;
    }

    // Setters y getters
    public void setMatAdyacencia(boolean[][] matAdyacencia) {    
        this.matAdyacencia = matAdyacencia;
    }

    public int getCiudad() {
        return ciudad;
    }

 
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }
    
    
}
