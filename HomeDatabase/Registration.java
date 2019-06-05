package HomeDatabase;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.awt.EventQueue;
import java.sql.*;


import javax.swing.border.EmptyBorder;


public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUID;
	private JTextField textFieldFN;
	private JTextField textFieldMN;
	private JTextField textFieldLN;
	private JTextField textFieldAge;
	private JTextField textFieldCNum;
	private JTextField textFieldAdd;
	private JTextField textFieldEAdd;
	private JTextField textFieldOccup;
	private JTextField textFieldUser;
	private JPasswordField passwordField;
	private ButtonGroup group;
	
	Connection conn = null;
	String dbURL = "jdbc:sqlserver://ROSE-LAPTOP\\RBCSQL;databaseName=HomeDatabase;";
	String sqluser = "tipqc1410950";
	String sqlpass = "chuaqc";

	// SQL variables
	int accounttype,userid,age,gendernum;
	long contactno;
	String firstname="",middlename="",lastname="",emailaddress=""
			,gender="",address="",occupation="",username="",password="";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration regframe = new Registration();
					regframe.setVisible(true);
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 536, 537);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(211, 5, 0, 0);
		panel.add(label);
		
		Font F = new Font("Open Sans",Font.BOLD,13);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setFont(new Font("Open Sans",Font.BOLD,15));
		lblRegistration.setForeground(Color.WHITE);
		lblRegistration.setBounds(223, 5, 133, 44);
		panel.add(lblRegistration);
		
		JLabel Lb = new JLabel("First Name:");
		Lb.setFont(F);
		Lb.setForeground(Color.WHITE);
		Lb.setBounds(20, 88, 88, 31);
		panel.add(Lb);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setFont(F);
		lblMiddleName.setForeground(Color.WHITE);
		lblMiddleName.setBounds(20, 119, 105, 31);
		panel.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(F);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBounds(20, 150, 74, 31);
		panel.add(lblLastName);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(F);
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setBounds(20, 237, 125, 31);
		panel.add(lblContactNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(F);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(20, 279, 74, 31);
		panel.add(lblAddress);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setFont(F);
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setBounds(20, 310, 125, 31);
		panel.add(lblEmailAddress);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setFont(F);
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setBounds(20, 53, 74, 31);
		panel.add(lblUserId);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(F);
		lblAge.setForeground(Color.WHITE);
		lblAge.setBounds(20, 177, 74, 31);
		panel.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(F);
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(20, 207, 74, 31);
		panel.add(lblGender);
		
		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setFont(F);
		lblOccupation.setForeground(Color.WHITE);
		lblOccupation.setBounds(20, 352, 105, 31);
		panel.add(lblOccupation);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(F);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(290, 53, 74, 31);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(F);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(290, 88, 74, 31);
		panel.add(lblPassword);
		
		textFieldUID = new JTextField();
		textFieldUID.setBounds(140, 59, 140, 20);
		panel.add(textFieldUID);
		textFieldUID.setColumns(10);
		
		textFieldFN = new JTextField();
		textFieldFN.setColumns(10);
		textFieldFN.setBounds(140, 94, 140, 20);
		panel.add(textFieldFN);
		
		textFieldMN = new JTextField();
		textFieldMN.setColumns(10);
		textFieldMN.setBounds(140, 125, 140, 20);
		panel.add(textFieldMN);
		
		textFieldLN = new JTextField();
		textFieldLN.setColumns(10);
		textFieldLN.setBounds(140, 156, 140, 20);
		panel.add(textFieldLN);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(140, 183, 37, 20);
		panel.add(textFieldAge);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Open Sans", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE"}));
		comboBox.setBounds(140, 212, 88, 20);
		panel.add(comboBox);
		
		textFieldCNum = new JTextField();
		textFieldCNum.setColumns(10);
		textFieldCNum.setBounds(140, 243, 140, 20);
		panel.add(textFieldCNum);
		
		textFieldAdd = new JTextField();
		textFieldAdd.setColumns(10);
		textFieldAdd.setBounds(140, 279, 140, 20);
		panel.add(textFieldAdd);
		
		textFieldEAdd = new JTextField();
		textFieldEAdd.setColumns(10);
		textFieldEAdd.setBounds(140, 316, 140, 20);
		panel.add(textFieldEAdd);
		
		textFieldOccup = new JTextField();
		textFieldOccup.setBounds(140, 358, 140, 20);
		panel.add(textFieldOccup);
		textFieldOccup.setColumns(10);
		
		textFieldUser = new JTextField();
		textFieldUser.setColumns(10);
		textFieldUser.setBounds(369, 59, 140, 20);
		panel.add(textFieldUser);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(369, 94, 140, 20);
		panel.add(passwordField);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnX.setBounds(462, 5, 48, 31);
		panel.add(btnX);
		
		JButton button = new JButton("_");
		button.setBounds(418, 5, 41, 31);
		panel.add(button);
		
		JRadioButton rdbtnNewParent = new JRadioButton("Parent");
		rdbtnNewParent.setBounds(383, 139, 109, 23);
		rdbtnNewParent.setVisible(true);
		rdbtnNewParent.setFont(F);
		rdbtnNewParent.setBackground(new Color(0,0,0,0));
		rdbtnNewParent.setForeground(Color.WHITE);
		panel.add(rdbtnNewParent);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(383, 182, 109, 23);
		rdbtnChild.setFont(F);
		rdbtnChild.setForeground(Color.WHITE);
		rdbtnChild.setBackground(new Color(0,0,0,0));
		rdbtnChild.setVisible(true);
		panel.add(rdbtnChild);
		
		JRadioButton rdbtnIndividual = new JRadioButton("Individual");
		rdbtnIndividual.setBounds(383, 228, 109, 23);
		rdbtnIndividual.setFont(F);
		rdbtnIndividual.setForeground(Color.WHITE);
		rdbtnIndividual.setBackground(new Color(0,0,0,0));
		rdbtnIndividual.setVisible(true);
		panel.add(rdbtnIndividual);
		
		group = new ButtonGroup();
		group.add(rdbtnIndividual);
		group.add(rdbtnChild);
		group.add(rdbtnNewParent);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 462, 536, 75);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					conn = DriverManager.getConnection(dbURL,sqluser,sqlpass);
						System.out.println("Successful Connection!");
						userid=Integer.parseInt(textFieldUID.getText());
						contactno=Long.parseLong(textFieldCNum.getText());
						age=Integer.parseInt(textFieldAge.getText());
						gender=comboBox.getSelectedItem().toString();
						if(gender.equalsIgnoreCase("Male")){
							gendernum=1;
						}
						else if(gender.equalsIgnoreCase("Female")){
							gendernum=2;
						}
						firstname =textFieldFN.getText();
						middlename = textFieldMN.getText();
						lastname = textFieldLN.getText();
						emailaddress= textFieldEAdd.getText();
						address = textFieldAdd.getText();
						occupation = textFieldOccup.getText();
						username = textFieldUser.getText();
						password = passwordField.getText();
						if(rdbtnIndividual.isSelected()){
							accounttype=1;
						}
						else if(rdbtnNewParent.isSelected()){
							accounttype=2;
						}
						else if(rdbtnChild.isSelected()){
							accounttype=3;
						}
						Statement stmt = conn.createStatement();
						String SQL="INSERT INTO useraccount(user_id,username,password,firstname,middlename,lastname,contactnumber,emailaddress,address,age,gender,occupation,accounttype) "
								+"VALUES ("+userid+",'"+username+"','"+password+"','"+firstname+"','"+middlename+"','"+lastname+"',"+contactno+",'"+emailaddress+"','"+address+"',"+age+","+gendernum+",'"+occupation+"',"+accounttype+")";
						stmt.executeUpdate(SQL);
						System.out.print("Creation Sucessful!");
					}catch(ClassNotFoundException e){
						e.printStackTrace();
					} catch (InstantiationException e) { // class.forname
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) { // class.forname
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) { // drivermanager
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						try{
							if (conn != null && !conn.isClosed()) {
								conn.close();
		                }
						} catch (SQLException ex) {
							ex.printStackTrace();
						}
					}
				}
			
		});
		btnNewButton.setBounds(71, 41, 103, 23);
		panel_1.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUI loginframe = new LoginUI();
				dispose();
			}
		});
		btnCancel.setBounds(371, 41, 103, 23);
		panel_1.add(btnCancel);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(231, 11, 89, 23);
		panel_1.add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(0, 0, 536, 116);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Registration.class.getResource("/homedbimages/Hometask Management System Background 2.jpg")));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUID.setText(null);  textFieldAdd.setText(null);  textFieldEAdd.setText(null);
				textFieldFN.setText(null);	 textFieldOccup.setText(null);
				textFieldMN.setText(null);	 textFieldUser.setText(null);
				textFieldLN.setText(null);   passwordField.setText(null);
				textFieldAge.setText(null);
				textFieldCNum.setText(null);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registration.class.getResource("/homedbimages/Hometask Management System Background 2.jpg")));
		lblNewLabel.setBounds(0, 0, 536, 537);
		panel.add(lblNewLabel);
	}
}
