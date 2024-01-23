package vue;

import javax.swing.*;
import javax.swing.tree.*;

public class VueContenueCommande extends JTree {
	
	public VueContenueCommande() {
		
		super();
		
		DefaultMutableTreeNode DebutArbre = new DefaultMutableTreeNode("Commande numéro : XX");
		
		DefaultMutableTreeNode NodePizzza1 = new DefaultMutableTreeNode("Pizzza Feurnoi");
		NodePizzza1.add(new DefaultMutableTreeNode("Fromage : 100g"));
		NodePizzza1.add(new DefaultMutableTreeNode("Viande : 10g"));
		NodePizzza1.add(new DefaultMutableTreeNode("Champignons : 50g"));
		
		
		DefaultMutableTreeNode NodePizzza2 = new DefaultMutableTreeNode("Pizza Peperoni");
		
		NodePizzza2.add(new DefaultMutableTreeNode("Peperoni : 100g"));
		NodePizzza2.add(new DefaultMutableTreeNode("Tomage : 10g"));
		NodePizzza2.add(new DefaultMutableTreeNode("Poivrons : 50g"));
		
		DefaultMutableTreeNode Boissons = new DefaultMutableTreeNode("Boissons");
		Boissons.add(new DefaultMutableTreeNode("Coca-cola"));
		Boissons.add(new DefaultMutableTreeNode("Sprite"));
		
		DefaultMutableTreeNode Desserts = new DefaultMutableTreeNode("Desserts");
		Desserts.add(new DefaultMutableTreeNode("Glace"));
		
		DebutArbre.add(NodePizzza1);
		DebutArbre.add(NodePizzza2);
		DebutArbre.add(Boissons);
		DebutArbre.add(Desserts);
		
		
		this.setModel(new DefaultTreeModel(DebutArbre));
		
		for (int i = 0; i < this.getRowCount(); i++) {
	         this.expandRow(i);
	      }
	
	}
	
}
