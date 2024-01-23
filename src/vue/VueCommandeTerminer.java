package vue;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class VueCommandeTerminer extends JTabbedPane{
	
	private JPanel Commandesterminer;
	
	public VueCommandeTerminer() {
		
		super();
		this.Commandesterminer = new JPanel();
		this.Commandesterminer.setPreferredSize(new Dimension(0,100));
		this.Commandesterminer.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.Commandesterminer.add(new VueCommandeTerminerItem());
		
		this.add("Commandes Terminer",this.Commandesterminer);
	}
	
}