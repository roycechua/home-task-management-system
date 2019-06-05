package HomeDatabase;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	JLabel lblPaul = new JLabel();
	final JPanel panel_17, panel_20;
	JLabel lblTime;
	JLabel lblMidDayIndicator;
	
	Calendar calendar = new GregorianCalendar();
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	private JTextField textField_1;
	
	String uname="";
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainUI() {
		Timer time = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				SimpleDateFormat DForm = new SimpleDateFormat("HH:mm");
				lblTime.setText(DForm.format(new java.util.Date()));
			}
		});
		time.start();
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1377, 770);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JPanel panel_1 = new JPanel(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 221, 76);
		contentPane.add(panel_1);
		
		JLabel lblName = new JLabel("Home Database");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblName.setBounds(0, 0, 221, 76);
		panel_1.add(lblName);
		
		JPanel panel_8 = new JPanel(null);
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		panel_8.setBackground(new Color(255, 255, 255));
		panel_8.setBounds(230, 11, 1126, 76);
		contentPane.add(panel_8);
		// close button
		JButton btnX = new JButton("X");
		btnX.setContentAreaFilled(false);
		btnX.setBounds(1063, 11, 53, 39);
		panel_8.add(btnX);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnProfile.setContentAreaFilled(false);
		btnProfile.setBounds(976, 11, 77, 39);
		panel_8.add(btnProfile);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel_2 = new JPanel(null);
		panel_2.setBackground(new Color(51, 51, 51));
		panel_2.setBounds(10, 85, 221, 674);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("PANELS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(20, 11, 127, 36);
		panel_2.add(lblNewLabel);
		
		JPanel panel = new JPanel(null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(230, 231, 1126, 528);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		
		final JPanel pDashboard = new JPanel();
		panel.add(pDashboard, "name_1264822486560");
		
		final JPanel pBiodata = new JPanel();
		panel.add(pBiodata, "name_1341992695384");
		
		final JPanel pCalendar = new JPanel();
		panel.add(pCalendar, "name_1359223424042");
		
		final JPanel pTask_List = new JPanel(null);
		pTask_List.setBackground(Color.WHITE);
		panel.add(pTask_List, "name_3359034458418");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(153, 153, 153), new Color(0, 51, 0), null, null));
		scrollPane.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		scrollPane.setBounds(87, 107, 949, 322);
		pTask_List.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		/*table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"", "Task", "Category", "Site", "Assignee", "Date", "Time"
			}
		));
		*/
		table.setBackground(Color.LIGHT_GRAY);
		final JPanel panel_3 = new JPanel((LayoutManager) null);
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_3.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(new Color(51, 51, 51));
			}
		});
		panel_3.setBackground(new Color(51, 51, 51));
		panel_3.setBounds(0, 46, 221, 36);
		panel_2.add(panel_3);
		
		JButton btnNewButton = new JButton("Dashboard         ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_3.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(new Color(51, 51, 51));
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(0, 0, 222, 36);
		panel_3.add(btnNewButton);
		btnNewButton.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		
		
		final JPanel panel_9 = new JPanel((LayoutManager) null);
		panel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_9.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_9.setBackground(new Color(51, 51, 51));
			}
		});
		panel_9.setBackground(new Color(51, 51, 51));
		panel_9.setBounds(0, 82, 221, 36);
		panel_2.add(panel_9);
		
		JButton btnInformation = new JButton("Biodata              ");
		btnInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_9.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_9.setBackground(new Color(51, 51, 51));
			}
		});
		btnInformation.setForeground(Color.WHITE);
		btnInformation.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnInformation.setFocusPainted(false);
		btnInformation.setContentAreaFilled(false);
		btnInformation.setBorderPainted(false);
		btnInformation.setBounds(0, 0, 222, 36);
		panel_9.add(btnInformation);
		
		final JPanel panel_10 = new JPanel((LayoutManager) null);
		panel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_10.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_10.setBackground(new Color(51, 51, 51));
			}
		});
		panel_10.setBackground(new Color(51, 51, 51));
		panel_10.setBounds(0, 118, 221, 36);
		panel_2.add(panel_10);
		
		JButton btnCalendar = new JButton("Calendar            ");
		btnCalendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_10.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_10.setBackground(new Color(51, 51, 51));
			}
		});
		btnCalendar.setForeground(Color.WHITE);
		btnCalendar.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnCalendar.setFocusPainted(false);
		btnCalendar.setContentAreaFilled(false);
		btnCalendar.setBorderPainted(false);
		btnCalendar.setBounds(0, 0, 222, 36);
		panel_10.add(btnCalendar);
		
		JLabel lblTasks = new JLabel("TASKS");
		lblTasks.setForeground(Color.WHITE);
		lblTasks.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTasks.setBounds(20, 225, 101, 36);
		panel_2.add(lblTasks);
		
		final JPanel panel_11 = new JPanel((LayoutManager) null);
		panel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_11.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_11.setBackground(new Color(51, 51, 51));
			}
		});
		panel_11.setBackground(new Color(51, 51, 51));
		panel_11.setBounds(0, 263, 221, 36);
		panel_2.add(panel_11);
		
		JButton btnAdd = new JButton("Add                  ");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddTask AT = new AddTask();
				AT.username=uname;
				AT.setVisible(true);
			}
		});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_11.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_11.setBackground(new Color(51, 51, 51));
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnAdd.setFocusPainted(false);
		btnAdd.setContentAreaFilled(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setBounds(2, 0, 220, 36);
		panel_11.add(btnAdd);
		
		final JPanel panel_12 = new JPanel((LayoutManager) null);
		panel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_12.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_12.setBackground(new Color(51, 51, 51));
			}
		});
		panel_12.setBackground(new Color(51, 51, 51));
		panel_12.setBounds(0, 298, 221, 36);
		panel_2.add(panel_12);
		
		JButton btnRemove = new JButton("Remove            ");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteTask DT = new DeleteTask();
				DT.setVisible(true);
			}
		});
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_12.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_12.setBackground(new Color(51, 51, 51));
			}
		});
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnRemove.setFocusPainted(false);
		btnRemove.setContentAreaFilled(false);
		btnRemove.setBorderPainted(false);
		btnRemove.setBounds(1, 0, 221, 36);
		panel_12.add(btnRemove);
		
		final JPanel panel_13 = new JPanel((LayoutManager) null);
		panel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_13.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_13.setBackground(new Color(51, 51, 51));
			}
		});
		panel_13.setBackground(new Color(51, 51, 51));
		panel_13.setBounds(0, 333, 221, 36);
		panel_2.add(panel_13);
		
		JButton btnModify = new JButton("Modify              ");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifyTask MT = new ModifyTask();
				MT.setVisible(true);
			}
		});
		btnModify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_13.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_13.setBackground(new Color(51, 51, 51));
			}
		});
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnModify.setFocusPainted(false);
		btnModify.setContentAreaFilled(false);
		btnModify.setBorderPainted(false);
		btnModify.setBounds(1, 0, 221, 36);
		panel_13.add(btnModify);
		
		final JPanel panel_16 = new JPanel((LayoutManager) null);
		panel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_16.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_16.setBackground(new Color(51, 51, 51));
			}
		});
		panel_16.setBackground(new Color(51, 51, 51));
		panel_16.setBounds(0, 367, 221, 36);
		panel_2.add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));
		
		panel_17 = new JPanel((LayoutManager) null);
		panel_16.add(panel_17, "name_17376794082954");
		panel_17.setBackground(new Color(51, 51, 51));
		panel_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_16.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_16.setBackground(new Color(51, 51, 51));
			}
		});
		
		JButton btnComplete = new JButton("Complete          ");
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_17.setVisible(false);
				panel_20.setVisible(true);
			}
		});
		btnComplete.setBounds(0, 0, 221, 36);
		panel_17.add(btnComplete);
		btnComplete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_16.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_16.setBackground(new Color(51, 51, 51));
			}
		});
		btnComplete.setForeground(Color.WHITE);
		btnComplete.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnComplete.setFocusPainted(false);
		btnComplete.setContentAreaFilled(false);
		btnComplete.setBorderPainted(false);
		
		panel_20 = new JPanel((LayoutManager) null);
		panel_16.add(panel_20, "name_17486511895049");
		panel_20.setBackground(new Color(51, 51, 51));
		panel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_16.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_16.setBackground(new Color(51, 51, 51));
			}
		});
		
		JLabel lblTask = new JLabel("Task #:");
		lblTask.setForeground(Color.WHITE);
		lblTask.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTask.setBounds(25, 0, 36, 36);
		panel_20.add(lblTask);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(71, 5, 45, 25);
		panel_20.add(textField_1);
		
		JButton btnNewButton_2 = new JButton("\u221A");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_17.setVisible(true);
				panel_20.setVisible(false);
				JOptionPane.showMessageDialog(null, "Hurray! You completed a task!");
			}
		});
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(122, 0, 45, 34);
		panel_20.add(btnNewButton_2);
		
		JButton btnX_1 = new JButton("X");
		btnX_1.setForeground(Color.WHITE);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_17.setVisible(true);
				panel_20.setVisible(false);
				textField_1.setText("");
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX_1.setBackground(Color.DARK_GRAY);
		btnX_1.setBounds(166, 0, 45, 34);
		panel_20.add(btnX_1);
		
		final JPanel panel_18 = new JPanel((LayoutManager) null);
		panel_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_18.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_18.setBackground(new Color(51, 51, 51));
			}
		});
		panel_18.setBackground(new Color(51, 51, 51));
		panel_18.setBounds(0, 153, 221, 36);
		panel_2.add(panel_18);
		
		JButton btnCheck = new JButton("Task List           ");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pDashboard.setVisible(false);
				pBiodata.setVisible(false);
				pCalendar.setVisible(false);
				pTask_List.setVisible(true);
			}
		});
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_18.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_18.setBackground(new Color(51, 51, 51));
			}
		});
		btnCheck.setForeground(Color.WHITE);
		btnCheck.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnCheck.setFocusPainted(false);
		btnCheck.setContentAreaFilled(false);
		btnCheck.setBorderPainted(false);
		btnCheck.setBounds(0, 0, 219, 36);
		panel_18.add(btnCheck);
		
		JPanel panel_19 = new JPanel((LayoutManager) null);
		panel_19.setBackground(new Color(51, 51, 51));
		panel_19.setBounds(0, 439, 221, 110);
		panel_2.add(panel_19);
		
		JLabel lblChild = new JLabel("CHILD");
		lblChild.setBounds(20, 0, 101, 36);
		panel_19.add(lblChild);
		lblChild.setForeground(Color.WHITE);
		lblChild.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		final JPanel panel_14 = new JPanel((LayoutManager) null);
		panel_14.setBounds(0, 38, 221, 36);
		panel_19.add(panel_14);
		panel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_14.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_14.setBackground(new Color(51, 51, 51));
			}
		});
		panel_14.setBackground(new Color(51, 51, 51));
		
		JButton btnCommand = new JButton("Command         ");
		btnCommand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_14.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_14.setBackground(new Color(51, 51, 51));
			}
		});
		btnCommand.setForeground(Color.WHITE);
		btnCommand.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnCommand.setFocusPainted(false);
		btnCommand.setContentAreaFilled(false);
		btnCommand.setBorderPainted(false);
		btnCommand.setBounds(0, 0, 221, 36);
		panel_14.add(btnCommand);
		
		final JPanel panel_15 = new JPanel((LayoutManager) null);
		panel_15.setBounds(0, 73, 221, 36);
		panel_19.add(panel_15);
		panel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_15.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_15.setBackground(new Color(51, 51, 51));
			}
		});
		panel_15.setBackground(new Color(51, 51, 51));
		
		JButton btnMessage = new JButton("Message           ");
		btnMessage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel_15.setBackground(new Color(102,102,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_15.setBackground(new Color(51, 51, 51));
			}
		});
		btnMessage.setForeground(Color.WHITE);
		btnMessage.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 14));
		btnMessage.setFocusPainted(false);
		btnMessage.setContentAreaFilled(false);
		btnMessage.setBorderPainted(false);
		btnMessage.setBounds(0, 0, 219, 36);
		panel_15.add(btnMessage);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(52, 580, 95, 36);
		panel_2.add(btnRefresh);
		btnRefresh.setHorizontalAlignment(SwingConstants.LEADING);
		btnRefresh.setForeground(Color.DARK_GRAY);
		btnRefresh.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setText("Search");
		textField.setForeground(new Color(102, 102, 102));
		textField.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(584, 440, 347, 39);
		pTask_List.add(textField);
		
		JButton btnGo = new JButton("GO");
		btnGo.setHorizontalAlignment(SwingConstants.LEADING);
		btnGo.setForeground(Color.DARK_GRAY);
		btnGo.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 12));
		btnGo.setBounds(941, 440, 58, 39);
		pTask_List.add(btnGo);
		
		JLabel lblNewLabel_1 = new JLabel("Pending Tasks");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Pristina", Font.BOLD, 35));
		lblNewLabel_1.setBounds(87, 49, 236, 54);
		pTask_List.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel((LayoutManager) null);
		panel_4.setBounds(230, 85, 1126, 148);
		contentPane.add(panel_4);
		panel_4.setBackground(new Color(0, 153, 204));
		panel_4.setLayout(null);
		
		JLabel lblGoodMorning = new JLabel("Good Morning,");
		lblGoodMorning.setBounds(21, 11, 223, 55);
		lblGoodMorning.setFont(new Font("Calisto MT", Font.PLAIN, 32));
		lblGoodMorning.setForeground(new Color(255, 255, 255));
		panel_4.add(lblGoodMorning);
		
	    
		lblPaul.setBounds(247, 11, 223, 55);
		lblPaul.setForeground(Color.WHITE);
		lblPaul.setFont(new Font("Calisto MT", Font.PLAIN, 32));
		panel_4.add(lblPaul);
		
		JPanel panel_5 = new JPanel((LayoutManager) null);
		panel_5.setBounds(884, 106, 93, 42);
		panel_5.setBackground(new Color(51, 204, 255));
		panel_4.add(panel_5);
		
		SimpleDateFormat month,day;
		Date today = new Date();
		
		day = new SimpleDateFormat("EEEE");
		JLabel lblMonday = new JLabel(day.format(today));
		lblMonday.setBounds(0, 0, 93, 42);
		panel_5.add(lblMonday);
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setForeground(Color.WHITE);
		lblMonday.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		
		JPanel panel_6 = new JPanel((LayoutManager) null);
		panel_6.setBounds(977, 106, 121, 42);
		panel_6.setBackground(new Color(51, 204, 255));
		panel_4.add(panel_6);
		
		
		month=new SimpleDateFormat("MMMM dd");
		JLabel lblJanuary = new JLabel(month.format(today));
		lblJanuary.setBounds(0, 0, 121, 42);
		panel_6.add(lblJanuary);
		lblJanuary.setHorizontalAlignment(SwingConstants.CENTER);
		lblJanuary.setForeground(Color.WHITE);
		lblJanuary.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		
		String[] Moods = {
				"Happy","Relaxed", "Contented", "Sad", "Angry",	
				"Exhausted", "Scared", "Thrilled"
		};
		
		lblTime = new JLabel("00:00");
		lblTime.setBounds(899, 29, 186, 77);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 50));
		panel_4.add(lblTime);
		
		lblMidDayIndicator = new JLabel("00");
		lblMidDayIndicator.setBounds(1058, 23, 58, 42);
		lblMidDayIndicator.setHorizontalAlignment(SwingConstants.CENTER);
		lblMidDayIndicator.setForeground(Color.WHITE);
		lblMidDayIndicator.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		if(hour < 12)
			lblMidDayIndicator.setText("am");
		else
			lblMidDayIndicator.setText("pm");
		panel_4.add(lblMidDayIndicator);
		
		JLabel lblMood = new JLabel("Mood:");
		lblMood.setBounds(10, 114, 69, 34);
		lblMood.setHorizontalAlignment(SwingConstants.CENTER);
		lblMood.setForeground(Color.WHITE);
		lblMood.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
		panel_4.add(lblMood);
		
		JComboBox comboBox = new JComboBox(Moods);
		comboBox.setBounds(72, 114, 137, 34);
		panel_4.add(comboBox);
		comboBox.setFont(new Font("Traditional Arabic", Font.PLAIN, 16));
		comboBox.setOpaque(false);
		comboBox.setBorder(null);
		comboBox.setBackground(new Color(51, 204, 204));
	}
}
