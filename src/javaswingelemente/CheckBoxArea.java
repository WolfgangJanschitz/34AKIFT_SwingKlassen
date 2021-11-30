/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author wolfg
 */
public class CheckBoxArea {
    private int x,y,width,height;
    //GUI Elemente dem Panel zuordenen 
    private JCheckBox checkBox=new JCheckBox();
    private String text=new String(); 
    private boolean selected=false;
    private JPanel panel;
    
    public CheckBoxArea(JPanel panel,String text) {
        this.panel = panel;//panel übernehmen
        //defaulkt Werte setzen
        this.x = 50;
        this.y = 150;
        this.width = 300;
        this.height = 40;
        this.text=text;
        //init der checkbox
        this.init();
    }
    private void init(){
        //position
        this.checkBox.setBounds(x, y, width, height);
        //text
        this.checkBox.setText(this.text);
        //
        this.panel.add(this.checkBox, java.awt.BorderLayout.EAST);
        
        //default auf false setzen
        this.checkBox.setSelected(selected);
      
        checkBox.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {  
                if(e.getStateChange()==1){
                    System.out.println("checked");
                    selected=true;
                } else
                {
                    System.out.println("unchecked");
                    selected=false;
                }    
             }    
          }); 
    }
    //Abfrage des Status für den Aufrufer
    public boolean isSelected() {
        return selected;
    }

}
