/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;
import java.awt.GraphicsEnvironment;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.*;
        
/**
 *
 * @author wolfg
 */
public class ListArea {
     private JPanel panel;

    public ListArea(JPanel panel) {
        this.panel = panel;
        //init der checkbox
        this.init();
    }
     
    private void init(){
         String installed_fonts[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //Ausgabe aller Fonts im Output Fenster
        //Variante 1
        /*
        for(int i=0;i<installed_fonts.length;i++){
            System.out.println(installed_fonts[i]);
        }*/
        //JList list=new JList();
        JList list=new JList(installed_fonts);
        //Das Listenelement einer ScrollPane zuweisen
        JScrollPane scrollpane = new JScrollPane(list);
        //statt der Liste das ScrollPane dem Borderlayout zuweisen
        this.panel.add(scrollpane, java.awt.BorderLayout.CENTER);
        
        /*list.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                
            }
        });
        */
        
        list.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                //System.out.println("Clicked");
                if(list.getSelectedIndex()!=-1){
                System.out.println(list.getSelectedValue() + "["+list.getSelectedIndex()+ "]" );
                //System.out.println(list.getSelectedValue());
                }else System.out.println("ERROR: no value");
                    
            }
        });   
    } 
     
}
