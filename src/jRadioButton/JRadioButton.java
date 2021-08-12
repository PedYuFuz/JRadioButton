package jRadioButton;

import javax.swing.JFrame;

public class RadioButton extends JFrame{
	JRadioButton rb = new JRadioButton("Male");
	
	
	public RadioButton() {
		//JRadioButton
		
		
		//Window
		setTitle("JRadioButton");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//Set Visible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRadioButton();
	}
}
