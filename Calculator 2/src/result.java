import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.BorderLayout;

class result extends JPanel {

	/**
	 * Create the panel.
	 */
	public result() {
		setLayout(new BorderLayout(0, 0));
		
		JTextPane textPane = new JTextPane();
		add(textPane, BorderLayout.CENTER);

	}

}
