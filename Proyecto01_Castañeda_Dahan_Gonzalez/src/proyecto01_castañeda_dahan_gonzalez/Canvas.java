/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01_castañeda_dahan_gonzalez;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Canvas extends JPanel implements MouseListener {
     private Point p1, p2;
     private int numNodos;
     private List<Nodo> vectorNodos;
    private List<Arista> vectorAristas;

    public Canvas(int numNodos) {
        this.numNodos = numNodos;
        this.vectorNodos = new ArrayList<>();
        this.vectorAristas = new ArrayList <>();
        this.addMouseListener(this);
    }
     
     @Override
     public void paint(Graphics g){
         for (Nodo nodos : vectorNodos){
             nodos.pintar(g);
         }
         
         for (Arista aristas : vectorAristas){
             aristas.pintar(g);
         }
        
             
         
     }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getButton()== MouseEvent.BUTTON1){
            switch (this.numNodos){
                case 4:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    repaint();
                    break;
                case 5:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"4"));//Añadimos el nodo 5
                    repaint();
                    break;
                case 6:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    repaint();
                    break;
                case 7:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(147,127,"7"));
                    repaint();
                    break;
                case 8:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(147,127,"7"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    repaint();
                    break;
                case 9:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    repaint();
                    break;
                case 10:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    repaint();
                    break;
                case 11:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    repaint();
                    break;
                case 12:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    repaint();
                    break;
                case 13:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    repaint();
                    break;
                case 14:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    repaint();
                    break;
                case 15:
                     this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    repaint();
                    break;
                case 16:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    this.vectorNodos.add(new Nodo(185,386,"16"));
                    repaint();
                    break;
                case 17:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    this.vectorNodos.add(new Nodo(185,386,"16"));
                    this.vectorNodos.add(new Nodo(51,200,"17"));
                    repaint();
                    break;
                case 18:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    this.vectorNodos.add(new Nodo(185,386,"16"));
                    this.vectorNodos.add(new Nodo(51,200,"17"));
                    this.vectorNodos.add(new Nodo(236,20,"18"));
                    repaint();
                    break;
                case 19:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    this.vectorNodos.add(new Nodo(185,386,"16"));
                    this.vectorNodos.add(new Nodo(51,200,"17"));
                    this.vectorNodos.add(new Nodo(236,20,"18"));
                    this.vectorNodos.add(new Nodo(461,438,"19"));
                    repaint();
                    break;
                case 20:
                    this.vectorNodos.add(new Nodo(47,54,"1"));//Añadimos el nodo 1
                    this.vectorNodos.add(new Nodo(541,441,"2"));//Añadimos el nodo 2
                    this.vectorNodos.add(new Nodo(558,41,"3"));//Añadimos el nodo 3
                    this.vectorNodos.add(new Nodo(81,413,"4"));//Añadimos el nodo 4
                    this.vectorNodos.add(new Nodo(294,256,"5"));//Añadimos el nodo 5
                    this.vectorNodos.add(new Nodo(308,451,"6"));
                    this.vectorNodos.add(new Nodo(39,328,"8"));
                    this.vectorNodos.add(new Nodo(562,166,"9"));
                    this.vectorNodos.add(new Nodo(410,307,"10"));
                    this.vectorNodos.add(new Nodo(375,42,"11"));
                    this.vectorNodos.add(new Nodo(166,285,"12"));
                    this.vectorNodos.add(new Nodo(279,127,"13"));
                    this.vectorNodos.add(new Nodo(457,149,"14"));
                    this.vectorNodos.add(new Nodo(542,311,"15"));
                    this.vectorNodos.add(new Nodo(185,386,"16"));
                    this.vectorNodos.add(new Nodo(51,200,"17"));
                    this.vectorNodos.add(new Nodo(236,20,"18"));
                    this.vectorNodos.add(new Nodo(461,438,"19"));
                    this.vectorNodos.add(new Nodo(159,485,"20"));
                    repaint();
                    break;
                    
            }
            
            
       }
       int aux = vectorNodos.size()-1;
       if(e.getButton()== MouseEvent.BUTTON3){
               for(int i =0 ; i< vectorNodos.size();i++){
                   for(int j =aux ; j> i;j--){
                     p1 = new Point (vectorNodos.get(i).getX(),vectorNodos.get(i).getY());
                     p2 = new Point (vectorNodos.get(j).getX(),vectorNodos.get(j).getY());
                     this.vectorAristas.add(new Arista (p1.x, p1.y, p2.x,p2.y));
                     
                     repaint();
                     
                   }
               }
            }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    public List<Nodo> getVectorNodos() {
        return vectorNodos;
    }

    public void setVectorNodos(List<Nodo> vectorNodos) {
        this.vectorNodos = vectorNodos;
    }

    public List<Arista> getVectorAristas() {
        return vectorAristas;
    }

    public void setVectorAristas(List<Arista> vectorAristas) {
        this.vectorAristas = vectorAristas;
    }
     
    
}
