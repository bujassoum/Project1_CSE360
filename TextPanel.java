package project1;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class TextPanel extends javax.swing.JPanel {
	
	
	private JTextArea textArea;
	public TextPanel() {
		
		Dimension dim = getPreferredSize();
		
		//System.out.println(dim);
			dim.width =400;
			setPreferredSize(dim);
			//System.out.println(dim);
		
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		//add(textArea, BorderLayout.CENTER);
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	
	}
	
	public void appendText(String text){
		
		textArea.append(text);
	
	}
	
}
