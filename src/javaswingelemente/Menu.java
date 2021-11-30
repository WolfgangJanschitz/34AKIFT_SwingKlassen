/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingelemente;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author naida
 */
public class Menu {
    private JMenu menu, submenu;  
    private JMenuItem i1, i2, i3, i4, i5;  
    private JPanel panel;
    public Menu(JPanel panel){ 
        this.panel = panel;
        init();
    } 
    private void init(){
        JMenuBar mb=new JMenuBar();  
        menu=new JMenu("3AKIFT");  
        submenu=new JMenu("POS");  
        i1=new JMenuItem("SYP");  
        i2=new JMenuItem("WIR");  
        i3=new JMenuItem("AUT");  
        i4=new JMenuItem("JW");  
        i5=new JMenuItem("TC");  
        menu.add(i1); 
        menu.add(i2); 
        menu.add(i3);  
        submenu.add(i4); submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu);
        this.panel.add(mb, java.awt.BorderLayout.NORTH);
        
        i1.setToolTipText("Masswohl");
        i2.setToolTipText("Prochaska");
        i3.setToolTipText("Mohr");
        i4.setToolTipText("Janschitz");
        i5.setToolTipText("Tockner");
        
        i1.addActionListener((event) -> System.out.println("Item 1 clicked"));
        i2.addActionListener((event) -> System.out.println("Item 2 clicked"));
        i3.addActionListener((event) -> System.out.println("Item 3 clicked"));
        i4.addActionListener((event) -> System.out.println("Item 4 clicked"));
        i5.addActionListener((event) -> System.out.println("Item 5 clicked"));
        
        i1.setBackground(Color.green);
        i2.setBackground(Color.green);
        i3.setBackground(Color.green);
        i4.setBackground(Color.green);
        i5.setBackground(Color.green);
        
        menu.setBackground(Color.DARK_GRAY);
        submenu.setBackground(Color.YELLOW);
        menu.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Menu opened");
         }
        }); 
        
        submenu.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("submenu opened");
        }
        });  

    }
}

