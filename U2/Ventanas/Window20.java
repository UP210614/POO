package U2.Ventanas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window20 extends JFrame
{   
    public Window20()
    {
        super("Distribuciones");
        setSize(750, 750);
        setResizable(false);
        setBackground(Color.WHITE);
        show();
    }
    public void paint ( Graphics graph)
    {
        
        graph.setColor(Color.white);
        graph.fillRect(0, 0, 750, 750);

        graph.setColor(Color.red);
        graph.fillArc(90, 80, 200, 200, 90, (int) Math.round(360*.5359));
        graph.setColor(Color.blue);
        graph.fillArc(90, 80, 200, 200, (int) Math.round(360*.5359+90), (int) Math.round(360*.4641));
        

        graph.setColor(Color.cyan);
        graph.fillArc(400, 80, 200, 200, 90, (int) Math.round(360*.2373));
        graph.setColor(new Color(170, 96, 220));
        graph.fillArc(400, 80, 200, 200, (int) Math.round(360*.2373+90), (int) Math.round(360*.1709));
        graph.setColor(Color.yellow);
        graph.fillArc(400, 80, 200, 200, (int) Math.round(360*(.2373+.1709)+90), (int) Math.round(360*.1909));
        graph.setColor(Color.red);
        graph.fillArc(400, 80, 200, 200, (int) Math.round(360*(.2373+.1709+.1909)+90), (int) Math.round(360*.2387));
        graph.setColor(Color.blue);
        graph.fillArc(400, 80, 200, 200, (int) Math.round(360*(.2373+.1709+.1909+.2387)+90), (int) Math.round(360*.1622));
        
        graph.setColor(new Color(229, 132, 40));
        graph.fillArc(90, 380, 200, 200, (int) 90, (int) Math.round(360*.0279));
        graph.setColor(Color.cyan);
        graph.fillArc(90, 380, 200, 200, (int) Math.round(360*.0279+90), (int) Math.round(360*.0445));
        graph.setColor(new Color(170, 96, 220));
        graph.fillArc(90, 380, 200, 200, (int) Math.round(360*(.0279+.0445)+90), (int) Math.round(360*.1243));
        graph.setColor(Color.green);
        graph.fillArc(90, 380, 200, 200, (int) Math.round(360*(.0279+.0445+.1243)+90), (int) Math.round(360*.3226));
        graph.setColor(Color.red);
        graph.fillArc(90, 380, 200, 200, (int) Math.round(360*(.0279+.0445+.1243+.3226)+90), (int) Math.round(360*.3327));
        graph.setColor(Color.blue);
        graph.fillArc(90, 380, 200, 200, (int) Math.round(360*(.0279+.0445+.1243+.3226+.3327)+90), (int) Math.round(360*.1480));
        
        graph.setColor(new Color(170, 96, 220));
        graph.fillArc(400, 380, 200, 200, (int) 90, (int) Math.round(360*.1843));
        graph.setColor(Color.green);
        graph.fillArc(400, 380, 200, 200, (int) Math.round(360*.1843+90), (int) Math.round(360*.2028));
        graph.setColor(Color.red);
        graph.fillArc(400, 380, 200, 200, (int) Math.round(360*(.1843+.2028)+90), (int) Math.round(360*.3701+1));
        graph.setColor(Color.blue);
        graph.fillArc(400, 380, 200, 200, (int) Math.round(360*(.1843+.2028+.3701)+90), (int) Math.round(360*.2407));

        

        String labels[] = {"Distribuciones por sexo","Distribuciones por edad","Distribuciones por estrato","Distribuciones por nivel educativo"};
        String percentages[] = {"53,59%","46,41%", "23,73%","16,22%","23,87%","19,09%","17,09%","4,45%","2,79%","14,80%","33,27%","32,26%","12,43%","18,43%","24,07%","37,01%","20,28%"};
        String labels2[] = {"Hombre", "Mujer","18-24","25-34","35-44","45-54","55+","1","2","3","4","5","6","Sin bachillerato", "Bachi/Téc. inc", "Téc/Univ. Inc", "Univ."};

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,20));
        graph.drawString(labels[0], 90, 70);

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,20));
        graph.drawString(labels[1], 400, 70);

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,20));
        graph.drawString(labels[2], 90, 350);

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,20));
        graph.drawString(labels[3], 370, 350);

        graph.setFont(new Font("Arial", Font.BOLD,15));
        graph.drawString(percentages[0], 120, 180);
        graph.drawString(percentages[1], 210, 180);
        graph.drawString(percentages[2], 420, 150);
        graph.drawString(percentages[3], 510, 130);
        graph.drawString(percentages[4], 540, 200);
        graph.drawString(percentages[5], 470, 250);
        graph.drawString(percentages[6], 420, 210);
        graph.drawString(percentages[7], 137, 380);
        graph.drawString(percentages[8], 178, 380);
        graph.drawString(percentages[9], 205, 425);
        graph.drawString(percentages[10], 225, 500);
        graph.drawString(percentages[11], 125, 520);
        graph.drawString(percentages[12], 115, 440);
        graph.drawString(percentages[13], 430, 430);
        graph.drawString(percentages[14], 520, 430);
        graph.drawString(percentages[15], 500, 520);
        graph.drawString(percentages[16], 430, 490);


        graph.setColor(Color.blue);
        graph.fillRect(305, 160, 10, 10);
        graph.setColor(Color.red);
        graph.fillRect(305, 175, 10, 10);

        graph.setColor(Color.blue);
        graph.fillRect(620, 130, 10, 10);
        graph.setColor(Color.red);
        graph.fillRect(620, 150, 10, 10);
        graph.setColor(Color.green);
        graph.fillRect(620, 170, 10, 10);
        graph.setColor(new Color(170, 96, 220));
        graph.fillRect(620, 190, 10, 10);
        graph.setColor(Color.cyan);
        graph.fillRect(620, 210, 10, 10);

        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,15));
        graph.drawString(labels2[0], 320, 170);
        graph.drawString(labels2[1], 320, 185);
        
        graph.drawString(labels2[2], 635, 140);
        graph.drawString(labels2[3], 635, 160);
        graph.drawString(labels2[4], 635, 180);
        graph.drawString(labels2[5], 635, 200);
        graph.drawString(labels2[6], 635, 220);

        graph.setColor(Color.blue);
        graph.fillRect(305, 410, 10, 10);
        graph.setColor(Color.red);
        graph.fillRect(305, 430, 10, 10);
        graph.setColor(Color.green);
        graph.fillRect(305, 450, 10, 10);
        graph.setColor(new Color(170, 96, 220));
        graph.fillRect(305, 470, 10, 10);
        graph.setColor(Color.cyan);
        graph.fillRect(305, 490, 10, 10);
        graph.setColor(new Color(229, 132, 40));
        graph.fillRect(305, 510, 10, 10);


        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,15));
        graph.drawString(labels2[7], 320, 420);
        graph.drawString(labels2[8], 320, 440);
        graph.drawString(labels2[9], 320, 460);
        graph.drawString(labels2[10], 320, 480);
        graph.drawString(labels2[11], 320, 500);
        graph.drawString(labels2[12], 320, 520);

        graph.setColor(Color.blue);
        graph.fillRect(610, 430, 10, 10);
        graph.setColor(Color.red);
        graph.fillRect(610, 450, 10, 10);
        graph.setColor(Color.green);
        graph.fillRect(610, 470, 10, 10);
        graph.setColor(new Color(170, 96, 220));
        graph.fillRect(610, 490, 10, 10);


        graph.setColor(Color.BLACK);
        graph.setFont(new Font("Arial", Font.BOLD,15));
        graph.drawString(labels2[13], 625, 440);
        graph.drawString(labels2[14], 625, 460);
        graph.drawString(labels2[15], 625, 480);
        graph.drawString(labels2[16], 625, 500);
        

        

    }


    public static void main(String args[])
    {
        Window20 app = new Window20();
        app.addWindowListener(
            new WindowAdapter() {
                public void windowClosing( WindowEvent e){
                    System.exit(0);
                }
            }
        );

    }
}

