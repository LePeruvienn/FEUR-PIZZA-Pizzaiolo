package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class FenetrePrincipale extends JFrame {
	
	private JPanel CommandePanel;
	
	public FenetrePrincipale(){
		
		super("FEUR PIZZA | INTERFACE PIZZAIOLO");
		
		this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		this.setSize(new Dimension(1200 , 600));
		this.setLocationRelativeTo( null );
		
		JPanel contentPane = (JPanel) this.getContentPane();;
		
		VueCommandeAPrepare cav = new VueCommandeAPrepare();
		
		this.CommandePanel = new JPanel();
		
		this.CommandePanel.add(cav);
		
		contentPane.setLayout(new BorderLayout( ));
		
		contentPane.add(new Horloge(), BorderLayout.NORTH);
		
		contentPane.add(new VueCommandeSelectionner(),BorderLayout.WEST);
		
		contentPane.add(new VueCommandeTerminer(), BorderLayout.SOUTH);
		
		this.add(cav);
	}
}
