package vue;

import java.awt.*;
import javax.swing.*;

public class VueCommandeTerminerItem extends JTabbedPane{
	
	private String numCommande;
	private JLabel dateTerm;
	private JPanel itemPanel;
	private JButton BoutonInfo;
	
	public VueCommandeTerminerItem() {
		super();
		this.numCommande = "Num Commande : XX";
		this.dateTerm = new JLabel(" à XX", SwingConstants.CENTER);
		this.itemPanel = new JPanel();
		this.itemPanel.setLayout(new BorderLayout());
		this.BoutonInfo = new JButton("Info");
		
		JLabel labelCheck = new JLabel("TERMINER",SwingConstants.CENTER);
		labelCheck.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.itemPanel.add(this.dateTerm,BorderLayout.CENTER);
		this.itemPanel.add(labelCheck,BorderLayout.NORTH);
		this.itemPanel.add(this.BoutonInfo,BorderLayout.SOUTH);
		
		this.add(this.numCommande,this.itemPanel);
		
	}
	
}
