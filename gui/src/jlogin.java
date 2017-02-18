import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class jlogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlogin window = new jlogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(58, 88, 200, 40);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(58, 138, 152, 40);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(161, 98, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 141, 140, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value1=textField.getText();
				  String value2=textField_1.getText();
				  if (value1.equals("suesha") && value2.equals("123")) {
				 //NewPage page=new NewPage();
				  //page.setVisible(true);
				  //JLabel label = new JLabel("Welcome:"+value1);
				  //page.getContentPane().add(label);
					  //System.out.println(" valid username and password");
					  JOptionPane.showMessageDialog(frame,"you are logged in");
				  }
				  else{
				  
					  JOptionPane.showMessageDialog(frame,"you are not logged in");
				  }
			}
		});
		btnSubmit.setBounds(150, 202, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
