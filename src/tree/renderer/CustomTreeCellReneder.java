package tree.renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import tree.model.Book;

public class CustomTreeCellReneder extends JLabel implements TreeCellRenderer {

	private static final long serialVersionUID = 1L;
	private DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		setOpaque(true);
		setBackground(defaultTreeCellRenderer.getBackground());
		setForeground(defaultTreeCellRenderer.getForeground());
		
		String naziv = value.toString();
		setText(naziv);
		
		
		DefaultMutableTreeNode cvor = (DefaultMutableTreeNode) value;
		if(cvor.getUserObject() instanceof Book)
		{
			Image image = new ImageIcon("icons/book.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			Font font = new Font("Arial", Font.BOLD, 12);
			setFont(font);
		}
		else if (naziv.endsWith("doc")) {
			Image image = new ImageIcon("icons/doc.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			setFont(defaultTreeCellRenderer.getFont());
		}
		else if (naziv.endsWith("pdf")) {
			Image image = new ImageIcon("icons/pdf.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			setFont(defaultTreeCellRenderer.getFont());
		}
		else
		{
			Image image = new ImageIcon("icons/folder-open.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			setFont(defaultTreeCellRenderer.getFont());
		}
		
		if(selected)
		{
			setBackground(new Color(200, 200, 200));
		}
		
		setBorder(BorderFactory.createEmptyBorder(3,5,3,5));
		tree.setRowHeight(22);
		return this;
	}

}
