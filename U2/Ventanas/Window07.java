package U2.Ventanas;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Window07 extends JFrame implements ActionListener{

    private JTextField textField1;
    private JTextArea textArea1;
    private JScrollPane scrollPane1;
    private JButton button1, buttonCloseWindow;

    String texto = "";

    public Window07(){
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("images/CruzAzul.svg.png")).getImage());
        getContentPane().setBackground(new Color (17,38,241));

        textField1 = new JTextField();
        textField1.setBounds(10, 10, 200, 30);
        add(textField1);

        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 50, 400, 300);
        add(scrollPane1);
        
        button1 = new JButton("Agregar");
        button1.setBounds(250, 10, 100, 30);
        add(button1);
        button1.addActionListener(this);

        buttonCloseWindow = new JButton("Salir");
        buttonCloseWindow.setBounds(300, 370, 100, 30);
        add(buttonCloseWindow);
        buttonCloseWindow.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == button1){
            texto += textField1.getText() + "\n";
            textArea1.setText(texto);
            textField1.setText("");
        }
        if(e.getSource() == buttonCloseWindow){
            int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea salir de la aplicación?",
                                                          "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Window07 formulario1 = new Window07();
        formulario1.setBounds(0, 0, 440, 450);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
