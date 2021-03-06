import java.awt.BorderLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;

	public TextPanel() {
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		setBorder(outerBorder);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}//end TextPanel()

	public void appendText(String text){
		textArea.append(text);
	}
	
	public void clearText(){
		textArea.setText(null);
	}
}//end CLASS TextPanel