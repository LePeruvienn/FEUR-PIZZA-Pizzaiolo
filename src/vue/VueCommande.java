package vue;

import java.awt.*;

import javax.swing.*;

public class VueCommande extends JTabbedPane {
	
	private JPanel infoCommande;
	private JLabel tempsEcouler;
	private JButton selectCommande;
	
	public VueCommande() {
		super();
		
		this.infoCommande = new JPanel();
		this.infoCommande.setPreferredSize(new Dimension(210,300));
		this.infoCommande.setLayout(new BorderLayout());
		
		this.tempsEcouler = new JLabel("Temps écouler : X min", SwingConstants.CENTER);
		
		JScrollPane scroll = new JScrollPane();
		
		scroll.getViewport().add(new VueContenueCommande());
		
		this.selectCommande = new JButton("Selectionner");
		
		this.infoCommande.add(scroll,BorderLayout.CENTER);
		this.infoCommande.add(tempsEcouler,BorderLayout.NORTH);
		this.infoCommande.add(this.selectCommande,BorderLayout.SOUTH);
		
		this.add("Commande",this.infoCommande);
	}
}