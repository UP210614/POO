package U2.Ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

public class Window17 extends JFrame{

    public Window17(){

        super("Dibujando figuras de 2D");

        setSize(425,160);
        show();
    }

    public void paint(Graphics g){

        Graphics2D graf2d = (Graphics2D) g;

        graf2d.setPaint(new GradientPaint(5,30,Color.blue,35,100,Color.yellow, true));
        graf2d.fill(new Ellipse2D.Double(5,30,65,100));

        graf2d.setPaint(Color.red);
        graf2d.setStroke(new BasicStroke(10.0f));
        graf2d.draw(new Rectangle2D.Double(80,30,65,100));

        BufferedImage imagenBuf = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = imagenBuf.createGraphics();
        gg.setColor(Color.yellow);
        gg.fillRect(0,0,10,10);
        gg.setColor(Color.black);
        gg.drawRect(1,1,6,6);
        gg.setColor(Color.blue);
        gg.fillRect(1,1,3,3);
        gg.setColor(Color.red);
        gg.fillRect(4,4,3,3);

        graf2d.setPaint(new TexturePaint(imagenBuf, new Rectangle(10,10)));
        graf2d.setStroke(new BasicStroke(6.0f));
        graf2d.draw(new Arc2D.Double(240,30,75,100,0,270,Arc2D.PIE));

        graf2d.setPaint(Color.green);
        graf2d.draw(new Line2D.Double(395,30,320,150));

        float guiones[] = {10};

        graf2d.setPaint(Color.yellow);
        graf2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, guiones,0));

    }

    public static void main(String args[])
    {

        Window17 app = new Window17();

        app.addWindowListener(
            new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );
    }
}