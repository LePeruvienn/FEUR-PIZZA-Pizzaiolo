package vue;

import java.awt.*;

import javax.swing.*;

public class VueCommandeAPrepare extends JTabbedPane{
	
	private JPanel commandes;
	
	public VueCommandeAPrepare() {
		super();
		this.commandes = new JPanel();
		this.commandes.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.commandes.add(new VueCommande());
		
		this.add("Commande en cours ...",this.commandes);
	}

	public JPanel getCommandes() {
		return commandes;
	}
	
}
