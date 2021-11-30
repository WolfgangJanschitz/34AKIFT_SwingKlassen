/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Color;
/**
 *
 * @author wolfg
 */
public class TextArea {
    private JTextField textfeld=new JTextField("Textfeld");
    private String text;
    private int x,y,breite,hoehe;
    //im Konstruktor übernehmen
    private JPanel panel;

    public TextArea(JPanel panel) {
        this.panel = panel;
        this.panel = panel;
        //default Werte
        this.x=50;
        this.y=150;
        this.hoehe=40;
        this.breite=250;
        //
        init();
    }
    
    private void init(){
        this.textfeld.setBounds(x, y, breite, hoehe);
        //this.textfeld.setMaximumSize(new Dimension(breite, hoehe));
        //this.panel.add(this.textfeld);
        this.panel.add(this.textfeld, java.awt.BorderLayout.SOUTH);
        //am Actionlistener anmelden
        textfeld.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //bei Return
            System.out.println("Text: "+ textfeld.getText());
         }
        });
    }

}
