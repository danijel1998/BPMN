package panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBoxPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ToolBoxPanel(int parentHeight) {
		JButton button = new JButton("treba grunuti slicicu");
		//button.setMargin());
		setBackground(Color.GRAY);
	
		this.setPreferredSize(new Dimension(400,parentHeight));
		
		add(button);
		setVisible(true);
		
		
		
	}

}
//za promjenu velicine slike

/*Ok, here's one way of doing it.
You load your image straight into the ImageIcon using the constructor that takes a file name as an argument like:
ImageIcon icon = new ImageIcon("whatever.jpg");
Make sure the reference you create is an ImageIcon reference. Then use getImage() to grab the image from the ImageIcon:
Image img = icon.getImage();
Now create a buffered image the same size as the image:
BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
Then blit the icon image to the buffered image, and resize it as you do so:
Graphics g = bi.createGraphics();
g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
(The code above may be incorrect - check the docs)
Now recreate the IconImage with the new buffered image:
IconImage newIcon = new IconImage(bi);
Hope that helps.*/