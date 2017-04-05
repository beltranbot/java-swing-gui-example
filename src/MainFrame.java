import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DetailsPanel detailsPanel;
	
	public MainFrame(String title) {
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		// Create Swing components
		JTextArea textArea = new JTextArea();
		// JButton button = new JButton("Click me!");
		
		detailsPanel = new DetailsPanel();
		
		detailsPanel.addDetailListener(new DetailListener(){
			public void detailEventOccured(DetailEvent event) {
				String text = event.getText();
				textArea.append(text);
				
			}
		});
		
		// Add swing components to content pane
		
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		// c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.WEST);
		
		/*
		// Add behavior
		// using the ActionListener interface
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");
			}			
		});
		*/
		
	}

}
