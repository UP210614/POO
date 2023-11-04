package U2.Ventanas;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import java.util.Random;

public class connect4 extends JFrame {
    
    JButton boton[][]=new JButton[7][7];
    JLabel Nombre=new JLabel("",JLabel.CENTER);

    connect4(){


        JPanel Principal=new JPanel();
		Principal.setLayout(new GridLayout(7,7));

        for(int i=0;i<7;i++)
		{
				boton[i][0]=new JButton();
				boton[i][0].setBackground(Color.BLACK); 
				Principal.add(boton[i][0]);
			
			
			add(Nombre,"North");
			add(Principal,"Center");
			
		}
        
        for(int i=0;i<7;i++)
		{
			for(int j=0;j<6;j++)
			{
				
				boton[i][j]=new JButton();
				boton[i][j].setBackground(Color.BLUE); 
				Principal.add(boton[i][j]);
			}
			
			add(Nombre,"North");
			add(Principal,"Center");
		}

        setLocation(170,25);
		setSize (600,600);
		setResizable(false);
		setTitle("CONECTA 4");
		setVisible(true);
        setBackground(Color.BLACK);
    }


    public static void main(String[] args) {
        new connect4();
    }
    
}
