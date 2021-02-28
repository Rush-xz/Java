import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class Sample extends JFrame{

	public static void main(String[] args) {
		Sample frame = new Sample();
		frame.setSize(1000,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public Sample() {

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel _header = new Panel();
		_header.setBackground(Color.blue);
		_header.setBounds(0, 0, 982, 127);
		add(_header);
		/*Panel panel = new Panel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 982, 127);
		add(panel);*/
	}

}
