package project1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;



public class FormPanel extends JPanel{
	
	private JLabel wordProcessed;
	private JLabel blankLine;
	private JLabel aveWord;
	private JLabel linesProcessed;
	private JLabel aveLine;
	
	private JLabel wordProcessedField;
	private JLabel blankLineField;
	private JLabel aveWordField;
	private JLabel linesProcessedField;
	private JLabel aveLineField;
	
	private String word = "";
	private String line = "";
	private String lineRemoved = "";
	private String avaregeWords = "";
	private String avaregeLine = "";


	public void updateWordProcessedField (String text) {
		wordProcessedField.setText(text);
		wordProcessedField.updateUI();
	}


	public FormPanel(){
		
		
		
		Dimension dim = getPreferredSize();
		
		//System.out.println(dim);
			dim.width =100;
			setPreferredSize(dim);
			//System.out.println(dim);

			
			wordProcessed = new JLabel("word Processed: ");
			
			linesProcessed = new JLabel("Line Processed :");
			aveWord = new JLabel ("Avarage Words/Line: ");
			blankLine = new JLabel ("Blank Line Removed: ");
			aveLine = new JLabel ("Avarage Line Length: ");
		
			
			
			wordProcessedField = new JLabel(word);
			linesProcessedField = new JLabel(line);
			blankLineField = new JLabel(lineRemoved);
			aveWordField = new JLabel(avaregeWords);
			aveLineField = new JLabel(avaregeLine);
			
			
		
			
			Border innerBorder = BorderFactory.createTitledBorder("statistics");
			Border outterBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
			setBorder(BorderFactory.createCompoundBorder(outterBorder, innerBorder));
		
			setLayout(new GridBagLayout());
			
			GridBagConstraints gc = new GridBagConstraints();
			
			
			
			////// First row
			
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			gc.gridx = 0;
			gc.gridy= 0;
			gc.fill = GridBagConstraints.NONE;
			gc.anchor = GridBagConstraints.LINE_END;
			gc.insets = new Insets(0, 0, 0, 5);
			add(wordProcessed, gc);
			
			
			gc.gridx =1;
			gc.gridy =0;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(wordProcessedField, gc);
			
		////// Second row
			
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			
			gc.gridy = 1;
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(linesProcessed, gc);
			
			gc.gridy =1;
			gc.gridx = 1;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(linesProcessedField, gc);
			
			// Third row
			
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			gc.gridy = 2;
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(blankLine, gc);
			
			gc.gridy =2;
			gc.gridx = 1;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(blankLineField, gc);
			
			
			
			// Forth row
			
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			gc.gridy = 3;
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(aveWord, gc);
			
			gc.gridy =3;
			gc.gridx = 1;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(aveWordField, gc);
			
			
			
			// fifth row
			
			gc.weightx = 0.1;
			gc.weighty = 0.1;
			
			gc.gridy = 4;
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 5);
			gc.anchor = GridBagConstraints.LINE_END;
			add(aveLine, gc);
			
			gc.gridy =4;
			gc.gridx = 1;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_START;
			add(aveLineField, gc);
			
			

	}
	
	
	
	
	

}


