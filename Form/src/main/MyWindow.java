package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame {
	private static final long serialVersionUID = 5158798004530345196L;
	
	private JLabel heading;
	private Font font = new Font("", Font.BOLD, 30);
	private JPanel mainPanel;
	private JLabel nameLabel, passwordLabel;
	private JTextField nameTextField;
	private JPasswordField passwordField;
	private JButton b1, b2;
	
	
// this methods is used for creating a new window	
	public MyWindow() {
		super.setTitle("Form");
		super.setSize(500, 600);
		super.setLocation(200, 50);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close Program on clicking close
		this.createGUI();
		super.setVisible(true);
	}

// this methods create the GUI	
	public void createGUI() {
		this.setLayout(new BorderLayout());
		heading = new JLabel("My First Form");
		heading.setHorizontalAlignment(JLabel.CENTER); // align JLabel to center
		heading.setFont(font);
		
		this.add(heading, BorderLayout.NORTH);
		
		//working with JPanel
		mainPanel = new JPanel();
		//setting layout to Grid Layout
		mainPanel.setLayout(new GridLayout(3, 2));
		
		nameLabel = new JLabel("Enter Name: ");
		nameLabel.setFont(font);
		
		passwordLabel = new JLabel("Enter Password: ");
		passwordLabel.setFont(font);
		
		nameTextField = new JTextField();
		nameTextField.setFont(font);
		
		passwordField = new JPasswordField();
		passwordField.setFont(font);
		
		b1 = new JButton("Form Submit");
		b1.setFont(font);
		
		b2 = new JButton("Reset");
		b2.setFont(font);
		
		//adding controls to JPanel
		mainPanel.add(nameLabel);
		mainPanel.add(nameTextField);
		mainPanel.add(passwordLabel);
		mainPanel.add(passwordField);
		mainPanel.add(b1);
		mainPanel.add(b2);
		
		//adding JPanel to JFrame.CENTER
		this.add(mainPanel, BorderLayout.CENTER);
		
		
		//adding button controls
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				passwordField.setText("");				
			}
		});
	}
	

}
