package panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;

public class StatusPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StatusPanel(int parentWidth) {
		setBorder(new BevelBorder(BevelBorder.LOWERED));
		setPreferredSize(new Dimension(parentWidth, 16));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		JLabel statusLabel = new JLabel();
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		add(statusLabel);
		
		ActionListener updateClockAction = new ActionListener() {
			@Override
			  public void actionPerformed(ActionEvent e) {
			   
			      statusLabel.setText(new Date().toString()); 
			    }
			};
		Timer t = new Timer(1000, updateClockAction);
		
		t.start();
	}

}
