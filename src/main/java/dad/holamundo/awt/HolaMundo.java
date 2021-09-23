package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class HolaMundo {

	public static void main(String[] args) {

		 // creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aqui saldra el saludo");
		saludoLabel.setBounds(20, 20, 20, 20); //x, y, ancho, alto 

		//Creacion de boton
		Button saludoButton= new Button();
		saludoButton.setLabel("Saludar");
		saludoButton.setBounds(20, 80, 120, 30);
		//Poner evento al boton
		saludoButton.addActionListener(e -> saludoLabel.setText("Hola Mundo"));
		
		//Implementacion de panel
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludoButton);
		
		//Ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		
		frame.setVisible(true);
		
		//Evento de cerrar ventana
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				
				frame.dispose();
			}
		});
		
	}

}
