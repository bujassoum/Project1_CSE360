package project1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
	
	
	private TextPanel textPanel1;
	private TextPanel textPanel2;

	private Toolbar toolBar;
	private FormPanel formPanel;
	
	public MainFrame() {
	
		
		
		
		super("Text Formater");
		setLayout(new BorderLayout());
		
		toolBar = new Toolbar();
		textPanel1 = new TextPanel();
		textPanel2 = new TextPanel();
		formPanel = new FormPanel();
		
		toolBar.setStringListener(new StringListener(){

			public void textEmitted(String text) {
				textPanel1.appendText(text);
				
				
			}

			public void textEmitted1(String text) {
				textPanel2.appendText(text);				
			}
			
			
		});
		
		toolBar.setPanel (formPanel);
		toolBar.setLine(formPanel);
		
		
	
		add(formPanel, BorderLayout.CENTER);
		add(toolBar, BorderLayout.NORTH);
		add(textPanel1, BorderLayout.EAST);
		add(textPanel2, BorderLayout.WEST);
		
		setSize(900, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
