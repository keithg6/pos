package Cashier;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.model.Filters;


import org.bson.Document;


public class ChooseOption {

//	CODE WRITTEN BY KEITH
	
	JFrame frame;
	private JTextField txtOrder;
	private JTextField textPrompt;
	public static String cost = "";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		
//		Document document = new Document("id", "1")
//				.append("price", "15.50")
//				.append("Done", "false");
//		collection.insertOne(document);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseOption window = new ChooseOption();
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
	public ChooseOption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb+srv://User:Password@cluster0-ok3dp.mongodb.net/test?retryWrites=true&w=majority"));
		MongoDatabase db = mongo.getDatabase("POS");
		MongoCollection<Document> collection = db.getCollection("orders");
		Document myDoc = collection.find(Filters.eq("id", "1")).first();
		cost = myDoc.getString("price");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 925, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtOrder = new JTextField();
		txtOrder.setEditable(false);
		txtOrder.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrder.setFont(new Font("Arial", Font.PLAIN, 28));
		txtOrder.setText("Order Total: $" + cost);
		txtOrder.setBounds(317, 11, 287, 68);
		frame.getContentPane().add(txtOrder);
		txtOrder.setColumns(10);
		
		textPrompt = new JTextField();
		textPrompt.setText("How would you like to proceed?");
		textPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		textPrompt.setFont(new Font("Arial", Font.PLAIN, 28));
		textPrompt.setEditable(false);
		textPrompt.setColumns(10);
		textPrompt.setBounds(235, 116, 479, 68);
		frame.getContentPane().add(textPrompt);
		
		JButton btnCash = new JButton("CASH");
		btnCash.setFont(new Font("Arial", Font.PLAIN, 24));
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					UI ui = new UI(cost);
					ui.frame.setVisible(true);
			}
		});
		btnCash.setBounds(340, 209, 269, 93);
		frame.getContentPane().add(btnCash);
		
		JButton btnCard = new JButton("CARD");
		btnCard.setFont(new Font("Arial", Font.PLAIN, 24));
		btnCard.setBounds(340, 329, 269, 85);
		frame.getContentPane().add(btnCard);
		
		JButton btnGift = new JButton("GIFT CARD");
		btnGift.setFont(new Font("Arial", Font.PLAIN, 24));
		btnGift.setBounds(340, 439, 269, 85);
		frame.getContentPane().add(btnGift);
		
		JButton btnSplit = new JButton("SPLIT PAY");
		btnSplit.setFont(new Font("Arial", Font.PLAIN, 24));
		btnSplit.setBounds(340, 553, 269, 85);
		frame.getContentPane().add(btnSplit);
	}

}
