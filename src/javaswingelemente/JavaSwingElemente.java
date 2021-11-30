/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author wolfg
 */
public class JavaSwingElemente extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        show_gui();
       
    }
    public static void show_gui(){
         //main window instance
        JFrame mainFrame = new JFrame("GUI Elemente Demo");
        //position and size
        mainFrame.setBounds(100,100,800,600);
        
       //close window means exit programm
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //***** default system look and feel *******
        System.out.println(UIManager.getSystemLookAndFeelClassName());
        
        //JPanel für die GUI Elemente
        JPanel mainPanel = new JPanel();
        BorderLayout bl=new BorderLayout();
        //dem Panel zuweisen
        mainPanel.setLayout(bl);
        
        //Das mainPanel dem mainFrame zuweisen
        mainFrame.add(mainPanel);
        
        //GUI Elemte hizufügen
        ButtonArea ba=new ButtonArea(mainPanel,"Ich bin ein Button");
        
        //ButtonArea ba1=new ButtonArea(mainPanel,"Ich bin ein Button2");
        TextArea ta=new TextArea(mainPanel);
        CheckBoxArea cba=new CheckBoxArea(mainPanel, "Auswählen");
        ListArea la=new ListArea(mainPanel);
        
        //show main window
        mainFrame.setVisible(true);
        
        //mainFrame.pack();
    }
    
}
