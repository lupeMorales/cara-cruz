package CaraCruz;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;



public class ButtonCaraCruz extends JButton implements ActionListener {

	public int buttonId;

	public ButtonCaraCruz(int x, int y, int w, int h, int id) {

		buttonId = id;

		setSize(70, 70);
		setBounds(x, y, w, h);
		setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		setOpaque(true);
		setSelected(false);
		addActionListener(this);

	}

	public ButtonCaraCruz(String txt, int x, int y, int w, int h, int id) {

		buttonId = id;
		setText(txt);
		setBounds(x, y, w, h);
		setBorder(BorderFactory.createLineBorder(Color.gray, 2, false));
		setOpaque(true);
		setSelected(false);
		addActionListener(this);

	}

	public int getButtonId() {
		return buttonId;
	}

	public void setButtonId(int buttonId) {
		this.buttonId = buttonId;
	}


	public void actionPerformed(ActionEvent e) {

		if (buttonId == 1) {
			ManagerCaraCruz.managerCaraCruzImplements.selectBet(true);
			
		}
		if (buttonId == 2) {
			ManagerCaraCruz.managerCaraCruzImplements.selectBet(false);
			
		} else if (buttonId == 5) {
			ManagerCaraCruz.managerCaraCruzImplements.inicScreem();
		}
	}

}
