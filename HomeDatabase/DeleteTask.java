package HomeDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteTask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteTask frame = new DeleteTask();
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
	public DeleteTask() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 269);
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
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Vineta BT", Font.PLAIN, 15));
		button.setContentAreaFilled(false);
		button.setBackground(Color.GRAY);
		button.setBounds(370, 11, 55, 41);
		contentPane.add(button);
		
		JLabel lblDeleteTask = new JLabel("Delete Task");
		lblDeleteTask.setOpaque(true);
		lblDeleteTask.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteTask.setForeground(Color.BLACK);
		lblDeleteTask.setFont(new Font("Pristina", Font.BOLD, 35));
		lblDeleteTask.setBackground(new Color(0, 0, 0, 1));
		lblDeleteTask.setBounds(0, 22, 206, 85);
		contentPane.add(lblDeleteTask);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0, 64));
		panel.setBounds(10, 89, 415, 146);
		contentPane.add(panel);
		
		JLabel lblTask = new JLabel("  Task #:");
		lblTask.setOpaque(true);
		lblTask.setForeground(new Color(204, 255, 255));
		lblTask.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		lblTask.setBackground(new Color(0, 0, 0, 160));
		lblTask.setBounds(92, 78, 64, 39);
		panel.add(lblTask);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField.setBackground(Color.WHITE);
		textField.setBounds(161, 78, 45, 39);
		panel.add(textField);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(229, 83, 78, 29);
		panel.add(button_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pick = JOptionPane.showConfirmDialog(null, "Are you sure you want to DELETE this?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (pick == JOptionPane.YES_OPTION)
					JOptionPane.showMessageDialog(null, "Your Tasks has Decreased!");
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 14));
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setBounds(314, 83, 78, 29);
		panel.add(btnDelete);
		
		JLabel label_1 = new JLabel("  Account Password:");
		label_1.setOpaque(true);
		label_1.setForeground(new Color(204, 255, 255));
		label_1.setFont(new Font("Plantagenet Cherokee", Font.PLAIN, 16));
		label_1.setBackground(new Color(0, 0, 0, 160));
		label_1.setBounds(10, 28, 145, 39);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(161, 28, 231, 39);
		panel.add(textField_1);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 435, 255);
		contentPane.add(label);
	}
}
