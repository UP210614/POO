package U2.Ventanas;

import java.awt.event.*;
import javax.swing.*;

public class Window04 extends JFrame implements ActionListener{
    private JButton button1, button2, buttonCloseWindow;
    private JLabel label1;

    public Window04(){
        setLayout(null);
        //setIconImage(new ImageIcon(getClass().getResource("imagenes/LogoBimbo.jpg")).getImage());

        button1 = new JButton("1");
        button1.setBounds(10, 100, 90, 30);
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(110, 100, 90, 30);
        add(button2);
        button2.addActionListener(this);

        buttonCloseWindow = new JButton("Cerrar");
        buttonCloseWindow.setBounds(280, 100, 90, 30);
        add(buttonCloseWindow);
        buttonCloseWindow.addActionListener(this);

        label1 = new JLabel("Presion el botón");
        label1.setBounds(10, 10, 200, 60);
        add(label1);
    }

    public void actionPerformed(ActionEvent e){
            if(e.getSource() == button1){
                label1.setText("Has presionado el botón 1.");
            }
            if(e.getSource() == button2){
                label1.setText("Has presionado el botón 2.");
            }
            if(e.getSource() == buttonCloseWindow){
                label1.setText("Has presionado salir.");
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Desa salir de la aplicación?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        }

    public static void main(String args[]){
        Window04 formulario = new Window04();
        formulario.setBounds(0, 0, 400, 200);
        formulario.setTitle("Mi primera Ventana");
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}