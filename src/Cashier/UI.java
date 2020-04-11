package Cashier;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class UI {

	private JFrame frame;
	private JTextField txtOrderTotal;
	private int Total = 4000;
	private JTextField calc;
	private static String cashTaken = "";
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnEnter;
	private JButton btnClear;
	private JButton btnBackSpace;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 929, 743);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtOrderTotal = new JTextField();
		txtOrderTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrderTotal.setFont(new Font("Arial", Font.BOLD, 28));
		txtOrderTotal.setText("Order Total: $4000");
		txtOrderTotal.setBounds(304, 11, 266, 73);
		frame.getContentPane().add(txtOrderTotal);
		txtOrderTotal.setColumns(10);
		
		
		calc = new JTextField();
		calc.setFont(new Font("Times New Roman", Font.BOLD, 30));
		calc.setText("");
		calc.setBounds(304, 163, 266, 40);
		frame.getContentPane().add(calc);
		calc.setColumns(10);
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn0.setBounds(402, 440, 70, 56);
		frame.getContentPane().add(btn0);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn7.setBounds(304, 239, 70, 56);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn8.setBounds(402, 239, 70, 56);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn9.setBounds(500, 239, 70, 56);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn4.setBounds(304, 306, 70, 56);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn5.setBounds(402, 306, 70, 56);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn6.setBounds(500, 306, 70, 56);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn1.setBounds(304, 373, 70, 56);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn2.setBounds(402, 373, 70, 56);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btn3.setBounds(500, 373, 70, 56);
		frame.getContentPane().add(btn3);
		
		btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnEnter.setBounds(354, 585, 172, 56);
		frame.getContentPane().add(btnEnter);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnClear.setBounds(665, 239, 99, 56);
		frame.getContentPane().add(btnClear);
		
		btnBackSpace = new JButton("<---");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btnBackSpace.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnBackSpace.setBounds(665, 373, 99, 56);
		frame.getContentPane().add(btnBackSpace);
	}
	
	private static void handleButton(String btnValue) {

	}
}
