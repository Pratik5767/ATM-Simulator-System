package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

	long ran;
	JTextField nameTextField, fatherNameTextField, emailTextField, addressTextField, cityTextField, stateTextField,
			pinTextField;
	JDateChooser dateChooser;
	JRadioButton male, female, other, married, unmarried, other2;
	JButton next;

	SignUpOne() {
		setLayout(null);
		Random random = new Random();

		setSize(850, 800);
		setLocation(350, 10);
		getContentPane().setBackground(Color.WHITE);
		ran = Math.abs((random.nextLong() % 9000L) + 1000L);

		JLabel formNo = new JLabel("APPLICATION FORM NO. " + ran);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);

		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(270, 80, 500, 40);
		add(personalDetails);

		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 400, 30);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);

		JLabel fatherName = new JLabel("Father Name:");
		fatherName.setFont(new Font("Raleway", Font.BOLD, 20));
		fatherName.setBounds(100, 190, 400, 30);
		add(fatherName);

		fatherNameTextField = new JTextField();
		fatherNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fatherNameTextField.setBounds(300, 190, 400, 30);
		add(fatherNameTextField);

		JLabel DOB = new JLabel("Date of Birth:");
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		DOB.setBounds(100, 240, 400, 30);
		add(DOB);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setForeground(Color.BLACK);
		add(dateChooser);

		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 400, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBackground(Color.WHITE);
		male.setBounds(300, 290, 70, 30);
		add(male);

		female = new JRadioButton("Female");
		female.setBackground(Color.WHITE);
		female.setBounds(465, 290, 70, 30);
		add(female);

		other = new JRadioButton("Other");
		other.setBackground(Color.WHITE);
		other.setBounds(640, 290, 70, 30);
		add(other);

		ButtonGroup selectGender = new ButtonGroup();
		selectGender.add(male);
		selectGender.add(female);
		selectGender.add(other);

		JLabel email = new JLabel("Email:");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 500, 30);
		add(email);

		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300, 340, 400, 30);
		add(emailTextField);

		JLabel maritialStatus = new JLabel("Maritial Status:");
		maritialStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		maritialStatus.setBounds(100, 390, 500, 30);
		add(maritialStatus);

		married = new JRadioButton("Married");
		married.setBackground(Color.WHITE);
		married.setBounds(300, 390, 70, 30);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBackground(Color.WHITE);
		unmarried.setBounds(465, 390, 100, 30);
		add(unmarried);

		other2 = new JRadioButton("Other");
		other2.setBackground(Color.WHITE);
		other2.setBounds(640, 390, 70, 30);
		add(other2);

		ButtonGroup selectmaratirl = new ButtonGroup();
		selectmaratirl.add(married);
		selectmaratirl.add(unmarried);
		selectmaratirl.add(other2);

		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 500, 30);
		add(address);

		addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);

		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 500, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);

		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 500, 30);
		add(state);

		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300, 540, 400, 30);
		add(stateTextField);

		JLabel pinCode = new JLabel("pincode:");
		pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
		pinCode.setBounds(100, 590, 500, 30);
		add(pinCode);

		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pinTextField.setBounds(300, 590, 400, 30);
		add(pinTextField);

		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formNo = "" + ran;
		String name = nameTextField.getText();
		String fatherName = fatherNameTextField.getText();
		String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if (female.isSelected()) {
			gender = "Female";
		} else if (other.isSelected()) {
			gender = "Other";
		}

		String email = emailTextField.getText();

		String mariatialStatus = null;
		if (married.isSelected()) {
			mariatialStatus = "Married";
		} else if (unmarried.isSelected()) {
			mariatialStatus = "UnMarried";
		} else if (other2.isSelected()) {
			mariatialStatus = "Other";
		}

		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pinCode = pinTextField.getText();

		try {
			// validation
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name required");
			} else {
				MyConnection connection = new MyConnection();
				String query = "insert into signup values('" + formNo + "', '" + name + "', '" + fatherName + "', '"
						+ DOB + "', '" + gender + "', '" + email + "', '" + mariatialStatus + "', '" + address + "', '"
						+ city + "', '" + state + "', '" + pinCode + "')";
				connection.statement.executeUpdate(query);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {

		new SignUpOne();
	}
}
