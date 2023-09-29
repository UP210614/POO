package U2.Ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Window08 extends JFrame implements ActionListener{
    
    private JTextField textField1, textField2;
    private JLabel label1, label2, label3, labelRes;
    private JButton buttonAdd, buttonSubstract, buttonMultiply, buttonDivision, buttonCloseWindow;
    
    public Window08(){
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("images/CruzAzul.svg.png")).getImage());
        getContentPane().setBackground(new Color (17,38,241));

        label1 = new JLabel("Valor 1:");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2:");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado:");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        labelRes = new JLabel(" ");
        labelRes.setBounds(120 , 100, 100, 30);
        add(labelRes);

        textField1 = new JTextField();
        textField1.setBounds(120, 10, 150, 20);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120, 40, 150, 20);
        add(textField2);

        buttonAdd = new JButton("Sumar");
        buttonAdd.setBounds(10, 80, 90, 30);
        add(buttonAdd);
        buttonAdd.addActionListener(this);

        buttonSubstract = new JButton("Restar");
        buttonSubstract.setBounds(10, 120, 90, 30);
        add(buttonSubstract);
        buttonSubstract.addActionListener(this);

        buttonMultiply = new JButton("Multiplicar");
        buttonMultiply.setBounds(10, 150, 90, 30);
        add(buttonMultiply);
        buttonMultiply.addActionListener(this);

        buttonDivision = new JButton("Dividir");
        buttonDivision.setBounds(10, 200, 90, 30);
        add(buttonDivision);
        buttonDivision.addActionListener(this);

        buttonCloseWindow = new JButton("Salir");
        buttonCloseWindow.setBounds(10, 260, 90, 30);
        add(buttonCloseWindow);
        buttonCloseWindow.addActionListener((ActionListener)this);
    }

    public void actionPerformed(ActionEvent e){

        int valor1 = 0, valor2 = 0, resultado = 0;

        if(e.getSource() == buttonCloseWindow){
            int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea salir de la aplicación?",
                                                          "Confirmar salida", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }

        if(e.getSource() == buttonAdd){
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 + valor2;
        }

        if(e.getSource() == buttonSubstract){
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 - valor2;
        }

        if(e.getSource() == buttonMultiply){
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 * valor2;
        }

        if(e.getSource() == buttonDivision){
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());

            resultado = valor1 / valor2;
        }

        labelRes.setText("->   " + resultado);
        resultado = 0;
    }

    public static void main(String[] args) {
        Window08 formulario1 = new Window08();
        formulario1.setBounds(0, 0, 440, 450);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}
