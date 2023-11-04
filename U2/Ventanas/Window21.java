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

        int greenNumbers[][] = {{272,340},{271,350},{292,345},{192,330},{105,360},{217,400},{269,260},{293,370},{125,420},{258,250},{264,265},{292,320}};
        int redNumbers[][] = {{128,435},{186,460},{168,455},{240,440},{263,460},{127,490},{298,410},{115,468},{187,480},{263,400},{266,410},{237,460}};
        int blueNumbers[][] = {{265,530},{179,550},{196,545},{204,545},{169,556},{146,560},{227,540},{196,550},{172,555},{287,525},{244,530},{168,555}};

        graph.setColor(Color.white);
        graph.fillRect(0, 0, 1080, 800);
        graph.setColor(Color.black);
        graph.drawRect(45, 55, 980, 700);

        graph.setColor(Color.black);
        for (int i = 140; i <= 590; i += 50) {
            graph.fillRect(70, i, 930, 1);
        }

        int loopcounterBars = 0;

        for (int i = 78; i <= 936; i += 78) {
            graph.setColor(Color.blue);
            graph.fillRect(i, blueValues[loopcounterBars][0], 55, blueValues[loopcounterBars][1]);
            graph.setColor(Color.red);
            graph.fillRect(i, redValues[loopcounterBars][0], 55, redValues[loopcounterBars][1]);
            graph.setColor(Color.green);
            graph.fillRect(i, greenValues[loopcounterBars][0], 55, greenValues[loopcounterBars][1]);
            loopcounterBars++;
        }

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD, 24));
        graph.drawString("Ventas del año - en miles", 410, 110);

        graph.setFont(new Font("Arial", Font.BOLD, 18));
        int loopcounterMonths = 0;
        for (int i = 75; i <= 960; i+=80) {
            Graphics2D g2d = (Graphics2D) graph;
            AffineTransform oldTransform = g2d.getTransform();
            AffineTransform at = new AffineTransform();
            at.rotate(Math.toRadians(315), i, 670);
            g2d.setTransform(at);
            graph.drawString(months[loopcounterMonths], i, 670);
            g2d.setTransform(oldTransform);
            loopcounterMonths++;
        }

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD, 24));
        int loopcounterNumbers = 0;
        for(int i = 84;i<=942;i+=78){
            graph.drawString(Integer.toString(greenNumbers[loopcounterNumbers][0]), i, greenNumbers[loopcounterNumbers][1]);
            graph.drawString(Integer.toString(redNumbers[loopcounterNumbers][0]), i, redNumbers[loopcounterNumbers][1]);
            graph.drawString(Integer.toString(blueNumbers[loopcounterNumbers][0]), i, blueNumbers[loopcounterNumbers][1]);
            loopcounterNumbers++;
        }
        
        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD, 16));
        graph.drawString("Sucursal 1", 360, 732);
        graph.drawString("Sucursal 2", 490, 732);
        graph.drawString("Sucursal 3", 620, 732);

        graph.setColor(Color.blue);
        graph.fillRect(340, 720, 12, 12);
        graph.setColor(Color.red);
        graph.fillRect(470, 720, 12, 12);
        graph.setColor(Color.green);
        graph.fillRect(600, 720, 12, 12);
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
