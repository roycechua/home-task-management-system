package HomeDatabase;

import javax.swing.*;
import javax.swing.border.*;

import homedbbackup1.ParentMain;

//import java.util.*;
import java.awt.event.*;
import java.awt.*;

//sql
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LoginUI extends JFrame {
	private JPanel board;
	private JButton button1, button2, button3;
	private JTextField tf1;
	private JPasswordField pf1;
	private JLabel user, pass, nameofproj;
	private JPanel loginpanel;
	
	Connection conn = null;
	String dbURL = "jdbc:sqlserver://ROSE-LAPTOP\\RBCSQL;databaseName=HomeDatabase;";
	String sqluser = "tipqc1410950";
	String sqlpass = "chuaqc";
	char[] pass1;
	String username;
	String pass2;
	
	
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);	
		setUndecorated(true);
		
		board = new JPanel();
		board.setBounds(0, 0, 450, 300);
		board.setVisible(true);
		board.setLayout(null);
		
//		nameofproj = new JLabel("");
//		nameofproj.setIcon(new ImageIcon(LoginUI.class.getResource("/homedbimages/Untitled-1 copy.png")));
//		nameofproj.setVisible(true);
//		nameofproj.setBounds(60, 11, 340, 47);
//	    board.add(nameofproj);
			
		loginpanel = new JPanel();
		loginpanel.setBounds(40, 69, 364, 175);
		loginpanel.setBackground(new Color(0,0,0,65));
		board.add(loginpanel);
		loginpanel.setLayout(null);
		
		Font font1 = new Font("Open Sans", Font.BOLD, 14);
		user = new JLabel("Username: ");
		user.setForeground(Color.WHITE);
		user.setBounds(29, 17, 80, 14);
		loginpanel.add(user);
		user.setVisible(true);
		user.setFont(font1);
		
		pass = new JLabel("Password: ");
		pass.setForeground(Color.WHITE);
		pass.setBounds(29, 49, 80, 14);
		loginpanel.add(pass);
		pass.setVisible(true);
		pass.setFont(font1);
		
		tf1 = new JTextField();
		tf1.setBounds(119, 16, 212, 20);
		loginpanel.add(tf1);
		
		pf1 = new JPasswordField();
		pf1.setBounds(119, 48, 212, 20);
		loginpanel.add(pf1);
		
		button1 = new JButton("Login");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  if((tf1.getText().isEmpty())&&(pf1.getPassword().length==0)){
				  JOptionPane.showMessageDialog(null, "No data entered!","Empty fields",JOptionPane.INFORMATION_MESSAGE);
			  }
			  else if((tf1.getText().isEmpty()&&(pf1.getPassword().length>0))){
				  JOptionPane.showMessageDialog(null, "No username entered!","Empty fields",JOptionPane.INFORMATION_MESSAGE);
			  }
			  else if((!(tf1.getText().isEmpty())&&(pf1.getPassword().length==0))){
				  JOptionPane.showMessageDialog(null, "No password entered!","Empty fields",JOptionPane.INFORMATION_MESSAGE);
			  }
			  else{
				try{
				 int counter=0;	
				 
				 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				 conn = DriverManager.getConnection(dbURL,sqluser,sqlpass);
				  String SQL = "";
				  System.out.println("Successful Connection!");
				  Statement stmt = conn.createStatement();
				  SQL="SELECT username,password FROM useraccount";
			      ResultSet rs = stmt.executeQuery(SQL);
			      while(rs.next()){
			    	username=rs.getString("username");
			    	pass2=rs.getString("password");
			    	if(username.equals(tf1.getText())&&verify(pass2)){
			    		counter++;
			    	}
			      }
			      if(counter==1){
			    	  JOptionPane.showMessageDialog(null, "Login Successful!","Login Status",JOptionPane.INFORMATION_MESSAGE);
			    	  MainUI mu = new MainUI();
			    	  mu.setVisible(true);
			    	  String fname="";
			    	  SQL="SELECT firstname FROM useraccount WHERE username='"+tf1.getText()+"'";
			    	  rs = stmt.executeQuery(SQL);
			    	  if(rs.next()){
			    		  fname=rs.getString("firstname");
			    	  }
			    	  mu.uname=tf1.getText();
			    	  mu.lblPaul.setText(fname);
			    	  dispose();
			    	  
			      }
			      else{
			    	  JOptionPane.showMessageDialog(null, "No Record Found!","Login Status",JOptionPane.ERROR_MESSAGE);
			      }
				  stmt.close();
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
						e.printStackTrace();
					}
				}
			  } // end of try-catch statement
			}
		});
		button1.setBackground(Color.WHITE);
		button1.setBounds(50, 126, 89, 23);
		loginpanel.add(button1);
		button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button2 = new JButton("Don't have an account yet?");
		button2.setFont(new Font("Open Sans", Font.PLAIN, 12));
		button2.setForeground(Color.WHITE);
		button2.setBounds(154, 126, 186, 23);
		loginpanel.add(button2);
		button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button2.setVisible(true);
		button2.setContentAreaFilled(false);
		button2.setFocusTraversalKeysEnabled(false);
		button2.setBorderPainted(false);
		button2.setFocusable(false);
		button2.setFocusPainted(false);
			
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button2.setText("<html><u>Don't have an account yet?</u></html>");	
				button2.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button2.setText("Don't have an account yet?");	
				button2.setForeground(Color.white);
			}
			
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Registration reg = new Registration();
			reg.setVisible(true);
            dispose();
		}});
		button1.setVisible(true);
		pf1.setVisible(true);
		tf1.setVisible(true);
		
				
				button3 = new JButton("Exit");
				button3.setBackground(Color.WHITE);
				button3.setVisible(true);
				button3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				button3.setBounds(179, 255, 89, 23);
				board.add(button3);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(LoginUI.class.getResource("/homedbimages/Hometask Management System Background.jpg")));
		lblNewLabel.setBounds(0, 0, 450, 300);
		board.add(lblNewLabel);
		
		getContentPane().add(board);
		setVisible(true);
	}
	
	protected boolean verify(String password){
		boolean isCorrect=false;
		pass1=pf1.getPassword();
		password=pass2;
		isCorrect=Arrays.equals (pass1, password.toCharArray());
		return isCorrect; 
	}
	
	public static void main(String[] args) {
		LoginUI loginframe = new LoginUI();
	
	}
	
	
}
