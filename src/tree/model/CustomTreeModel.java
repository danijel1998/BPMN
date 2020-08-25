package tree.model;

import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTreeModel extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 1L;
	
	public CustomTreeModel() {
		super("Root");
		
		DefaultMutableTreeNode knjige = new DefaultMutableTreeNode("Knjige");
		add(knjige);
		
		DefaultMutableTreeNode romani = new DefaultMutableTreeNode("Romani");
		knjige.add(romani);
		
		Book book1 = new Book("Na Drini cuprija", "Ivo Andric", 15.5f);
		romani.add(new BookNode(book1));
		
		Book book2 = new Book("Tvrdjava", "Mesa Selimovic", 16.8f);
		romani.add(new BookNode(book2));
		
		DefaultMutableTreeNode udzbenici = new DefaultMutableTreeNode("Udzbenici");
		knjige.add(udzbenici);
		
		Book book3 = new Book("Jawa Swing", "John Zukowski", 24.99f);
		udzbenici.add(new BookNode(book3));
	}

}
