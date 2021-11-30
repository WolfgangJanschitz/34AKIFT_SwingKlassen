package javaswingelemente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Creates a Popup
 * @author Lukas Andrea Bachler
 */
public class PopupArea {
    private JFrame frame;
    private JPopupMenu popup;
    private JLabel label;
    private int width;
    private int height;

    public PopupArea(int width, int height, String title) {
        frame = new JFrame(title);
        frame.setLayout(new GridLayout());
        popup = new JPopupMenu("Popup");
        label = new JLabel("Example label");
        this.width = width;
        this.height = height;
        init();
    }

    public PopupArea(){
        this(300, 300, "Ich bin ein Popup!");
    }

    private void init(){
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(width, height / 3);
        frame.add(label);
        JMenuItem hello = new JMenuItem("Hallo");
        hello.setHorizontalAlignment(SwingConstants.CENTER);
        hello.setBackground(Color.LIGHT_GRAY);
        hello.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText(hello.getText());
            }
        });
        popup.add(hello);
        JMenuItem casualHello = new JMenuItem("Grias di!");
        casualHello.setHorizontalAlignment(SwingConstants.CENTER);
        casualHello.setBackground(Color.LIGHT_GRAY);
        casualHello.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText(casualHello.getText());
            }
        });

        popup.add(casualHello);
        popup.setSize(width / 2, height / 4);
        popup.setVisible(true);

        frame.add(popup);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
