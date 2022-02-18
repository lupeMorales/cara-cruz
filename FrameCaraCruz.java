package CaraCruz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import tresEnRaya.Panel3Raya;

import javax.swing.JFrame;

public class FrameCaraCruz extends JFrame {
	


	public FrameCaraCruz(PanelCaraCruz p) {
		/*
		 * creo una clase Toolkit q llama al metodo que me devuelve devuelve un objeto
		 * tipo toolkit con el medio por el que ejecuto mi programa. creo la clase
		 * dimension que llama al metodo para saber la resolucion o el tamaño de my
		 * ventana
		 * 
		 */

		setTitle("CARA CRUZ");
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		Dimension myScreenSize = myScreen.getScreenSize();
		int myScreenHeight = myScreenSize.height;
		int myScreenWidth = myScreenSize.width;
		// ayudandome delos parametros altura y ancho de mi pantalla,establezco el
		// tamaño del frame
		setSize(myScreenWidth /2, myScreenHeight / 2);
		// localizo en el centro mi frame al ejecutarse.
		setLocation(myScreenWidth /4, myScreenHeight / 8);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		setResizable(false);
		add(p);
	
		
		

		Image miIcono = Toolkit.getDefaultToolkit().getImage("/Users/Lupe/eclipse-workspace/huella.png");
		setIconImage(miIcono); // cambia el icono del frame que aparece por defecto arriba a la izq.

	}
}


