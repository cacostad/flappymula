/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author CRIS
 */
public class Board extends JFrame implements ActionListener,KeyListener  {
  
public Repintar pintar;
private final Jugabilidad jugabilidad;
public static Board hola;


    public Board() {
        
        this.jugabilidad=new Jugabilidad();
        this.pintar=new Repintar();
        add(pintar);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(28350,791));
        setTitle("Flappymula");
        setResizable(false);
        setVisible(true);
         
    }
    
    public static void main(String[] args)
	{
		 hola= new Board();
                
                
	}
    
    
  
    
    
    
    
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
pintar.actionPerformed(e); 

 
                




    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
pintar.keyReleased(e);   

   

   
   

    }
    
}
