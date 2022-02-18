package CaraCruz;


import java.awt.Font;
import javax.swing.JLabel;

public class LabelCaraCruz extends JLabel {

	public LabelCaraCruz(int x, int y, int w, int h, String texto) {
		setBounds(x, y, w, h);
		setText(texto);
		Font fuente2 = new Font("arial", Font.BOLD, 15);
		setFont(fuente2);
	}

}

