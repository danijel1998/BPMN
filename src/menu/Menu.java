package menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

//import actionlisteners.MenuHelpActionListener;
//import actionlisteners.MenuViewActionListener;

public class Menu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenu menuEdit = null;
	JMenu menuFile = null;
	
	
	public Menu() {
		menuFile = new JMenu("File");
		initMenuFile();
		menuEdit = new JMenu("Edit");
		initMenuEdit();
		add(menuFile);
		add(menuEdit);
	
		
		
	}
	
	public void initMenuFile() {
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		newMenuItem.setIcon(new ImageIcon("icons/application_add.png"));
		menuFile.add(newMenuItem);
		
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		openMenuItem.setIcon(new ImageIcon("icons/folder-open.png"));
		menuFile.add(openMenuItem);
		
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		saveMenuItem.setIcon(new ImageIcon("icons/disk.png"));
		menuFile.add(saveMenuItem);
		
		JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
		saveAsMenuItem.setMnemonic(KeyEvent.VK_A);
		saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK+KeyEvent.SHIFT_MASK));
		saveAsMenuItem.setIcon(new ImageIcon("icons/disks.png"));
		menuFile.add(saveAsMenuItem);
		
		menuFile.addSeparator();
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
		exitMenuItem.setIcon(new ImageIcon("icons/door-open-out.png"));
		menuFile.add(exitMenuItem);
	}

	public void initMenuEdit() {
		JMenuItem undoMenuItem = new JMenuItem("Undo");
		undoMenuItem.setMnemonic(KeyEvent.VK_U);
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		undoMenuItem.setIcon(new ImageIcon("icons/arrow-curve-180-left.png"));
		menuEdit.add(undoMenuItem);
		
		JMenuItem redoMenuItem = new JMenuItem("Redo");
		redoMenuItem.setMnemonic(KeyEvent.VK_R);
		redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		redoMenuItem.setIcon(new ImageIcon("icons/arrow-curve.png"));
		menuEdit.add(redoMenuItem);
		
		menuEdit.addSeparator();
		
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setMnemonic(KeyEvent.VK_C);
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		cutMenuItem.setIcon(new ImageIcon("icons/scissors.png"));
		menuEdit.add(cutMenuItem);
		
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setMnemonic(KeyEvent.VK_O);
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		copyMenuItem.setIcon(new ImageIcon("icons/document-copy.png"));
		menuEdit.add(copyMenuItem);
		
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setMnemonic(KeyEvent.VK_P);
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		pasteMenuItem.setIcon(new ImageIcon("icons/clipboard-paste.png"));
		menuEdit.add(pasteMenuItem);
		
		menuEdit.addSeparator();
		
		JMenu zoomMenu = new JMenu("Zoom");
		menuEdit.add(zoomMenu);
		
		JMenuItem magnifier = new JMenuItem("Magnifier");
		magnifier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_MASK));
		magnifier.setIcon(new ImageIcon("icons/magnifier.png"));
		zoomMenu.add(magnifier);
		
		JMenuItem zoomIn = new JMenuItem("Zoom In");
		zoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, KeyEvent.CTRL_MASK));
		zoomIn.setIcon(new ImageIcon("icons/magnifier-zoom-in.png"));
		zoomMenu.add(zoomIn);
		
		JMenuItem zoomOut = new JMenuItem("Zoom Out");
		zoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, KeyEvent.CTRL_MASK));
		zoomOut.setIcon(new ImageIcon("icons/magnifier-zoom-out.png"));
		zoomMenu.add(zoomOut);		
	}
/*
	public void initMenuHelp(JMenu menuHelp) {
		JMenuItem showHelpMenuItem = new JMenuItem("Show help");
		showHelpMenuItem.setMnemonic(KeyEvent.VK_S);
		showHelpMenuItem.setAccelerator(KeyStroke.getKeyStroke("F1"));
		showHelpMenuItem.setIcon(new ImageIcon("icons/question-frame.png"));
		showHelpMenuItem.setActionCommand("showDialog");
		showHelpMenuItem.addActionListener(new MenuHelpActionListener());
		menuHelp.add(showHelpMenuItem);
	}

	public void initMenuView(JMenu menuView) {
		JCheckBoxMenuItem showMessageDialogsPanel = new JCheckBoxMenuItem("Message dialogs panel");
		showMessageDialogsPanel.setMnemonic(KeyEvent.VK_M);
		showMessageDialogsPanel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));
		showMessageDialogsPanel.setSelected(true);
		showMessageDialogsPanel.setActionCommand("showMessageDialogsPanel");
		menuView.add(showMessageDialogsPanel);
		
		JCheckBoxMenuItem showOptionDialogsPanel = new JCheckBoxMenuItem("Option dialogs panel");
		showOptionDialogsPanel.setMnemonic(KeyEvent.VK_O);
		showOptionDialogsPanel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, KeyEvent.CTRL_MASK));
		showOptionDialogsPanel.setSelected(true);
		showOptionDialogsPanel.setActionCommand("showOptionDialogsPanel");
		menuView.add(showOptionDialogsPanel);
		
		JCheckBoxMenuItem showInputDialogsPanel = new JCheckBoxMenuItem("Input dialogs panel");
		showInputDialogsPanel.setMnemonic(KeyEvent.VK_I);
		showInputDialogsPanel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.CTRL_MASK));
		showInputDialogsPanel.setSelected(true);
		showInputDialogsPanel.setActionCommand("showInputDialogsPanel");
		menuView.add(showInputDialogsPanel);
		
		JCheckBoxMenuItem showChoosersPanel = new JCheckBoxMenuItem("Choosers panel");
		showChoosersPanel.setMnemonic(KeyEvent.VK_C);
		showChoosersPanel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		showChoosersPanel.setSelected(true);
		showChoosersPanel.setActionCommand("showChoosersPanel");
		menuView.add(showChoosersPanel);
		
		MenuViewActionListener actionListener = new MenuViewActionListener();
		showOptionDialogsPanel.addActionListener(actionListener);
		showMessageDialogsPanel.addActionListener(actionListener);
		showInputDialogsPanel.addActionListener(actionListener);
		showChoosersPanel.addActionListener(actionListener);
	}*/
	
	

}
