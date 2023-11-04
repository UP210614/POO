package U2.Ventanas;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class Window21 extends JFrame {
    public Window21() {
        super("Ventas");
        setSize(1075, 800);
        setResizable(false);
        setBackground(Color.WHITE);
        show();
    }

    public void paint(Graphics graph) {

        int blueValues[][] = { { 460, 130 }, { 505, 85 }, { 491, 99 }, { 489, 101 }, { 510, 80 }, { 515, 75 },
                { 480, 110 }, { 491, 99 }, { 500, 90 }, { 450, 140 }, { 470, 120 }, { 510, 80 } };
        int redValues[][] = { { 392, 68 }, { 410, 95 }, { 410, 81 }, { 370, 119 }, { 380, 130 }, { 450, 65 },
                { 330, 150 }, { 435, 56 }, { 438, 62 }, { 315, 135 }, { 335, 135 }, { 390, 120 } };
        int greenValues[][] = { { 255, 137 }, { 275, 135 }, { 265, 145 }, { 273, 97 }, { 325, 55 }, { 345, 105 },
                { 195, 135 }, { 290, 145 }, { 375, 63 }, { 185, 130 }, { 205, 130 }, { 240, 150 } };
        String months[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        String greenNumbers[] = {"","","","","","","","","","","",""};
        String redNumbers[] = {"","","","","","","","","","","",""};
        String blueNumbers[] = {"","","","","","","","","","","",""};

        graph.setColor(Color.white);
        graph.fillRect(0, 0, 1080, 800);
        graph.setColor(Color.black);
        graph.drawRect(45, 55, 980, 700);

        graph.setColor(Color.black);
        for (int i = 140; i <= 590; i += 50) {
            graph.fillRect(70, i, 930, 1);
        }

        int loopcounter = 0;

        for (int i = 78; i <= 936; i += 78) {
            graph.setColor(Color.blue);
            graph.fillRect(i, blueValues[loopcounter][0], 55, blueValues[loopcounter][1]);
            graph.setColor(Color.red);
            graph.fillRect(i, redValues[loopcounter][0], 55, redValues[loopcounter][1]);
            graph.setColor(Color.green);
            graph.fillRect(i, greenValues[loopcounter][0], 55, greenValues[loopcounter][1]);
            loopcounter++;
        }

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD, 24));
        graph.drawString("Ventas del año-en miles", 390, 110);

        graph.setFont(new Font("Arial", Font.BOLD, 18));
        int loopcounter2 = 0;
        for (int i = 75; i <= 960; i+=80) {
            Graphics2D g2d = (Graphics2D) graph;
            AffineTransform oldTransform = g2d.getTransform();
            AffineTransform at = new AffineTransform();
            at.rotate(Math.toRadians(315), i, 670);
            g2d.setTransform(at);
            graph.drawString(months[loopcounter2], i, 670);
            g2d.setTransform(oldTransform);
            loopcounter2++;
        }

    }

    public static void main(String[] args) {
        Window21 app = new Window21();
        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
    }
}
