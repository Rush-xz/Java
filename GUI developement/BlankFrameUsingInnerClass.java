import java.awt.*;
import java.awt.event.*;

//Blank frame using anonymous inner class
class BlankFrameUsingInnerClass
{
	public static void main( String arg[] )
	{
		Frame fobj = new Frame("Marvellous");
		fobj.setSize(800,400);
		fobj.setVisible(true);
		fobj.setBackground(Color.GREEN);
		fobj.setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 782, 182);
		fobj.add(panel);
		//panel.setLayout(null);

		//Anonymous inner class
		fobj.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
