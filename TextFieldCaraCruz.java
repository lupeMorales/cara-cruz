package CaraCruz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class TextFieldCaraCruz extends JTextField implements ActionListener {

	int idTextField;

	public TextFieldCaraCruz(boolean editable, int x, int y, int id) {

		idTextField = 0;
		setEditable(editable);
		setSize(145, 20);
		setLocation(x, y);
		setVisible(true);
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		PanelCaraCruz.panelCaraCruzImplements.textFieldJ1.setText(getText());
		if(ManagerCaraCruz.managerCaraCruzImplements.checkBetJ1()){
			
			int apuestaJ2 = ManagerCaraCruz.managerCaraCruzImplements
					.randomBet(PanelCaraCruz.panelCaraCruzImplements.labelJ2.getText());
			PanelCaraCruz.panelCaraCruzImplements.textFieldJ2.setText(apuestaJ2 + "");
		
			ManagerCaraCruz.managerCaraCruzImplements.showLaunch();
	
			ManagerCaraCruz.managerCaraCruzImplements.checkWinner();
		}

		

	}
}