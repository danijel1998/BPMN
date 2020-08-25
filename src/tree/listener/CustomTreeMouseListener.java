package tree.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class CustomTreeMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(SwingUtilities.isRightMouseButton(arg0))
		{
			JTree tree = (JTree) arg0.getSource();
			
			TreePath treePath = tree.getPathForLocation(arg0.getX(), arg0.getY());
			if(treePath!=null) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) treePath.getLastPathComponent();
				
				DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
				if(model.isLeaf(node))
				{
					model.removeNodeFromParent(node);
					tree.setModel(model);
				}
			}
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
