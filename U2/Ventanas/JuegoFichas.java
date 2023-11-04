package U2.Ventanas;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JuegoFichas extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu options;
	JMenuItem newItem;
	JButton buttons[][] = new JButton[7][7];
	JPanel buttonsPanel = new JPanel();
	ImageIcon foto1 = new ImageIcon(getClass().getResource("images/Mordecai.png"));
	ImageIcon foto2 = new ImageIcon(getClass().getResource("images/Rigby.png"));
	ImageIcon checkIcon = new ImageIcon();
	int turno = 1;
	boolean game = true;
	int turns = 0;

	public JuegoFichas() {
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
			turno = 1;
			turns = 0;
		}

		for (int i = 0; i < 7; i++) {
			if (e.getSource() == buttons[0][i]) {

				int k = 7;
				do {
					k--;
				} while (buttons[k][i].getIcon() != null && k > 1);

				if (turno > 0 && buttons[k][i].getIcon() == null) {
					buttons[k][i].setIcon(foto1);
					turns++;
				} else if (turno < 0 && buttons[k][i].getIcon() == null) {
					buttons[k][i].setIcon(foto2);
					turns++;
				}

				checkWin(k, i);

				if (game == false) {
					turno = 1;
				} else {
					turno *= -1;
				}
				game = true;
			}
		}
	}

	public void checkWin(int k, int i) {
		if (turno == 1) {
			checkIcon = foto1;
		} else {
			checkIcon = foto2;
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
				turno = 1;
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
				turno = 1;
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
						turno = 1;
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
				for (int g = 0; g < 4; g++) {
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
						turno = 1;
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
		JuegoFichas juego = new JuegoFichas();
		juego.setBounds(0, 0, 600, 600);
		juego.setVisible(true);
		juego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		juego.setLocationRelativeTo(null);

	}
}