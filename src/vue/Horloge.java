package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

public class Horloge extends JPanel{
	
	private JLabel horloge;
	
	public Horloge() {
		
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(0,40));
		horloge = new JLabel();
		horloge.setHorizontalAlignment(JLabel.CENTER);
		horloge.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 20f));
		horloge.setText(DateFormat.getDateTimeInstance().format(new Date()));
		this.add(horloge);
		
		Timer t = new Timer(500, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
           horloge.setText(
              DateFormat.getDateTimeInstance().format(new Date())
           );
         }
      });
		
      t.setRepeats(true);
      t.setCoalesce(true);
      t.setInitialDelay(0);
      t.start();
      }
}

