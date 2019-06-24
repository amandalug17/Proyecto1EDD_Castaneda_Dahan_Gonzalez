/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista_Principal vis = new Vista_Principal();
        vis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vis.setVisible(true);
    }
    
}
