package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Cashier.ChooseOrder;
import Server.OrderScreen;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Login {
	
	// written by: Keith Gordon
	// tested by: Keith Gordon
	// debugged by: Keith Gordon
	
	//SAMPLE IDS
	//SERVER: 5e9a865b1c9d4400002ae679
	//CASHIER: 5e9a86451c9d4400002ae678
	
	

	private static String inputString = "";
	private JFrame frame;
	private static JPasswordField input;
	private static MongoCollection<Document> collection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb+srv://gerardo:group4@cluster0-a37wq.mongodb.net/POSsystem?retryWrites=true&w=majority"));
		MongoDatabase db = mongo.getDatabase("POSsystem");
		collection = db.getCollection("User");
		frame = new JFrame();
		frame.setBounds(100, 100, 1116, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn7.setBounds(386, 187, 89, 65);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn8.setBounds(485, 187, 89, 65);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn9.setBounds(584, 187, 89, 65);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn4.setBounds(386, 263, 89, 65);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn5.setBounds(485, 263, 89, 65);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn6.setBounds(584, 263, 89, 65);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn1.setBounds(386, 339, 89, 65);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn2.setBounds(485, 339, 89, 65);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn3.setBounds(584, 339, 89, 65);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btn0.setBounds(485, 415, 89, 65);
		frame.getContentPane().add(btn0);
		
		JButton btnBack = new JButton("<---");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btnBack.setBounds(785, 187, 89, 65);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btnClear.setBounds(769, 282, 117, 65);
		frame.getContentPane().add(btnClear);
		
		input = new JPasswordField();
		input.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		input.setBounds(386, 92, 287, 49);
		frame.getContentPane().add(input);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				Login.handleButton(btnValue);
			}
		});
		btnEnter.setBounds(769, 382, 117, 65);
		frame.getContentPane().add(btnEnter);
		
		JLabel lblNewLabel = new JLabel("Login using your ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(412, 21, 224, 38);
		frame.getContentPane().add(lblNewLabel);
	}
	
	private static void handleButton(String btnValue) {
		switch(btnValue) {
			case "Clear":
				inputString = "";
				break;
			case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
				inputString += btnValue;
				break;
			case "<---":
				inputString = inputString.substring(0, inputString.length()-1);
				break;
			case "Enter":
				try {
				BasicDBObject query = new BasicDBObject();
				query.put("_id", new ObjectId(input.getText().replaceAll("\\s+","")));
				Document myDoc = collection.find(query).first();
				String job = myDoc.getEmbedded(List.of("Employee", "jobTitle"), String.class);
				System.out.println(job);
				switch(job) {
				case "Cashier":
					ChooseOrder choose = new ChooseOrder();
					choose.frame.setVisible(true);
				break;
				case "Server":
					OrderScreen order = new OrderScreen();
					order.frmPointOfSale.setVisible(true);
				break;
				}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "No user found");
				}
			break;
		}
		input.setText(inputString);
	}
}
