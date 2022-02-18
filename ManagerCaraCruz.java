package CaraCruz;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ManagerCaraCruz {

	int currentScoreJ1 = 100;
	int currentScoreJ2 = 100;
	int resultadoJugado = 0;

	public int getCurrentScoreJ1() {
		return currentScoreJ1;
	}

	public void setCurrentScoreJ1(int currentScoreJ1) {
		this.currentScoreJ1 = currentScoreJ1;
	}

	public int getCurrentScoreJ2() {
		return currentScoreJ2;
	}

	public void setCurrentScoreJ2(int currentScoreJ2) {
		this.currentScoreJ2 = currentScoreJ2;
	}

	public static ManagerCaraCruz managerCaraCruzImplements;

	public ManagerCaraCruz() {

		managerCaraCruzImplements = this;

	}

	public void inicScreem() {

		currentScoreJ1 = 100;
		currentScoreJ2 = 100;

		PanelCaraCruz.panelCaraCruzImplements.labelJ1.setText(currentScoreJ1 + "");
		PanelCaraCruz.panelCaraCruzImplements.labelJ2.setText(currentScoreJ2 + "");

		resetBet();
	}

	public void resetBet() { // si los jugadores aun no han llegado a 0, se resetean textfield para poder
								// apostar de nuevo
		ImageIcon defaultImage = new ImageIcon("/Users/Lupe/eclipse-workspace/huella.png");
		PanelCaraCruz.panelCaraCruzImplements.button1.setIcon(new ImageIcon(
				defaultImage.getImage().getScaledInstance(PanelCaraCruz.panelCaraCruzImplements.button1.getWidth(),
						PanelCaraCruz.panelCaraCruzImplements.button1.getHeight(), Image.SCALE_SMOOTH)));

		PanelCaraCruz.panelCaraCruzImplements.textFieldJ1.setText(null);
		PanelCaraCruz.panelCaraCruzImplements.textFieldJ2.setText(null);
		PanelCaraCruz.panelCaraCruzImplements.button2.setSelected(false);
		PanelCaraCruz.panelCaraCruzImplements.button3.setSelected(false);
		PanelCaraCruz.panelCaraCruzImplements.button4.setSelected(false);
		PanelCaraCruz.panelCaraCruzImplements.button5.setSelected(false);
		PanelCaraCruz.panelCaraCruzImplements.button2.setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		PanelCaraCruz.panelCaraCruzImplements.button3.setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		PanelCaraCruz.panelCaraCruzImplements.button4.setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		PanelCaraCruz.panelCaraCruzImplements.button5.setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		PanelCaraCruz.panelCaraCruzImplements.buttonNewBet
				.setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));

	}

	public void checkGame() {// comprueba e inicia la pantalla segun si el jugador puedo o no seguir
								// apostando

		if (Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.labelJ1.getText()) == 0
				|| Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.labelJ2.getText()) == 0) {
			JOptionPane.showInternalMessageDialog(null, "GAME OVER");

		} else {
			resetBet();

		}
	}

	public int launch() {
		int result = 0;
		result = (int) (Math.random() * 2);// (int) para que el método math me de un número entero, en vez de double,
											// comprendido entre 0 y 1, cada número se corresponderá a un elemento del
		System.out.println(result); // juego
		return result;

	}

	public void showLaunch() { // lanza moneda.
		
		resultadoJugado = launch();

		if (resultadoJugado == 0) {

			ImageIcon defaultImage = new ImageIcon("/Users/Lupe/eclipse-workspace/perrito.png");

			PanelCaraCruz.panelCaraCruzImplements.button1.setIcon(new ImageIcon(
					defaultImage.getImage().getScaledInstance(PanelCaraCruz.panelCaraCruzImplements.button1.getWidth(),
							PanelCaraCruz.panelCaraCruzImplements.button1.getHeight(), Image.SCALE_SMOOTH)));

		} else {

			ImageIcon defaultImage = new ImageIcon("/Users/Lupe/eclipse-workspace/gatito.png");

			PanelCaraCruz.panelCaraCruzImplements.button1.setIcon(new ImageIcon(
					defaultImage.getImage().getScaledInstance(PanelCaraCruz.panelCaraCruzImplements.button1.getWidth(),
							PanelCaraCruz.panelCaraCruzImplements.button1.getHeight(), Image.SCALE_SMOOTH)));

		}
	}

	public void selectBet(boolean parSelected) {

		// parSelected =! parSelected; porque no funciona inversor??

		if (parSelected) {
			PanelCaraCruz.panelCaraCruzImplements.button2
					.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
			PanelCaraCruz.panelCaraCruzImplements.button2.setSelected(true);
			PanelCaraCruz.panelCaraCruzImplements.button5
					.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));

			PanelCaraCruz.panelCaraCruzImplements.button3
					.setBorder(BorderFactory.createLineBorder(Color.gray, 4, false));
			PanelCaraCruz.panelCaraCruzImplements.button3.setSelected(false);
			PanelCaraCruz.panelCaraCruzImplements.button4
					.setBorder(BorderFactory.createLineBorder(Color.gray, 4, false));

		} else {
			PanelCaraCruz.panelCaraCruzImplements.button3
					.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));
			PanelCaraCruz.panelCaraCruzImplements.button3.setSelected(true);
			PanelCaraCruz.panelCaraCruzImplements.button4
					.setBorder(BorderFactory.createLineBorder(Color.green, 4, false));

			PanelCaraCruz.panelCaraCruzImplements.button2
					.setBorder(BorderFactory.createLineBorder(Color.gray, 4, false));
			PanelCaraCruz.panelCaraCruzImplements.button2.setSelected(false);
			PanelCaraCruz.panelCaraCruzImplements.button5
					.setBorder(BorderFactory.createLineBorder(Color.gray, 4, false));

		}

	}

	public int randomBet(String dineroJ2) {

		int J2 = Integer.parseInt(dineroJ2);
		int pointToBet = 1;
		pointToBet = (int) (Math.random() * J2 + 1);// (int) para que el método math me de un número entero, en vez de
													// double,

		return pointToBet;
	}

	public boolean checkBetJ1() { // hacer una comprobacion, que nunca se pueda
		// apostar mas de lo que te queda de puntos //ni menos de 1

		if (Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.textFieldJ1.getText()) <= currentScoreJ1) {
			System.out.println(currentScoreJ1);
			return true;

		} else {

			JOptionPane.showInternalMessageDialog(null, "Revise su apuesta Jugador 1");
			return false;
		}
	}

	public void youWin() {
		currentScoreJ1 += Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.textFieldJ1.getText());
		currentScoreJ2 -= Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.textFieldJ2.getText());
		PanelCaraCruz.panelCaraCruzImplements.labelJ1.setText(currentScoreJ1 + "");
		PanelCaraCruz.panelCaraCruzImplements.labelJ2.setText(currentScoreJ2 + "");
		JOptionPane.showInternalMessageDialog(null, "GANA JUGADOR 1");

	}

	public void youLoose() {

		currentScoreJ1 -= Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.textFieldJ1.getText());
		currentScoreJ2 += Integer.parseInt(PanelCaraCruz.panelCaraCruzImplements.textFieldJ2.getText());
		PanelCaraCruz.panelCaraCruzImplements.labelJ1.setText(currentScoreJ1 + "");
		PanelCaraCruz.panelCaraCruzImplements.labelJ2.setText(currentScoreJ2 + "");
		JOptionPane.showInternalMessageDialog(null, "GANA JUGADOR 2");
	}

	public void checkWinner() {

		if (PanelCaraCruz.panelCaraCruzImplements.button2.isSelected() && resultadoJugado == 0) {
			youWin();
			checkGame();
		} else if (PanelCaraCruz.panelCaraCruzImplements.button2.isSelected() && resultadoJugado == 1) {
			youLoose();
			checkGame();
		} else if (PanelCaraCruz.panelCaraCruzImplements.button3.isSelected() && resultadoJugado == 0) {
			youLoose();
			checkGame();
		} else if (PanelCaraCruz.panelCaraCruzImplements.button3.isSelected() && resultadoJugado == 1) {
			youWin();
			checkGame();
		}
	}

}
