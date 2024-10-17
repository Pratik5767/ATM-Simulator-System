package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JTextField cardTextField;
	JPasswordField pinTextField;
	JButton login, clear, signUp;

	Login() {
		setLayout(null);
		setTitle("AUTOMATED TELLER MACHINE");
		
		setSize(800, 480);
		setLocation(350, 200);
		getContentPane().setBackground(Color.WHITE);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("./icons/logo.jpg"));
		Image scaleImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon newImg = new ImageIcon(scaleImg);
		JLabel image = new JLabel(newImg);
		image.setBounds(70, 10, 100, 100);
		add(image);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 36));
		text.setBounds(200, 40, 500, 40);
		add(text);
		
		JLabel cardNo = new JLabel("Card No:");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 22));
		cardNo.setBounds(120, 150, 150, 30);
		add(cardNo);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN: ");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
		add(pinTextField);
		
		//Buttons
		login = new JButton("Login");
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.setBounds(300, 300, 100, 30);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("Clear");
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.setBounds(430, 300, 100, 30);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("Sign Up");
		signUp.setBackground(Color.BLACK);
		signUp.setForeground(Color.WHITE);
		signUp.setBounds(300, 350, 230, 30);
		signUp.addActionListener(this);
		add(signUp);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		} else if (e.getSource() == signUp) {
			setVisible(false);
			new SignUpOne().setVisible(true);
			new SignUpOne().setVisible(true);
		} else if (e.getSource() == login) {
			setVisible(false);
		}
 	}
	
	public static void main(String[] args) {
		
		new Login(); 
	}

}
