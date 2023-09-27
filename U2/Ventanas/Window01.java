package U2.Ventanas;

import java.awt.Color;
import javax.swing.JFrame;


public class Window01 extends JFrame{
    
    public static void main(String[] args) {
        
        Window01 firstWindow = new Window01();
        firstWindow.setBounds(0, 0, 450, 450);
        firstWindow.setVisible(true);
        firstWindow.setResizable(true);
        firstWindow.setLocationRelativeTo(null);
        firstWindow.setTitle("My first window");
        firstWindow.getContentPane().setBackground(new Color(114, 157, 165));

    }
}
