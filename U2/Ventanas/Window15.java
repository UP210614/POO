package U2.Ventanas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window15 extends JFrame{

    public Window15(){
        super("Dibujando arcos");

        setSize(300,270);
        
        show();
    }

    public void paint(Graphics graph){
        graph.setColor(Color.yellow);
        graph.drawRect(15, 35, 80, 80);
        graph.setColor(Color.black);
        graph.drawArc(15, 35, 80, 80, 0, 360);

        graph.setColor(Color.yellow);
        graph.drawRect(100, 35, 80, 80);
        graph.setColor(Color.black);
        graph.drawArc(100, 35, 80, 80, 0, 110);

        graph.setColor(Color.yellow);
        graph.drawRect(185, 35, 80, 80);
        graph.setColor(Color.black);
        graph.drawArc(185, 35, 80, 40, 0, -270);

        graph.fillArc(15, 120, 80, 80, 0, 360);

        graph.fillArc(100, 120, 80, 40, 270, -90);

        graph.fillArc(185, 120, 80, 40, 0, -270);
    }

    public static void main(String[] args) {
        Window15 app = new Window15();

        app.addWindowListener(
            new WindowAdapter(){
                public void windowClosing( WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
    }

}
