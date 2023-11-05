package U2.Ventanas;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Connect4 extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu options;
	JMenuItem newItem;
	JButton buttons[][] = new JButton[7][7];
	JPanel buttonsPanel = new JPanel();
	ImageIcon iconPlayer1 = new ImageIcon(getClass().getResource("images/Mordecai.png"));
	ImageIcon iconPlayer2 = new ImageIcon(getClass().getResource("images/Rigby.png"));
	ImageIcon checkIcon = new ImageIcon();
	int player = 1;
	boolean game = true;
	int turnCounter = 0;

	public Connect4() {
		buttonsPanel.setLayout(new GridLayout(7, 7));

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		options = new JMenu("Opciones");
		menuBar.add(options);

		newItem = new JMenuItem("Nuevo");
		newItem.addActionListener(this);
		options.add(newItem);

		for (int i = 0; i < 7; i++) {

			buttons[0][i] = new JButton();
			buttons[0][i].setBackground(Color.blue);
			buttons[0][i].addActionListener(this);
			buttonsPanel.add(buttons[0][i]);

		}
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setBackground(Color.black);
				buttonsPanel.add(buttons[i][j]);
			}
		}

		add(buttonsPanel);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == newItem) {
			cleanBoard();
			player = 1;
			turnCounter = 0;
		}

		for (int i = 0; i < 7; i++) {
			if (e.getSource() == buttons[0][i]) {
				int k = 7;
				do {
					k--;
				} while (buttons[k][i].getIcon() != null && k > 1);

				if (player > 0 && buttons[k][i].getIcon() == null) {
					buttons[k][i].setIcon(iconPlayer1);
					checkWin(k, i);
					player*=-1;
					turnCounter++;
				} else if (player < 0 && buttons[k][i].getIcon() == null) {
					buttons[k][i].setIcon(iconPlayer2);
					checkWin(k, i);
					player*=-1;
					turnCounter++;
				}

				if(turnCounter == 42){
					JOptionPane.showMessageDialog(this, "!Es un empate!", "Conecta 4",
						JOptionPane.INFORMATION_MESSAGE);
					game = false;
					turnCounter = 0;
					cleanBoard();
				}

				if(game == false) {
					player = 1;
					turnCounter = 0;
				}
				game = true;
			}
		}
	}

	public void checkWin(int k, int i) {
		if (player == 1) {
			checkIcon = iconPlayer1;
		} else {
			checkIcon = iconPlayer2;
		}

		int loopCounter = 0;
		int tokenCounter = 0;
		if (game) {
			while (loopCounter < 7 && tokenCounter != 4) {
				if (buttons[k][loopCounter].getIcon() == checkIcon) {
					tokenCounter++;
				} else {
					tokenCounter = 0;
				}
				loopCounter++;
			}
			if (tokenCounter == 4) {
				JOptionPane.showMessageDialog(this, "Gana Jugador 1", "Conecta 4",
						JOptionPane.INFORMATION_MESSAGE, checkIcon);
				cleanBoard();
				player = 1;
				game = false;
			}
		}
		loopCounter = 0;
		tokenCounter = 0;
		if (game) {
			while (loopCounter < 7 && tokenCounter != 4) {
				if (buttons[loopCounter][i].getIcon() == checkIcon) {
					tokenCounter++;
				} else {
					tokenCounter = 0;
				}
				loopCounter++;
			}
			if (tokenCounter == 4) {
				JOptionPane.showMessageDialog(this, "Gana Jugador 1", "Conecta 4",
						JOptionPane.INFORMATION_MESSAGE, checkIcon);
				cleanBoard();
				player = 1;
				game = false;
			}
		}

		loopCounter = 0;
		tokenCounter = 0;
		if (game) {

			for (int f = 1; f < 4; f++) {
				for (int g = 0; g < 4; g++) {
					int a = f;
					int b = g;
					while (buttons[a][b].getIcon() == checkIcon && tokenCounter <= 4) {
						tokenCounter++;
						a++;
						b++;
						if (a > 6 || b > 6) {
							break;
						}
					}
					if (tokenCounter == 4) {
						JOptionPane.showMessageDialog(this, "Gana Jugador 1", "Conecta 4",
								JOptionPane.INFORMATION_MESSAGE, checkIcon);
						cleanBoard();
						player = 1;
						game = false;
						tokenCounter = 0;
						break;
					}
					tokenCounter = 0;
				}
			}
		}
		tokenCounter = 0;
		if (game) {
			for (int f = 1; f < 4; f++) {
				for (int g = 3; g < 7; g++) {
					int a = f;
					int b = g;
					while (buttons[a][b].getIcon() == checkIcon && tokenCounter <= 4) {
						tokenCounter++;
						a++;
						b--;
						if (a > 6 || b < 0) {
							break;
						}
					}
					if (tokenCounter == 4) {
						JOptionPane.showMessageDialog(this, "Gana Jugador 1", "Conecta 4",
								JOptionPane.INFORMATION_MESSAGE, checkIcon);
						cleanBoard();
						player = 1;
						game = false;
						tokenCounter = 0;
						break;
					}
					tokenCounter = 0;
				}
			}
			loopCounter = 0;
		}
	}

	public void cleanBoard() {
		for (int c = 1; c < 7; c++) {
			for (int j = 0; j < 7; j++) {
				buttons[c][j].setIcon(null);
			}
		}
	}

	public static void main(String[] args) {
		Connect4 juego = new Connect4();
		juego.setBounds(0, 0, 600, 600);
		juego.setVisible(true);
		juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		juego.setLocationRelativeTo(null);

	}
}