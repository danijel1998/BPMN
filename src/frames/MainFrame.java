package frames;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import fileTree.FileTree;
import menu.Menu;
import panel.MainPanel;
import panel.StatusPanel;
import panel.ToolBoxPanel;


public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public MainFrame() {
		setTitle("BPMN Editor");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);		
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(new FileTree(new File("C:\\Users\\xxx\\Desktop\\New folder\\Editor Bpmn\\src")),BorderLayout.WEST);
		getContentPane().add(new MainPanel(),BorderLayout.CENTER);
		getContentPane().add(new JToolBar(JToolBar.HORIZONTAL),BorderLayout.NORTH);
		getContentPane().add(new ToolBoxPanel(this.getHeight()),BorderLayout.EAST);
		
		StatusPanel statusPanel = new StatusPanel(this.getWidth());
		
		add(statusPanel, BorderLayout.SOUTH);
		setJMenuBar(new Menu());
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

}
