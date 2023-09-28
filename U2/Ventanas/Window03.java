package U2.Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Window03 extends JFrame implements ActionListener 
{
    private JButton buttonCloseWindow;

    public Window03()
    {
        setBounds(0,0,450,450);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        setTitle("Mi tercera ventana");
        getContentPane().setBackground(new Color (255,255,255));

        buttonCloseWindow = new JButton("Cerrar");
        buttonCloseWindow.addActionListener(this);
        add(buttonCloseWindow);
        

    }
    public static void main(String[] args)
    {
        Window03 firstWindow = new Window03();

        firstWindow.buttonCloseWindow.setBounds(123,280,100,30);
        firstWindow.buttonCloseWindow.setBackground(new Color(123,280,100,30));
        firstWindow.buttonCloseWindow.setFont(new Font("Andele Mono",1,14));
        firstWindow.buttonCloseWindow.setForeground(new Color(0,0,0));

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==buttonCloseWindow){
            int respuesta = JOptionPane.showConfirmDialog
            (this, "¿Desea salir de la aplicación?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        }
    }
}

