package Cashier;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import org.bson.BSONObject;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;

import java.awt.SystemColor;
import javax.swing.JLabel;

public class UI {
	
//	CODE WRITTEN BY KEITH

	public static JFrame frame;
	private static JTextField txtOrderTotal;
	private static String Total;
	private static JTextField calc;
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
	private static JTextField txtTransactionComplete;
	private static JButton btnDone;
	private static Document myDoc;
	private static MongoCollection<Document> collection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI(myDoc);
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
	public UI(Document Doc) {
		initialize(Doc);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Document Doc) {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb+srv://gerardo:group4@cluster0-a37wq.mongodb.net/POSsystem?retryWrites=true&w=majority"));
		MongoDatabase db = mongo.getDatabase("POSsystem");
		MongoCollection<Document> collection = db.getCollection("Transaction");
		
		myDoc = Doc;
		Total = myDoc.get("Total").toString();
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 925, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtOrderTotal = new JTextField();
		txtOrderTotal.setEditable(false);
		txtOrderTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrderTotal.setFont(new Font("Arial", Font.BOLD, 28));
		txtOrderTotal.setText("Order Total: $" + Total);
		txtOrderTotal.setBounds(145, 11, 629, 73);
		frame.getContentPane().add(txtOrderTotal);
		txtOrderTotal.setColumns(10);
		
		
		calc = new JTextField();
		calc.setFont(new Font("Times New Roman", Font.BOLD, 30));
		calc.setText(cashTaken);
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
		btn0.setBounds(304, 440, 168, 56);
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
		btnClear.setBounds(665, 239, 120, 56);
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
		btnBackSpace.setBounds(675, 373, 99, 56);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnValue = ((JButton) e.getSource()).getText();
				System.out.print(btnValue);
				UI.handleButton(btnValue);
			}
		});
		btnDecimal.setFont(new Font("Times New Roman", Font.BOLD, 27));
		btnDecimal.setBounds(500, 440, 70, 56);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseOption choose = new ChooseOption(myDoc);
				choose.frame.setVisible(true);
			}
		});
		btnBack.setBounds(10, 30, 89, 46);
		frame.getContentPane().add(btnBack);
		
		txtTransactionComplete = new JTextField();
		txtTransactionComplete.setBorder(null);
		txtTransactionComplete.setBackground(SystemColor.menu);
		txtTransactionComplete.setFont(new Font("Arial", Font.PLAIN, 24));
		txtTransactionComplete.setBounds(316, 518, 242, 40);
		frame.getContentPane().add(txtTransactionComplete);
		txtTransactionComplete.setColumns(10);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setFont(new Font("Arial", Font.PLAIN, 36));
		btnDone.setBounds(47, 272, 143, 90);
//		frame.getContentPane().add(btnDone);
//		btnDone.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		
	}
	
	private static void handleButton(String btnValue) {
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		switch(btnValue) {
			case "Clear":
				cashTaken = "";
				break;
			case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
				if(cashTaken.contains(".")) {
					if(cashTaken.substring(cashTaken.indexOf(".")).length() <= 2 ) {
						cashTaken += btnValue;
					}
				}
				else cashTaken += btnValue;
				break;
			case ".":
				if(!cashTaken.contains(".")) {
					cashTaken += btnValue;
				}
				break;
			case "<---":
				cashTaken = cashTaken.substring(0, cashTaken.length()-1);
				break;
			case "Enter":
				double result = Double.valueOf(Total) - Double.valueOf(cashTaken);
				String resultStr = String.valueOf(result);
				resultStr = df.format(Double.valueOf(resultStr));
				Total = resultStr;
				txtOrderTotal.setText("Order Total: $" + Total);
				if(result <= 0) {
					BasicDBObject document = new BasicDBObject("$set", new BasicDBObject().append("Total", "0"))
							.append("$set", new BasicDBObject().append("isDone", "true"));
					BasicDBObject query = new BasicDBObject();
					query.put("_id", new ObjectId("5e9b9be73c661330e6509e14"));
					Document test = collection.find(query).first();
					System.out.println(test.get("_id").toString());
					txtTransactionComplete.setText("Transaction Complete");	
				}
				break;
				
		}

		System.out.println(cashTaken);
		calc.setText(cashTaken);
	}
}
