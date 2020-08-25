package tree.listener;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTreeExpansionListener implements TreeExpansionListener {

	@Override
	public void treeCollapsed(TreeExpansionEvent arg0) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arg0.getPath().getLastPathComponent();
		System.out.println("Skupljeno: " + selectedNode.getUserObject());

	}

	@Override
	public void treeExpanded(TreeExpansionEvent arg0) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arg0.getPath().getLastPathComponent();
		System.out.println("Prosireno: " + selectedNode.getUserObject());

	}

}
