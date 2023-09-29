package U2.Ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;



public class Window06 extends JFrame implements ActionListener{
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton buttonCloseWindow;

    public Window06(){
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("images/CruzAzul.svg.png")).getImage());
        getContentPane().setBackground(new Color (17,38,241));

        textField1 = new JTextField();
        textField1.setBounds(10,10, 200, 30);
        add(textField1);

        textArea1 = new JTextArea();
        textArea1.setBounds(10, 50, 400, 300);
        add(textArea1);

        buttonCloseWindow = new JButton("Salir");
        buttonCloseWindow.setBounds(300, 370, 100, 30);
        add(buttonCloseWindow);
        buttonCloseWindow.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == buttonCloseWindow){
            int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea salir de la aplicación?",
                                                          "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Window06 formulario1 = new Window06();
        formulario1.setBounds(0, 0, 440, 450);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
