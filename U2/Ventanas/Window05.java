package U2.Ventanas;

import javax.swing.*;
import java.awt.event.*;

public class Window05 extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label1;
    private JButton buttonAddText, buttonCloseWindow;

    public Window05(){
        setLayout(null);
        label1 = new JLabel("Usuario");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(120, 17, 150, 20);
        add(textfield1);

        buttonAddText = new JButton("Aceptar");
        buttonAddText.setBounds(10,80,100,30);
        add(buttonAddText);
        buttonAddText.addActionListener(this);

        buttonCloseWindow = new JButton("Salir");
        buttonCloseWindow.setBounds(180, 80, 100, 30);
        add(buttonCloseWindow);
        buttonCloseWindow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()  == buttonAddText){
            String texto = textfield1.getText();
            setTitle(texto);
        }
        if (e.getSource() == buttonCloseWindow){
            label1.setText("Has presionado salir");
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicacion?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_NO_OPTION)
                System.exit(0);
        }
    }

    public static void main (String arg []){
        Window05 formulario1 = new Window05();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }



}
