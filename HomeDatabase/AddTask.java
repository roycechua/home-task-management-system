package HomeDatabase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;

public class AddTask extends JFrame {

	private JPanel contentPane;
	private JTextField txtWork;
	private JTextField textField;
	private JTextField txtHhh;
	private JTextField txtMmm;
	private JTextField txtSss;

	Connection conn = null;
	String dbURL = "jdbc:sqlserver://ROSE-LAPTOP\\RBCSQL;databaseName=HomeDatabase;";
	String sqluser = "tipqc1410950";
	String sqlpass = "chuaqc";
    String username;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTask frame = new AddTask();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddTask() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnX = new JButton("X");
		btnX.setContentAreaFilled(false);
		btnX.setBackground(Color.GRAY);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				txtWork.setText("");
				textField.setText("");
				txtHhh.setText("");
				txtMmm.setText("");
				txtSss.setText("");
			}
		});
		
		JLabel lblAdd = new JLabel("Add Task");
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setOpaque(true);
		lblAdd.setForeground(Color.BLACK);
		lblAdd.setFont(new Font("Pristina", Font.BOLD, 35));
		lblAdd.setBackground(new Color(0, 0, 0, 1));
		lblAdd.setBounds(0, 22, 206, 85);
		contentPane.add(lblAdd);
		btnX.setForeground(Color.RED);
		btnX.setFont(new Font("Vineta BT", Font.PLAIN, 15));
		btnX.setBounds(370, 11, 55, 41);
		contentPane.add(btnX);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 89, 415, 375);
		panel.setBackground(new Color(0,0,0,64));
		contentPane.add(panel);
		panel.setLayout(null);
		
		// panel for inputting work name or task name
		JLabel lblNewLabel_1 = new JLabel("  Work/Task:");
		lblNewLabel_1.setForeground(new Color(204, 255, 255));
		lblNewLabel_1.setBackground(new Color(0,0,0,160));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 22, 98, 39);
		panel.add(lblNewLabel_1);
		
		txtWork = new JTextField();
		txtWork.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		txtWork.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		txtWork.setForeground(Color.BLACK);
		txtWork.setBackground(Color.WHITE);
		txtWork.setBounds(128, 22, 253, 39);
		panel.add(txtWork);
		txtWork.setColumns(10);
		// end of panel for inputting work name or task name
		
		// panel for inputting the level of importance
		JLabel lblLevelOfImportance = new JLabel("  Level of Importance:");
		lblLevelOfImportance.setOpaque(true);
		lblLevelOfImportance.setForeground(new Color(204, 255, 255));
		lblLevelOfImportance.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblLevelOfImportance.setBackground(new Color(0, 0, 0, 160));
		lblLevelOfImportance.setBounds(20, 72, 172, 39);
		panel.add(lblLevelOfImportance);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 - Urgent", "2 - Very Important", "3 - Important", "4 - Slightly Important", "5 - Not that Important", "6 - Just want to do"}));
		comboBox.setBounds(208, 72, 161, 39);
		panel.add(comboBox);
		// end of panel for inputting the level of importance
		
		// panel for inputting the desired performer or doer of the task
		JLabel lblPerformer = new JLabel("  Performer:");
		lblPerformer.setOpaque(true);
		lblPerformer.setForeground(new Color(204, 255, 255));
		lblPerformer.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblPerformer.setBackground(new Color(0, 0, 0, 160));
		lblPerformer.setBounds(20, 124, 98, 39);
		panel.add(lblPerformer);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(128, 124, 253, 39);
		panel.add(textField);
		// end of panel for inputting the performer
		
		// panel for inputting due time
		JLabel lblTime = new JLabel("  Due Time:");
		lblTime.setOpaque(true);
		lblTime.setForeground(new Color(204, 255, 255));
		lblTime.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblTime.setBackground(new Color(0, 0, 0, 160));
		lblTime.setBounds(20, 224, 90, 39);
		panel.add(lblTime);
		
		JLabel lblDate = new JLabel("  Due Date:");
		lblDate.setOpaque(true);
		lblDate.setForeground(new Color(204, 255, 255));
		lblDate.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblDate.setBackground(new Color(0, 0, 0, 160));
		lblDate.setBounds(20, 174, 90, 39);
		panel.add(lblDate);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(120, 174, 98, 39);
		panel.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(228, 174, 45, 39);
		panel.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2017", "2018", "2019", "2020"}));
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(283, 174, 98, 39);
		panel.add(comboBox_3);
		
		txtHhh = new JTextField();
		txtHhh.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		txtHhh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtHhh.setText("");
				txtHhh.setForeground(Color.BLACK);
			}
		});
		txtHhh.setHorizontalAlignment(SwingConstants.CENTER);
		txtHhh.setText("hh");
		txtHhh.setForeground(Color.GRAY);
		txtHhh.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		txtHhh.setColumns(10);
		txtHhh.setBackground(Color.WHITE);
		txtHhh.setBounds(120, 224, 45, 39);
		panel.add(txtHhh);
		
		txtMmm = new JTextField();
		txtMmm.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		txtMmm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtMmm.setText("");
				txtMmm.setForeground(Color.BLACK);
			}
		});
		txtMmm.setText("mm");
		txtMmm.setHorizontalAlignment(SwingConstants.CENTER);
		txtMmm.setForeground(Color.GRAY);
		txtMmm.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		txtMmm.setColumns(10);
		txtMmm.setBackground(Color.WHITE);
		txtMmm.setBounds(195, 224, 45, 39);
		panel.add(txtMmm);
		
		JLabel label = new JLabel(":");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setForeground(new Color(204, 255, 255));
		label.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label.setBackground(new Color(0, 0, 0, 160));
		label.setBounds(171, 224, 14, 39);
		panel.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(204, 255, 255));
		label_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_1.setBackground(new Color(0, 0, 0, 160));
		label_1.setBounds(249, 224, 14, 39);
		panel.add(label_1);
		
		txtSss = new JTextField();
		txtSss.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		txtSss.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtSss.setText("");
				txtSss.setForeground(Color.BLACK);
			}
		});
		txtSss.setText("ss");
		txtSss.setHorizontalAlignment(SwingConstants.CENTER);
		txtSss.setForeground(Color.GRAY);
		txtSss.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		txtSss.setColumns(10);
		txtSss.setBackground(Color.WHITE);
		txtSss.setBounds(273, 224, 45, 39);
		panel.add(txtSss);
		// end of panel for due date
		
		// -------------------------- Buttons & Action Listeners -----------------------//
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtWork.setText("");
				textField.setText("");
				txtHhh.setText("");
				txtMmm.setText("");
				txtSss.setText("");
			}
		});
		btnReset.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		btnReset.setBounds(214, 321, 78, 29);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		panel.add(btnReset);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pick = JOptionPane.showConfirmDialog(null, "The following details are the ones supposed to be added.", null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (pick == JOptionPane.OK_OPTION)
				try{				 
					 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					 conn = DriverManager.getConnection(dbURL,sqluser,sqlpass);
					 
					 String SQL = "";
					 System.out.println("Add task connecting to HomeDatabase.");
					 
					 String task="",taskissuedto="",duemonth="",dueday="",dueyear="",duetimehr=""
							  ,duetimemin="",duetimesec="",pfirstname = "",plastname="",taskperformer="";
					 int importance = 0;
					  
					 task=txtWork.getText();
					 taskissuedto=textField.getText();
					  if(comboBox.getSelectedIndex()==0){
						  importance=1;
					  }
					  else if(comboBox.getSelectedIndex()==1){
						  importance=2;
					  }
					  else if(comboBox.getSelectedIndex()==2){
						  importance=3;
					  }
					  else if(comboBox.getSelectedIndex()==3){
						  importance=4;
					  }
					  else if(comboBox.getSelectedIndex()==4){
						  importance=5;
					  }
					  else if(comboBox.getSelectedIndex()==5){
						  importance=6;
					  }
					  
					  if(comboBox_2.getSelectedItem()=="January"){
						  duemonth = "01";
					  }
					  else if(comboBox_2.getSelectedItem()=="February"){
						  duemonth = "02";
					  }
					  else if(comboBox_2.getSelectedItem()=="March"){
						  duemonth = "03";
					  }
					  else if(comboBox_2.getSelectedItem()=="April"){
						  duemonth = "04";
					  }
					  else if(comboBox_2.getSelectedItem()=="May"){
						  duemonth = "05";
					  }
					  else if(comboBox_2.getSelectedItem()=="June"){
						  duemonth = "06";
					  }
					  else if(comboBox_2.getSelectedItem()=="July"){
						  duemonth = "07";
					  }
					  else if(comboBox_2.getSelectedItem()=="August"){
						  duemonth = "08";
					  }
					  else if(comboBox_2.getSelectedItem()=="September"){
						  duemonth = "09";
					  }
					  else if(comboBox_2.getSelectedItem()=="October"){
						  duemonth = "10";
					  }
					  else if(comboBox_2.getSelectedItem()=="November"){
						  duemonth = "11";
					  }
					  else if(comboBox_2.getSelectedItem()=="December"){
						  duemonth = "12";
					  }
					  dueday=comboBox_1.getSelectedItem().toString();
					  dueyear=comboBox_3.getSelectedItem().toString();
					  
					  duetimehr=txtHhh.getText();
					  duetimemin=txtMmm.getText();
					  duetimesec=txtSss.getText();
					  // query to retrieve who issued the task
					  Statement stmt = conn.createStatement();
					  SQL="SELECT firstname,lastname FROM useraccount WHERE username='"+username+"'";
					  ResultSet rs = stmt.executeQuery(SQL);
					  if(rs.next()){
						  pfirstname=rs.getString("firstname");
						  plastname=rs.getString("lastname");
					  }
					  
					  taskperformer=pfirstname.concat(" "+plastname);
					  // Insert query to add task
					  SQL="INSERT INTO tasks(task_id,task_description,task_importance,task_issuedby,task_issuedto,task_issued,task_duedate)"
							  +" VALUES(2,'"+task+"',"+importance+",'"+taskperformer+"','"+taskissuedto+"',GETDATE(),'"+duemonth+"-"+dueday+"-"+dueyear+" "+duetimehr+":"+duetimemin+":"+duetimesec+"')";
				      stmt.executeUpdate(SQL);
				     System.out.println("Task Addition Successful!");
				     JOptionPane.showMessageDialog(null, "Your Tasks has Increased!");
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				} catch (InstantiationException e) { // class.forname	
					e.printStackTrace();
				} catch (IllegalAccessException e) { // class.forname
					e.printStackTrace();
				} catch (SQLException e) { // drivermanager
					e.printStackTrace();
				}finally{
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			  } // end of try-catch statement      
				     
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		btnAdd.setBackground(Color.BLACK);
		btnAdd.setBounds(303, 321, 78, 29);
		panel.add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Paul\\g.jpg"));
		lblNewLabel.setBounds(0, 0, 435, 515);
		contentPane.add(lblNewLabel);
	}
}
