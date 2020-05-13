package Cashier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseOrder {

//	CODE WRITTEN BY KEITH
	
	public JFrame frame;
	private JTextField txtHelloCashier;
	private JTextField txtSelect;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseOrder window = new ChooseOrder();
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
	public ChooseOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb+srv://gerardo:group4@cluster0-a37wq.mongodb.net/POSsystem?retryWrites=true&w=majority"));
		MongoDatabase db = mongo.getDatabase("POSsystem");
		MongoCollection<Document> collection = db.getCollection("Transaction");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1112, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtHelloCashier = new JTextField();
		txtHelloCashier.setEditable(false);
		txtHelloCashier.setHorizontalAlignment(SwingConstants.CENTER);
		txtHelloCashier.setFont(new Font("Arial", Font.PLAIN, 30));
		txtHelloCashier.setText("Hello Cashier");
		txtHelloCashier.setBounds(371, 11, 294, 48);
		frame.getContentPane().add(txtHelloCashier);
		txtHelloCashier.setColumns(10);
		
		txtSelect = new JTextField();
		txtSelect.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelect.setFont(new Font("Arial", Font.PLAIN, 18));
		txtSelect.setEditable(false);
		txtSelect.setText("Please enter an order id:");
		txtSelect.setBounds(398, 101, 240, 38);
		frame.getContentPane().add(txtSelect);
		txtSelect.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 28));
		textField.setBounds(326, 296, 375, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String orderID = textField.getText();
				BasicDBObject query = new BasicDBObject();
				query.put("_id", new ObjectId(orderID));
				Document myDoc = collection.find(query).first();
				ChooseOption choose = new ChooseOption(myDoc);
				choose.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(398, 414, 240, 72);
		frame.getContentPane().add(btnNewButton);
	}
}
