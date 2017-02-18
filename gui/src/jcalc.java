import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;


public class jcalc {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jcalc window = new jcalc();
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
	public jcalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 46, 231, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(338, 46, 200, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try
				{
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1+num2;
				textField_2.setText(Integer.toString(ans));
				}catch(Exception a)
				{
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(52, 155, 213, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try
				{
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				ans=num1-num2;
				textField_2.setText(Integer.toString(ans));
				}catch(Exception a1)
				{
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(338, 155, 200, 62);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(98, 282, 200, 50);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 282, 200, 50);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
