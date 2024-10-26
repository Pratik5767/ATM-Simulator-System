package Bank.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpTwo extends JFrame implements ActionListener {

	JTextField panTextField, aadhaarTextField;
	JComboBox<String> religionField, categoryField, incomeField, qualificationField, occupationField;
	JRadioButton ysenior, nsenior, yexisting, nexisting;
	JButton next;
	String formNo;

	SignUpTwo(String formNo) {
		this.formNo = formNo;
		setLayout(null);

		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		setBounds(350, 10, 850, 800);
		getContentPane().setBackground(Color.WHITE);

		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(270, 80, 500, 40);
		add(additionalDetails);

		JLabel religion = new JLabel("Religion:");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 400, 30);
		add(religion);

		String[] religionarr = {"Hindhu", "Muslim", "Sikh", "Christian", "other"};
		religionField = new JComboBox<String>(religionarr);
		religionField.setBackground(Color.WHITE);
		religionField.setFont(new Font("Raleway", Font.BOLD, 14));
		religionField.setBounds(300, 140, 400, 30);
		add(religionField);

		JLabel category = new JLabel("Category:");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 400, 30);
		add(category);

		String[] categoryarr = {"General", "OBC", "SC", "ST", "other"};
		categoryField = new JComboBox<String>(categoryarr);
		categoryField.setBackground(Color.WHITE);
		categoryField.setFont(new Font("Raleway", Font.BOLD, 14));
		categoryField.setBounds(300, 190, 400, 30);
		add(categoryField);

		JLabel income = new JLabel("Income:");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 400, 30);
		add(income);
		
		String[] incomearr = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"};
		incomeField = new JComboBox<String>(incomearr);
		incomeField.setBackground(Color.WHITE);
		incomeField.setFont(new Font("Raleway", Font.BOLD, 14));
		incomeField.setBounds(300, 240, 400, 30);
		add(incomeField);

		JLabel education = new JLabel("Educational");
		education.setFont(new Font("Raleway", Font.BOLD, 20));
		education.setBounds(100, 290, 400, 30);
		add(education);

		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 500, 30);
		add(qualification);

		String[] educationarr = {"Non-Graduate", "Graduate", "Post Graduation", "Doctrate", "other"};
		qualificationField = new JComboBox<String>(educationarr);
		qualificationField.setBackground(Color.WHITE);
		qualificationField.setFont(new Font("Raleway", Font.BOLD, 14));
		qualificationField.setBounds(300, 315, 400, 30);
		add(qualificationField);

		JLabel occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 500, 30);
		add(occupation);

		String[] occupationarr = {"Salaried", "Self Employed", "Bussiness", "Student", "Retired", "other"};
		occupationField = new JComboBox<String>(occupationarr);
		occupationField.setBackground(Color.WHITE);
		occupationField.setFont(new Font("Raleway", Font.BOLD, 14));
		occupationField.setBounds(300, 390, 400, 30);
		add(occupationField);

		JLabel panNo = new JLabel("Pan No:");
		panNo.setFont(new Font("Raleway", Font.BOLD, 20));
		panNo.setBounds(100, 440, 500, 30);
		add(panNo);

		panTextField = new JTextField();
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		panTextField.setBounds(300, 440, 400, 30);
		add(panTextField);

		JLabel aadhaar = new JLabel("Aadhaar No:");
		aadhaar.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhaar.setBounds(100, 490, 500, 30);
		add(aadhaar);

		aadhaarTextField = new JTextField();
		aadhaarTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhaarTextField.setBounds(300, 490, 400, 30);
		add(aadhaarTextField);

		JLabel citizen = new JLabel("Senior Citizon:");
		citizen.setFont(new Font("Raleway", Font.BOLD, 20));
		citizen.setBounds(100, 540, 500, 30);
		add(citizen);

		ysenior = new JRadioButton("Yes");
		ysenior.setBackground(Color.WHITE);
		ysenior.setBounds(300, 540, 100, 30);
		add(ysenior);

		nsenior = new JRadioButton("No");
		nsenior.setBackground(Color.WHITE);
		nsenior.setBounds(465, 540, 100, 30);
		add(nsenior);

		ButtonGroup isSenior = new ButtonGroup();
		isSenior.add(ysenior);
		isSenior.add(nsenior);

		JLabel existing = new JLabel("Existing account:");
		existing.setFont(new Font("Raleway", Font.BOLD, 20));
		existing.setBounds(100, 590, 500, 30);
		add(existing);

		yexisting = new JRadioButton("Yes");
		yexisting.setBackground(Color.WHITE);
		yexisting.setBounds(300, 590, 100, 30);
		add(yexisting);

		nexisting = new JRadioButton("No");
		nexisting.setBackground(Color.WHITE);
		nexisting.setBounds(465, 590, 100, 30);
		add(nexisting);

		ButtonGroup existingAccount = new ButtonGroup();
		existingAccount.add(yexisting);
		existingAccount.add(nexisting);

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
		String religion = (String)religionField.getSelectedItem();
		String category = (String)categoryField.getSelectedItem();
		String income = (String)incomeField.getSelectedItem();
		String education = (String)qualificationField.getSelectedItem();
		String occupation = (String)occupationField.getSelectedItem();
		String pan = panTextField.getText();
		String aadhaar = aadhaarTextField.getText();
		
		String citizen = null;
		if (ysenior.isSelected()) {
			citizen = "Yes";
		} else if (nsenior.isSelected()) {
			citizen = "No";
		}
		
		String existingaccount = null;
		if (yexisting.isSelected()) {
			existingaccount = "Yes";
		} else if (nexisting.isSelected()) {
			existingaccount = "No";
		}
		
		try {
			// validation
			if (pan.equals("")) {
				JOptionPane.showMessageDialog(null, "Pan required");
			} else {
				MyConnection connection = new MyConnection();
				String query = "insert into signuptwo values('" + formNo + "', '" + religion + "', '" + category + "', '"
						+ income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhaar + "', '"
						+ citizen + "', '" + existingaccount + "')";
				connection.statement.executeUpdate(query);
				setVisible(false);
				//new SignUpThree(formNo).setVisible(true);
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {

		new SignUpTwo("");
	}
}