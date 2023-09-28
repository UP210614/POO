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
        getContentPane().setBackground(new Color (59, 53, 252));
        setIconImage(new ImageIcon(getClass().getResource("images/descarga.png")).getImage());

        buttonCloseWindow = new JButton("Cerrar");
        buttonCloseWindow.setBounds(123,280,100,30);
        buttonCloseWindow.setBackground(new Color(123,280,100,30));
        buttonCloseWindow.setFont(new Font("Andele Mono",1,14));
        buttonCloseWindow.setForeground(new Color(0,0,0));
        buttonCloseWindow.addActionListener(this);
        add(buttonCloseWindow);
        

    }
    public static void main(String[] args)
    {
        Window03 firstWindow = new Window03();
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
