package dad.holamundo.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundo {

	public static void main(String[] args) {
		
		
		//Etiqueta para mostrar el saludo
		JLabel saludoLabel = new JLabel();
		saludoLabel.setText("Aquí saldra el saludo");
		saludoLabel.setBounds(20, 20, 20, 20);
		
		//Creamos el boton para saludar
		JButton saludoButton = new JButton();
		saludoButton.setText("Saludar");
		saludoButton.setBounds(20, 80, 120, 30);
		saludoButton.setToolTipText("Si me pulsas te saludo");
		saludoButton.addActionListener(e -> saludoLabel.setText("Hoal Mundo"));
		
		//Creamos el panel para incluir el boton y la etiqueta 
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludoButton);
		
		//ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320,200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true); //Abrimos la ventana 
	}

}
