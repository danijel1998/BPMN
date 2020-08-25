package tree.model;

import javax.swing.tree.DefaultMutableTreeNode;

public class BookNode extends DefaultMutableTreeNode{

	private static final long serialVersionUID = 1L;
	
	public BookNode(Book book) {
		super(book);
		
		DefaultMutableTreeNode doc = new DefaultMutableTreeNode(book.getTitle() + ".doc");
		add(doc);
		
		DefaultMutableTreeNode pdf = new DefaultMutableTreeNode(book.getTitle() + ".pdf");
		add(pdf);
	}

}
