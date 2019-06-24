/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Lenovo
 */
public class Nodo {
    private int x,y;
    public static final int d =30;
    private String nombre;

    public Nodo (int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    
    public void pintar (Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillOval(this.x- d/2, this.y-d/2, d, d);
        g.drawOval(this.x- d/2, this.y-d/2, d, d);
        g.setColor(Color.WHITE);
        g.drawString(nombre, x, y);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
