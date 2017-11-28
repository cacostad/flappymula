/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;


public class findeljuego extends JFrame implements MouseListener{

    private Board flappymula;
     private JButton botoncambio;
    
    public findeljuego(){
         
          
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(new Dimension(1366,768));
  getContentPane().setBackground(Color.BLACK );
  botoncambio = new JButton("Siguiente");
  botoncambio.setBounds(800, 50, 150, 50);
  botoncambio.setBackground(java.awt.Color.gray);
  botoncambio.setFont(new java.awt.Font("Arial black", 0, 20)); 
   
   
           
  botoncambio.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                    
    dispose();
            
    flappymula= new Board();
    
    
            
            
            
            }
        });
  
  
  setTitle("Flappymula");
  addMouseListener((MouseListener) this);
  setResizable(false);

  add(botoncambio);
    }

    
      
    
    @Override
    public void mouseClicked(MouseEvent e) {
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
    
}
