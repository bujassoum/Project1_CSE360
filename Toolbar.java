package project1;

import java.io.*;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class Toolbar extends JPanel implements ActionListener{
	//JFileChooser chooser = new JFileChooser();
	private JButton select;
	private JButton format;
	private JButton save;
	private String line = null;
	private String temp= null;
	JFileChooser chooser = new JFileChooser();
	private String counter ="";
	private FormPanel pannel;
    int count;

	
	File file = null;
	
	private StringListener textListener; 
	
	public Toolbar(){
		
		setBorder(BorderFactory.createEtchedBorder());
		
		select = new JButton("Select file");
		format = new JButton("Format");
		save = new JButton ("save file");
		
		select.addActionListener(this);
		format.addActionListener(this);
		save.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(select);
		add(format);
		add(save);
		
		
	}
	
	public void setStringListener(StringListener listener){
		
		this.textListener = listener;
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		JButton clicked = (JButton)e.getSource();
		if (clicked == select){
			
			if(textListener != null){
				
				int returnVal = chooser.showOpenDialog(this);
				
				
				if(returnVal == JFileChooser.APPROVE_OPTION)     
				  file = chooser.getSelectedFile();    
				

			
				
				BufferedReader in = null;
				try {
					in = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					line = in.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while(line != null){
				textListener.textEmitted1(line + "\n");
				System.out.println(line + "\n");
				temp = line;
				  try {
					line = in.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
				//final JFileChooser fc = new JFileChooser();
				
				//fc.showOpenDialog(this);
				
				//textListener.textEmitted("input file\n");
				
			}
		}
		if (clicked == format){
			
			if(textListener != null){
				
				
				
				
				//System.out.println(line);
				if ( temp != null ){
					
					try(Scanner sc = new Scanner(new FileInputStream(file))){    // edit this 
					    count=0;
					    while(sc.hasNext()){
					        sc.next();
					        count++;
					    }
					   
					System.out.println("Number of words: " + count);
					pannel.updateWordProcessedField (String.valueOf(count));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					//counter = (String)count;
					//textListener.textEmitted( temp+"\n");
					
				}
				
				
				
			}
			
		}
		if (clicked == save){
			if(textListener != null){
				
			textListener.textEmitted("File Save\n");
				
			}
		}
		
	}

	public void setWord(String counter) {
	    this.counter = String.valueOf(count);
	}
	
	public void setPanel (FormPanel panel) {
		pannel = panel;
	}
}
