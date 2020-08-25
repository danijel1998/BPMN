package tree.listener;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import tree.model.Book;

public class CustomTreeSelectionListener implements TreeSelectionListener {

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		System.out.println(arg0.getPath().getParentPath() + " " + arg0.getPath().getLastPathComponent().toString());
		
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) arg0.getPath().getLastPathComponent();
		if(selectedNode.getUserObject() instanceof Book)
		{
			Book book = (Book) selectedNode.getUserObject();
			System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getPrice() + "KM");
		}
		System.out.println();
	}

}
