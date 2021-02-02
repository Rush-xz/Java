import java.awt.*;
import java.awt.event.*;

//Blank frame using anonymous inner class
class BlankFrameUsingInnerClass
{
	public static void main( String arg[] )
	{
		Frame fobj = new Frame("Marvellous");

		fobj.setSize(1500,1000);

		fobj.setVisible(true);

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
