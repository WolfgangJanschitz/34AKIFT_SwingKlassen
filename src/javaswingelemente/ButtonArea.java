/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

/**
 *
 * @author wolfg
 */
public class ButtonArea {
    private JButton button=new JButton("Button");
    private String text;
    private int x,y,breite,hoehe;
    //im Konstruktor übernehmen
    private JPanel panel;
    private Color bgcolor;
    
    public ButtonArea(JPanel panel, String text) {
        this.panel = panel;
        //default Werte
        this.x=50;
        this.y=50;
        this.hoehe=40;
        this.breite=250;
        this.text=text;
        //
        init();
        
    }

    public ButtonArea(JPanel panel,int x, int y, int breite, int hoehe) {
        this.x = x;
        this.y = y;
        this.breite = breite;
        this.hoehe = hoehe;
        this.panel = panel;
        //
        init(); 
    }
    
    private void init(){
        //Position und Größe
        this.button.setBounds(x, y, breite, hoehe);
        //dem Panel des Frames zuordnen
        bgcolor=this.button.getBackground();
        //Button Beschriftung übergeben
        this.button.setText(text);
        //this.panel.add(this.button, java.awt.BorderLayout.LINE_START);//SOUTH
        this.panel.add(this.button, java.awt.BorderLayout.WEST);
        //Button zum ActioListener hinzufügen
        button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("Button geklickt");
            //hier eine beliebe Methode aufrufen
            }
        });
        
        //am Mauseventhandler anmelden
        button.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent me){
                System.out.println("Mouse on Button Exit"); 
                setButtonBG(Color.green);
            }
             public void mouseExited(MouseEvent me){
                System.out.println("Mouse leaves Button Exit");
                //Hintergrundfarbe wiederherstellen
                setButtonBG(bgcolor);
            }
        });
    }
     private void setButtonBG(Color color){
        this.button.setBackground(color);
    }
}
