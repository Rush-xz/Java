import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

class SampleFrame extends JFrame
{	
	JPanel _top;
	JPanel _header;
	JPanel _content;

	JButton minimize , exit;

	public SampleFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		_top = new JPanel();
		_top.setLayout(null);
		_top.setBackground(new Color(192, 192, 192));
		_top.setBounds(0, 0, 1182, 49);
		this.add(_top);

		_header = new JPanel();
		_header.setLayout(null);
		_header.setBackground(new Color(245, 245, 245));
		_header.setBounds(0, 50, 1182, 141);
		this.add(_header);

		_content = new JPanel();
		_content.setLayout(null);
		_content.setBackground(new Color(0, 0, 205));
		_content.setBounds(0, 190, 1182, 363);
		this.add(_content);
		
		CloseAdmin();
	}

	public void CloseAdmin()
	{
		minimize = new JButton("-");
		minimize.setBackground(UIManager.getColor("Button.highlight"));
		minimize.setFont(new Font("Tahoma", Font.BOLD, 18));
		_top.add(minimize);
	}
	
	public static void main( String arg[])
	{
		SampleFrame frame = new SampleFrame();
		frame.setTitle("File Packer Unpacker Login");
		frame.setSize(1200,600);
		frame.setLayout(null);
		frame.setVisible(true);
		/*setLayout stmnt should before setVisible*/
	}
}