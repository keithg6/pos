package Eclipse_PoSales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.channels.SelectionKey;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Eclipse_PoSale {

	private JFrame frmPointOfSale;
	
	
	protected Component chkHamburger;
	private JTextField txtHamburger;
	private JTextField txtCheeseburger;
	private JTextField txtSirloinSteak;
	private JTextField txtPorkSkillets;
	private JTextField txtCeasarSalad;
	private JTextField txtChickenSoup;
	private JTextField txtIcedCoffee;
	private JTextField txtSoftDrinks;
	private JTextField txtWater;
	private JTextField txtOrangeJuice;
	
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eclipse_PoSale window = new Eclipse_PoSale();
					window.frmPointOfSale.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Eclipse_PoSale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPointOfSale = new JFrame();
		frmPointOfSale.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				txtHamburger.setEnabled(false);
				txtCheeseburger.setEnabled(false);
				txtSirloinSteak.setEnabled(false);
				txtPorkSkillets.setEnabled(false);
				txtCeasarSalad.setEnabled(false);
				txtChickenSoup.setEnabled(false);
				txtIcedCoffee.setEnabled(false);
				txtSoftDrinks.setEnabled(false);
				txtWater.setEnabled(false);
				txtOrangeJuice.setEnabled(false);
			}
		});
		frmPointOfSale.setTitle("Point of Sales");
		frmPointOfSale.setBounds(0, 0, 1370, 700);
		frmPointOfSale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPointOfSale.getContentPane().setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmPointOfSale.getContentPane().add(panel);
		panel.setLayout(new GridLayout(10, 2, 2, 2));
		
		JButton btnNewButton_1 = new JButton("Hamburger");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHamburger.setEnabled(true);
				JCheckBox chkHamburger = new JCheckBox("Hamburger");
				chkHamburger.setEnabled(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cheeseburger");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkCheeseburger = new JCheckBox("Cheeseburger");
				chkCheeseburger.setEnabled(true);
				txtCheeseburger.setEnabled(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sirloin Steak");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkSirloinSteak = new JCheckBox("Sirloin Steak");
				txtSirloinSteak.setEnabled(true);
				chkSirloinSteak.setEnabled(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Pork Skillets");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkPorkSkillets = new JCheckBox("Pork Skillets");
				txtPorkSkillets.setEnabled(true);
				chkPorkSkillets.setEnabled(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Ceasar Salad");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkCeasarSalad = new JCheckBox("Ceasar Salad");
				txtCeasarSalad.setEnabled(true);
				chkCeasarSalad.setEnabled(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Chicken Soup");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkChickenSoup = new JCheckBox("Chicken Soup");
				txtChickenSoup.setEnabled(true);
				chkChickenSoup.setEnabled(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("Iced Coffee");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkIcedCoffee = new JCheckBox("Iced Coffee");
				txtIcedCoffee.setEnabled(true);
				chkIcedCoffee.setEnabled(true);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Soft Drinks");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkSoftDrinks = new JCheckBox("Soft Drinks");
				txtSoftDrinks.setEnabled(true);
				chkSoftDrinks.setEnabled(true);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("Water");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkWater = new JCheckBox("Water");
				txtWater.setEnabled(true);
				chkWater.setEnabled(true);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Orange Juice");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chkOrangeJuice = new JCheckBox("Orange Juice");
				txtOrangeJuice.setEnabled(true);
				chkOrangeJuice.setEnabled(true);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmPointOfSale.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 1, 1));
		
		JPanel panel_3 = new JPanel();
		panel_3.setToolTipText("");
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(27);
		flowLayout.setHgap(0);
		panel_1.add(panel_3);
		
		JCheckBox chkHamburger = new JCheckBox("Hamburger");
		chkHamburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chkHamburger.isSelected())
				{
					txtHamburger.setEnabled(true);
					txtHamburger.setText("");
					txtHamburger.requestFocus();
				}
				else
				{
					txtHamburger.setEnabled(false);
					txtHamburger.setText("0");
				}
			}
		});
		chkHamburger.setHorizontalAlignment(SwingConstants.CENTER);
		chkHamburger.setEnabled(false);
		chkHamburger.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkHamburger);
		
		JCheckBox chkCheeseburger = new JCheckBox("Cheeseburger");
		chkCheeseburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkCheeseburger.isSelected())
				{
					txtCheeseburger.setEnabled(true);
					txtCheeseburger.setText("");
					txtCheeseburger.requestFocus();
				}
				else
				{
					txtCheeseburger.setEnabled(false);
					txtCheeseburger.setText("0");
				}
			}
		});
		chkCheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
		chkCheeseburger.setEnabled(false);
		chkCheeseburger.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkCheeseburger);
		
		JCheckBox chkSirloinSteak = new JCheckBox("Sirloin Steak");
		chkSirloinSteak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkSirloinSteak.isSelected())
				{
					txtSirloinSteak.setEnabled(true);
					txtSirloinSteak.setText("");
					txtSirloinSteak.requestFocus();
				}
				else
				{
					txtSirloinSteak.setEnabled(false);
					txtSirloinSteak.setText("0");
				}
			}
		});
		chkSirloinSteak.setHorizontalAlignment(SwingConstants.CENTER);
		chkSirloinSteak.setEnabled(false);
		chkSirloinSteak.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkSirloinSteak);
		
		JCheckBox chkPorkSkillets = new JCheckBox("Pork Skillets");
		chkPorkSkillets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkPorkSkillets.isSelected())
				{
					txtPorkSkillets.setEnabled(true);
					txtPorkSkillets.setText("");
					txtPorkSkillets.requestFocus();
				}
				else
				{
					txtPorkSkillets.setEnabled(false);
					txtPorkSkillets.setText("0");
				}
			}
		});
		chkPorkSkillets.setHorizontalAlignment(SwingConstants.CENTER);
		chkPorkSkillets.setEnabled(false);
		chkPorkSkillets.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkPorkSkillets);
		
		JCheckBox chkCeasarSalad = new JCheckBox("Ceasar Salad");
		chkCeasarSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkCeasarSalad.isSelected())
				{
					txtCeasarSalad.setEnabled(true);
					txtCeasarSalad.setText("");
					txtCeasarSalad.requestFocus();
				}
				else
				{
					txtCeasarSalad.setEnabled(false);
					txtCeasarSalad.setText("0");
				}
			}
		});
		chkCeasarSalad.setHorizontalAlignment(SwingConstants.CENTER);
		chkCeasarSalad.setEnabled(false);
		chkCeasarSalad.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkCeasarSalad);
		
		JCheckBox chkChickenSoup = new JCheckBox("Chicken Soup");
		chkChickenSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkChickenSoup.isSelected())
				{
					txtChickenSoup.setEnabled(true);
					txtChickenSoup.setText("");
					txtChickenSoup.requestFocus();
				}
				else
				{
					txtChickenSoup.setEnabled(false);
					txtChickenSoup.setText("0");
				}
			}
		});
		chkChickenSoup.setHorizontalAlignment(SwingConstants.CENTER);
		chkChickenSoup.setEnabled(false);
		chkChickenSoup.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkChickenSoup);
		
		JCheckBox chkIcedCoffee = new JCheckBox("Iced Coffee");
		chkIcedCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkIcedCoffee.isSelected())
				{
					txtIcedCoffee.setEnabled(true);
					txtIcedCoffee.setText("");
					txtIcedCoffee.requestFocus();
				}
				else
				{
					txtIcedCoffee.setEnabled(false);
					txtIcedCoffee.setText("0");
				}
			}
		});
		chkIcedCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		chkIcedCoffee.setEnabled(false);
		chkIcedCoffee.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkIcedCoffee);
		
		JCheckBox chkSoftDrinks = new JCheckBox("Soft Drinks");
		chkSoftDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkSoftDrinks.isSelected())
				{
					txtSoftDrinks.setEnabled(true);
					txtSoftDrinks.setText("");
					txtSoftDrinks.requestFocus();
				}
				else
				{
					txtSoftDrinks.setEnabled(false);
					txtSoftDrinks.setText("0");
				}
			}
		});
		chkSoftDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		chkSoftDrinks.setEnabled(false);
		chkSoftDrinks.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkSoftDrinks);
		
		JCheckBox chkWater = new JCheckBox("Water");
		chkWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkWater.isSelected())
				{
					txtWater.setEnabled(true);
					txtWater.setText("");
					txtWater.requestFocus();
				}
				else
				{
					txtWater.setEnabled(false);
					txtWater.setText("0");
				}
			}
		});
		chkWater.setHorizontalAlignment(SwingConstants.CENTER);
		chkWater.setEnabled(false);
		chkWater.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkWater);
		
		JCheckBox chkOrangeJuice = new JCheckBox("Orange Juice");
		chkOrangeJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkOrangeJuice.isSelected())
				{
					txtOrangeJuice.setEnabled(true);
					txtOrangeJuice.setText("");
					txtOrangeJuice.requestFocus();
				}
				else
				{
					txtOrangeJuice.setEnabled(false);
					txtOrangeJuice.setText("0");
				}
			}
		});
		chkOrangeJuice.setHorizontalAlignment(SwingConstants.CENTER);
		chkOrangeJuice.setEnabled(false);
		chkOrangeJuice.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_3.add(chkOrangeJuice);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(33);
		flowLayout_1.setHgap(0);
		panel_1.add(panel_4);
		
		txtHamburger = new JTextField();
		txtHamburger.setText("0");
		txtHamburger.setHorizontalAlignment(SwingConstants.CENTER);
		txtHamburger.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtHamburger);
		txtHamburger.setColumns(10);
		
		txtCheeseburger = new JTextField();
		txtCheeseburger.setText("0");
		txtCheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
		txtCheeseburger.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtCheeseburger);
		txtCheeseburger.setColumns(10);
		
		txtSirloinSteak = new JTextField();
		txtSirloinSteak.setText("0");
		txtSirloinSteak.setHorizontalAlignment(SwingConstants.CENTER);
		txtSirloinSteak.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtSirloinSteak);
		txtSirloinSteak.setColumns(10);
		
		txtPorkSkillets = new JTextField();
		txtPorkSkillets.setText("0");
		txtPorkSkillets.setHorizontalAlignment(SwingConstants.CENTER);
		txtPorkSkillets.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtPorkSkillets);
		txtPorkSkillets.setColumns(10);
		
		txtCeasarSalad = new JTextField();
		txtCeasarSalad.setText("0");
		txtCeasarSalad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCeasarSalad.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtCeasarSalad);
		txtCeasarSalad.setColumns(10);
		
		txtChickenSoup = new JTextField();
		txtChickenSoup.setText("0");
		txtChickenSoup.setHorizontalAlignment(SwingConstants.CENTER);
		txtChickenSoup.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtChickenSoup);
		txtChickenSoup.setColumns(10);
		
		txtIcedCoffee = new JTextField();
		txtIcedCoffee.setText("0");
		txtIcedCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		txtIcedCoffee.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtIcedCoffee);
		txtIcedCoffee.setColumns(10);
		
		txtSoftDrinks = new JTextField();
		txtSoftDrinks.setText("0");
		txtSoftDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoftDrinks.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtSoftDrinks);
		txtSoftDrinks.setColumns(10);
		
		txtWater = new JTextField();
		txtWater.setText("0");
		txtWater.setHorizontalAlignment(SwingConstants.CENTER);
		txtWater.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtWater);
		txtWater.setColumns(10);
		
		txtOrangeJuice = new JTextField();
		txtOrangeJuice.setText("0");
		txtOrangeJuice.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrangeJuice.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(txtOrangeJuice);
		txtOrangeJuice.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frmPointOfSale.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setBounds(20, 36, 387, 516);
		panel_2.add(txtReceipt);
		
		JButton button = new JButton("Total");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String chkHamburger = String.format(txtHamburger.getText());
				String chkCheeseburger = String.format(txtCheeseburger.getText());
				String chkSirloinSteak = String.format(txtSirloinSteak.getText());
				String chkPorkSkillets = String.format(txtPorkSkillets.getText());
				String chkCeasarSalad = String.format(txtCeasarSalad.getText());
				String chkChickenSoup = String.format(txtChickenSoup.getText());
				String chkIcedCoffee = String.format(txtIcedCoffee.getText());
				String chkSoftDrinks = String.format(txtSoftDrinks.getText());
				String chkWater = String.format(txtWater.getText());
				String chkOrangeJuice = String.format(txtOrangeJuice.getText());
				
	    			txtReceipt.setEnabled(true);
     				//============================================================================
			int refs= 1325 + (int) (Math.random()*4238);
	
			//========================================================================
					Calendar timer = Calendar.getInstance();
					timer.getTime();
					SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
					tTime.format(timer.getTime());
					SimpleDateFormat Tdate = new SimpleDateFormat("MMM-dd-yyyy");
					Tdate.format(timer.getTime());
			//========================================================================
			txtReceipt.append("\tPoint Of Sale Management Systems\n" +
			"Reference:\t\t\t" + refs +
			"\n================================================\t " +
	
					"\n================================================\t " +
					"\nHamburger:\t" + chkHamburger + " " +
					"\nCheeseburger:\t" + chkCheeseburger + " " +
					"\nSirloinSteak:\t" + chkSirloinSteak + " " +
					"\nPorkSkillets:\t" + chkPorkSkillets + " " +
					"\nCeasarSalad:\t" + chkCeasarSalad + " " +
					"\nChickenSoup:\t" + chkChickenSoup + " " +
					"\nIcedCoffee:\t" + chkIcedCoffee + " " +
					"\nSoftDrinks:\t" + chkSoftDrinks + " " +
					"\nWater:\t" + chkWater + " " +
					"\nOrangeJuice:\t" + chkOrangeJuice + " " +
					"\n================================================\t " +
					"\nDate: " + Tdate.format(timer.getTime()) +
							"\t\tTime: " + tTime.format(timer.getTime()) +
			"\n\n\tThank you for Shopping at Derek's\n" );
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 30));
		button.setBounds(25, 591, 122, 53);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtReceipt.setText("");
				   txtReceipt.setEnabled(false);
				   txtHamburger.setText("0");
				   txtCheeseburger.setText("0");
				   txtSirloinSteak.setText("0");
				   txtPorkSkillets.setText("0");
				   txtCeasarSalad.setText("0");
				   txtChickenSoup.setText("0");
				   txtIcedCoffee.setText("0");
				   txtSoftDrinks.setText("0");
				   txtWater.setText("0");
				   txtOrangeJuice.setText("0");

				   
				   txtHamburger.setEnabled(false);
				   txtCheeseburger.setEnabled(false);
				   txtSirloinSteak.setEnabled(false);
				   txtPorkSkillets.setEnabled(false);
				   txtCeasarSalad.setEnabled(false);
				   txtChickenSoup.setEnabled(false);
				   txtIcedCoffee.setEnabled(false);
				   txtSoftDrinks.setEnabled(false);
				   txtWater.setEnabled(false);
				   txtOrangeJuice.setEnabled(false);
				   

				   
				   chkHamburger.setSelected(false);
				   chkCheeseburger.setSelected(false);
				   chkSirloinSteak.setSelected(false);
				   chkPorkSkillets.setSelected(false);
				   chkCeasarSalad.setSelected(false);
				   chkChickenSoup.setSelected(false);
				   chkIcedCoffee.setSelected(false);
				   chkSoftDrinks.setSelected(false);
				   chkWater.setSelected(false);
				   chkOrangeJuice.setSelected(false);
				   
				   chkHamburger.setEnabled(false);
				   chkCheeseburger.setEnabled(false);
				   chkSirloinSteak.setEnabled(false);
				   chkPorkSkillets.setEnabled(false);
				   chkCeasarSalad.setEnabled(false);
				   chkChickenSoup.setEnabled(false);
				   chkIcedCoffee.setEnabled(false);
				   chkSoftDrinks.setEnabled(false);
				   chkWater.setEnabled(false);
				   chkOrangeJuice.setEnabled(false);
				   
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_1.setBounds(162, 591, 122, 53);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				   if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of Sale",
				   JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				   System.exit(0);
				   }
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		button_2.setBounds(293, 591, 122, 53);
		panel_2.add(button_2);
		
	}
}
