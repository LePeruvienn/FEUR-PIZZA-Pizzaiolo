package vue;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class VueCommandeSelectionner extends JTabbedPane{
	
	private JLabel tempsCommande;
	private JPanel commandeSelect;
	private JButton boutonTerminer;
	
	public VueCommandeSelectionner() {
		super();
		this.tempsCommande = new JLabel("Temps écouler : X min", SwingConstants.CENTER);
		this.tempsCommande.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 17f));
		this.tempsCommande.setPreferredSize(new Dimension(0,30));
		this.commandeSelect = new JPanel();
		this.commandeSelect.setPreferredSize(new Dimension(300,0));
		this.commandeSelect.setLayout(new BorderLayout());
		
		JScrollPane scroll = new JScrollPane();
		
		scroll.getViewport().add(new VueContenueCommande());
		
		this.boutonTerminer = new JButton("Terminer");
		this.boutonTerminer.setPreferredSize(new Dimension(0,50));
		this.boutonTerminer.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 20f));
		
		
		this.commandeSelect.add(this.tempsCommande,BorderLayout.NORTH);
		this.commandeSelect.add(scroll);
		this.commandeSelect.add(this.boutonTerminer,BorderLayout.SOUTH);
		
		this.add("Commande Selectionner",this.commandeSelect);
	}
}
