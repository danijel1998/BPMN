package tree.editor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;

import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellEditor;

public class CustomCellEditor implements TreeCellEditor {
	
	CellEditorListener listener = null;
	JTextField textField = null;
	
	boolean leaf = false;
	Object value = "";

	@Override
	public void addCellEditorListener(CellEditorListener arg0) {
		listener = arg0;
		
	}

	@Override
	public void cancelCellEditing() {
		textField.setText(value.toString());
		
	}

	@Override
	public Object getCellEditorValue() {
		return this.value;
	}

	@Override
	public boolean isCellEditable(EventObject arg0) {
		
		if((arg0 instanceof MouseEvent) && SwingUtilities.isLeftMouseButton((MouseEvent)arg0))
		{
			MouseEvent mEvent = (MouseEvent) arg0;
			
			JTree stablo = (JTree) arg0.getSource();
			DefaultMutableTreeNode node = (DefaultMutableTreeNode) stablo.getPathForLocation(mEvent.getX(), mEvent.getY()).getLastPathComponent();
			
			if(mEvent.getClickCount()>=2 && node.isLeaf())
				return true;
		}
		return false;
	}

	@Override
	public void removeCellEditorListener(CellEditorListener arg0) {
		this.listener = null;	
	}

	@Override
	public boolean shouldSelectCell(EventObject arg0) {
		if((arg0 instanceof MouseEvent) && SwingUtilities.isLeftMouseButton((MouseEvent)arg0))
		{
			MouseEvent mEvent = (MouseEvent) arg0;
			if(mEvent.getClickCount()==1)
				return true;
		}
		return false;
	}

	@Override
	public boolean stopCellEditing() {
		this.value = textField.getText();
		return true;
	}

	@Override
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row) {
		
		this.leaf = leaf;
		this.value = value;
		
		if(leaf)
		{
			textField = new JTextField();
			textField.setText(value.toString());
			textField.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(stopCellEditing())
					{
						listener.editingStopped(new ChangeEvent(arg0.getSource()));
					}
					
				}
			});
		}
		return textField;
	}

}
