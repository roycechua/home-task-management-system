package HomeDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyTask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyTask frame = new ModifyTask();
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
	public ModifyTask() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Vineta BT", Font.PLAIN, 15));
		button.setContentAreaFilled(false);
		button.setBackground(Color.GRAY);
		button.setBounds(370, 11, 55, 41);
		contentPane.add(button);
		
		JLabel lblModifyTask = new JLabel("Modify Task");
		lblModifyTask.setOpaque(true);
		lblModifyTask.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifyTask.setForeground(Color.BLACK);
		lblModifyTask.setFont(new Font("Pristina", Font.BOLD, 35));
		lblModifyTask.setBackground(new Color(0, 0, 0, 1));
		lblModifyTask.setBounds(0, 22, 206, 85);
		contentPane.add(lblModifyTask);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 64));
		panel.setBounds(10, 89, 415, 397);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("  Work/Task:");
		label_1.setOpaque(true);
		label_1.setForeground(new Color(204, 255, 255));
		label_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_1.setBackground(new Color(0, 0, 0, 160));
		label_1.setBounds(26, 69, 98, 39);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField.setBackground(Color.WHITE);
		textField.setBounds(134, 69, 253, 39);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("  Level of Importance:");
		label_2.setOpaque(true);
		label_2.setForeground(new Color(204, 255, 255));
		label_2.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_2.setBackground(new Color(0, 0, 0, 160));
		label_2.setBounds(26, 119, 172, 39);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(214, 119, 161, 39);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("  Performer:");
		label_3.setOpaque(true);
		label_3.setForeground(new Color(204, 255, 255));
		label_3.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_3.setBackground(new Color(0, 0, 0, 160));
		label_3.setBounds(26, 171, 98, 39);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(134, 171, 253, 39);
		panel.add(textField_1);
		
		JLabel label_4 = new JLabel("  Due Time:");
		label_4.setOpaque(true);
		label_4.setForeground(new Color(204, 255, 255));
		label_4.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_4.setBackground(new Color(0, 0, 0, 160));
		label_4.setBounds(26, 271, 90, 39);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("  Due Date:");
		label_5.setOpaque(true);
		label_5.setForeground(new Color(204, 255, 255));
		label_5.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_5.setBackground(new Color(0, 0, 0, 160));
		label_5.setBounds(26, 221, 90, 39);
		panel.add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(126, 221, 98, 39);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(234, 221, 45, 39);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		comboBox_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(289, 221, 98, 39);
		panel.add(comboBox_3);
		
		textField_2 = new JTextField();
		textField_2.setText("hh");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.GRAY);
		textField_2.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(126, 271, 45, 39);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("mm");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.GRAY);
		textField_3.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(201, 271, 45, 39);
		panel.add(textField_3);
		
		JLabel label_6 = new JLabel(":");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(204, 255, 255));
		label_6.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_6.setBackground(new Color(0, 0, 0, 160));
		label_6.setBounds(177, 271, 14, 39);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel(":");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(204, 255, 255));
		label_7.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_7.setBackground(new Color(0, 0, 0, 160));
		label_7.setBounds(255, 271, 14, 39);
		panel.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setText("ss");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.GRAY);
		textField_4.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(279, 271, 45, 39);
		panel.add(textField_4);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(220, 346, 78, 29);
		panel.add(button_1);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "A Tasks has been Modified!");
			}
		});
		btnModify.setForeground(Color.WHITE);
		btnModify.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 14));
		btnModify.setBackground(Color.BLACK);
		btnModify.setBounds(309, 346, 78, 29);
		panel.add(btnModify);
		
		JLabel label_8 = new JLabel("  Task #:");
		label_8.setOpaque(true);
		label_8.setForeground(new Color(204, 255, 255));
		label_8.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_8.setBackground(new Color(0, 0, 0, 160));
		label_8.setBounds(273, 19, 64, 39);
		panel.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(342, 19, 45, 39);
		panel.add(textField_5);
	}

}
