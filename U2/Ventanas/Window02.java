package U2.Ventanas;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Window02 extends JFrame {
    public Window02() {

        setBounds(0, 0, 450, 450);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);

        setTitle("My first window");
        getContentPane().setBackground(new Color(129, 119, 196));

        setIconImage(new ImageIcon(getClass().getResource("images/descarga.png")).getImage());
        
    }

    public static void main(String[] args) {
        Window02 firstWindow = new Window02();
    }
}
