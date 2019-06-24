/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

import java.util.Random;

/**
 *
 * @author Pepe
 */
public class Hormiga {
    private Ciudad ciudadesVisitadas[];
    private Ciudad ciudadActual;
    private int distanciaRecorrida;
    private int distanciaTotal;
    private String orden[];
    private Ciudad ciudadElegida;

    public Hormiga(Ciudad ciudadesVisitadas[]) {
        this.ciudadesVisitadas = ciudadesVisitadas;
        this.ciudadActual = ciudadActual;
        this.distanciaRecorrida = 0;
        this.distanciaTotal = 1;
        this.orden = orden;
    }
    
    /*
        Para iniciar la simulación la hormiga escoge una ciudad aleatoria del vector de ciudades posibles que se le pasa.
    */
    
    public Ciudad Incio(Ciudad posiblesCiu[], int cantCiudades){
        Random aleatorio = new Random();
        int ciudadAlea = 0+aleatorio.nextInt(cantCiudades);
        Ciudad ciudadElegida = posiblesCiu[ciudadAlea];
        ciudadElegida.setVisitada(true);
        return ciudadElegida;
    }
    
    /*
    Se elige el camino que tomara la hormiga mediante la formula dada en el planteamiento del proyecto, es decir, se calcula la probabilidad que tiene
    cada ciudad posible de ser escogida y aquella mayor es la seleccionada, por ello el método retorna una ciudad. El vector de ciudades cuenta con booleanos
    que permiten saber con true si la ciudad ya fue visitada y con false sino lo ha sido.
    */
    
    public Ciudad ElegirCiudad( double alpha, double beta, int matDistancia[][], double matFeromonas[][], int cantCiudades){
        Ciudad ciudadElegida = ciudadActual;
        double suma=0;
        double posibilidad=0;
        double probabilidad=0;
        for (int i = 0; i < cantCiudades; i++) {
            
//            for (int k = 0; k < matFeromonas.length; k++) {
//            for (int l = 0; l < matFeromonas.length; l++) {
//                System.out.print(matFeromonas[k][l]);
//            }
//            System.out.println("");
//        }
//        
        System.out.println("");
           if(!ciudadesVisitadas[i].isVisitada()){
               if(ciudadesVisitadas[i]!=ciudadActual){

                   suma += (Math.pow(matFeromonas[ciudadActual.getNumCiudad()][ciudadesVisitadas[i].getNumCiudad()],alpha)*
                       Math.pow(1.0/matDistancia[ciudadActual.getNumCiudad()][ciudadesVisitadas[i].getNumCiudad()],beta)); 
               }
            }
        }

        for (int j = 0; j < cantCiudades; j++) {
            
            if(!ciudadesVisitadas[j].isVisitada()){
                if(ciudadesVisitadas[j]!=ciudadActual){
                    posibilidad = ((Math.pow(matFeromonas[ciudadActual.getNumCiudad()][ciudadesVisitadas[j].getNumCiudad()], alpha)*
                        Math.pow(1.0/matDistancia[ciudadActual.getNumCiudad()][ciudadesVisitadas[j].getNumCiudad()], beta))/suma);
            
            if(posibilidad>probabilidad){
                ciudadElegida = ciudadesVisitadas[j];
            }
            }
                
            }

        }
        return ciudadElegida;
    }
    
    /*
        Método que actualice los datos de la hormiga para que la misma se mueva en el grafo y realice una iteración completa
    */
    
    public void Caminar(int ciudadesRestantes, double alpha, double beta, int matDistancia[][], double matFeromonas[][], int cantCiudades, int cantHormigas){
        int distancia=0;
        
            if(ciudadesRestantes>0){
                ciudadElegida = ElegirCiudad(alpha, beta, matDistancia, matFeromonas, cantCiudades);
                ciudadElegida.setVisitada(true);
                ciudadesRestantes -=1;
                
//                
//                System.out.println("NUMERO DE CIUDAD");
//                System.out.println(ciudadActual.getNumCiudad());
//                System.out.println(ciudadElegida.getNumCiudad());
//                
//                
                distancia = matDistancia[ciudadActual.getNumCiudad()][ciudadElegida.getNumCiudad()];
                System.out.println(matDistancia[ciudadActual.getNumCiudad()][ciudadElegida.getNumCiudad()]);
                ActFeromonasArista(matFeromonas, ciudadElegida, cantHormigas, distanciaTotal);
                distanciaRecorrida += distancia;
//                System.out.println(distancia+"DISTANCIAAAA");
                ciudadActual = ciudadElegida;
                Caminar(ciudadesRestantes, alpha, beta, matDistancia, matFeromonas, cantCiudades, cantHormigas);
                distanciaTotal = distanciaRecorrida;
//                System.out.println(distanciaTotal+"DISTANCIAAAA ITERACION");
//                System.out.println("LISTOO");
            }
    }
    
    /*
    Actualización de feromonas en el camino que transita la hormiga
    */
    public void ActFeromonasArista(double matFeromona[][], Ciudad elegida, int cantHormigas, int distancia){
        double feromona=0;
        for (int i = 0; i <cantHormigas; i++) {
            feromona += (1.0/distancia);
        }
        matFeromona[ciudadActual.getNumCiudad()][elegida.getNumCiudad()]+=feromona;
    }
    
    /*
    Actualización de feromonas después de cada iteración
    */
    public void ActFeromonasIteracion(double matFeromona[][], double ro){
        double feromona = 0;
        for (int i = 0; i < matFeromona.length; i++) {
            for (int j = 0; j < matFeromona.length; j++) {
                matFeromona[i][j]=(1d-ro)*matFeromona[i][j];
            }
        }
    }
    
    //Setter y Getters

    public int getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(int distanciaIteracion) {
        this.distanciaTotal = distanciaIteracion;
    }

    public Ciudad getCiudadActual() {
        return ciudadActual;
    }

    public Ciudad[] getCiudadesVisitadas() {
        return ciudadesVisitadas;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setCiudadActual(Ciudad ciudadActual) {
        this.ciudadActual = ciudadActual;
    }

    public void setCiudadesVisitadas(Ciudad[] ciudadesVisitadas) {
        this.ciudadesVisitadas = ciudadesVisitadas;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public void setOrden(String[] orden) {
        this.orden = orden;
    }
    
    
}
