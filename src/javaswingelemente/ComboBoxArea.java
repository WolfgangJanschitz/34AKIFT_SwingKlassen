package javaswingelemente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBoxArea {
    JPanel cbArea;    
    private int x,y,breite,hoehe;
    
    public ComboBoxArea(JPanel panel) {    
        cbArea = panel;
        this.x = panel.getWidth() / 2 - 50;
        this.y = 10;
        this.breite = 100;
        this.hoehe = 25;
        
        init();
    }
    
    public ComboBoxArea(JPanel panel, int x, int y, int breite, int hoehe) {    
        cbArea = panel;
        this.x = x;
        this.y = y;
        this.breite = breite;
        this.hoehe = hoehe;

        init();
    }
    
    private void init() {
        String []musicStyles = {"pop", "rock", "electronica", "classic", "alternative"};
        
        JComboBox styles = new JComboBox(musicStyles);
        styles.setBounds(x, y, breite, hoehe);
        styles.addActionListener((ActionEvent e) -> {
            System.out.println("You've chosen \"" + styles.getSelectedItem().toString() + "\"... cool genre!");
        });
        
        cbArea.add(styles);
    }
    
}
