package com.java8.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HideAndSeek extends JFrame implements MouseListener {
   
    private JTextArea textArea = new JTextArea("Let's play Hide and Seek!");
    private JButton hideButton = new JButton("Hide!");
    private JButton[] number = new JButton[16];
    
    
    public HideAndSeek(){

        JPanel panel = new JPanel(new GridLayout(4, 4));
    
        //buttons on panel
        for (int i = 0; i <= 15; i++){
            number[i] = new JButton("" + i);
            panel.add(number[i], BorderLayout.CENTER);
            number[i].addMouseListener(this);
        }
        add(panel);
        
        add(hideButton, BorderLayout.NORTH);
        add(textArea, BorderLayout.SOUTH);
    
        textArea.addMouseListener(this);
        hideButton.addMouseListener(this);

    }
  
    public void mouseClicked(MouseEvent e) {
        
         JButton temp = (JButton) e.getSource();
         String btnText = temp.getText();
         for (int i = 0; i <= 15; i++){
             number[i] = temp;
               if (e.getSource() == temp) {
                 textArea.setText("You chose button " + btnText + ".");
               }
         }
         
         if (e.getSource() == hideButton) {
             textArea.setText("Choose a number to hide.");
         }
     }
    
     
     //when the mouse enters the Component
     public void mouseEntered(MouseEvent e){}
     
     //when the mouse leaves the Component
     public void mouseExited(MouseEvent e){}

     //when the mouse left button is held down on the Component
     public void mousePressed(MouseEvent e){}

     //when the mouse left button is released on the Component
     public void mouseReleased(MouseEvent e){}
    
    
     public static void main(String[] args){
        HideAndSeek frame = new HideAndSeek();
        frame.setTitle("Hide and Seek!");
        frame.setSize(400, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}

