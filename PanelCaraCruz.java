package CaraCruz;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import javax.swing.JLabel;

public class PanelCaraCruz extends JPanel {

	public ButtonCaraCruz button1, button2, button3, buttonNewBet, button4, button5;
	public TextFieldCaraCruz textFieldJ1, textFieldJ2;
	public LabelCaraCruz labelJ1, labelJ2, labelJugador1, labelJugador2;

	public static PanelCaraCruz panelCaraCruzImplements;

	public PanelCaraCruz() {
		super();

		panelCaraCruzImplements = this;
		setLayout(null);
		fillThePanel();

	}

	public void fillThePanel() {

		button1 = new ButtonCaraCruz(325, 60, 100, 100, 0);
		add(button1);
		ImageIcon defaultImage = new ImageIcon("/Users/Lupe/eclipse-workspace/huella.png");
		button1.setIcon(new ImageIcon(defaultImage.getImage().getScaledInstance(button1.getWidth(), button1.getHeight(),
				Image.SCALE_SMOOTH)));

		button2 = new ButtonCaraCruz( 130, 195, 70, 70, 1);
		add(button2);

		ImageIcon perrito = new ImageIcon("/Users/Lupe/eclipse-workspace/perrito.png");
		button2.setIcon(new ImageIcon(
				perrito.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), Image.SCALE_SMOOTH)));

		button3 = new ButtonCaraCruz( 205, 195, 70, 70, 2);
		add(button3);

		ImageIcon gatito = new ImageIcon("/Users/Lupe/eclipse-workspace/gatito.png");
		button3.setIcon(new ImageIcon(
				gatito.getImage().getScaledInstance(button3.getWidth(), button3.getHeight(), Image.SCALE_SMOOTH)));

		button4 = new ButtonCaraCruz(485, 195, 70, 70, 3);
		add(button4);

		ImageIcon perrito2 = new ImageIcon("/Users/Lupe/eclipse-workspace/perrito.png");
		button4.setIcon(new ImageIcon(
				perrito2.getImage().getScaledInstance(button4.getWidth(), button4.getHeight(), Image.SCALE_SMOOTH)));

		button5 = new ButtonCaraCruz(565, 195, 70, 70, 4);
		add(button5);
		ImageIcon gatito2 = new ImageIcon("/Users/Lupe/eclipse-workspace/gatito.png");
		button5.setIcon(new ImageIcon(
				gatito2.getImage().getScaledInstance(button5.getWidth(), button5.getHeight(), Image.SCALE_SMOOTH)));

		buttonNewBet = new ButtonCaraCruz("PLAY AGAIN", 600, 40, 100, 25, 5);
		add(buttonNewBet);

		textFieldJ1 = new TextFieldCaraCruz(true, 130, 300, 0);
		add(textFieldJ1);
		textFieldJ2 = new TextFieldCaraCruz(true, 490, 300, 1);
		add(textFieldJ2);

		labelJ1 = new LabelCaraCruz(245, 280, 30, 20, "100");
		add(labelJ1);
		labelJ2 = new LabelCaraCruz(610, 280, 30, 20, "100");
		add(labelJ2);
		labelJugador1 = new LabelCaraCruz(130, 280, 90, 20, "Jugador 1:");
		add(labelJugador1);
		labelJugador2 = new LabelCaraCruz(490, 280, 90, 20, "Jugador 2:");
		add(labelJugador2);

	}

}
