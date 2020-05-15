package inventoryManage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;

import java.util.List;
import java.util.HashMap;
import java.net.UnknownHostException;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;



import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Filters.eq;

import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Inventory extends JFrame {
	
	// Written by Gerardo Lomas

	public JPanel contentPane;
	private JTextField txtItemName;
	private JTable table;
	private JTextField txtPrice;
	private JTextField txtQuantity;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
			
			MongoClient mongo = new MongoClient(new MongoClientURI("mongodb+srv://gerardo:group4@cluster0-a37wq.mongodb.net/POSsystem?retryWrites=true&w=majority"));
	 		MongoDatabase db = mongo.getDatabase("POSsystem");
	 		//collection = db.getCollection("Item");
	 		MongoCollection<Document> collection = db.getCollection("Item");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(6, 6, 808, 56);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inventory Management");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(35, 106, 370, 312);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Item Name");
		lblNewLabel_1.setBounds(74, 31, 68, 16);
		panel_1.add(lblNewLabel_1);
		
		txtItemName = new JTextField();
		txtItemName.setBounds(154, 26, 150, 26);
		panel_1.add(txtItemName);
		txtItemName.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Item");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// To add new item, give an input for each field for the new item.
				
				String name = txtItemName.getText();
				String price = txtPrice.getText();
				String qty = txtQuantity.getText();
						
				Document document = new Document();
				document.put("name", name);
				document.put("price", price);
				document.put("qtyInStock", qty);
				
				collection.insertOne(document);
			}
		});
		btnNewButton.setBounds(119, 155, 117, 29);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Item");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtItemName.getText();
				
				DeleteResult delete = collection.deleteOne(eq("name", name));
				
			}

		});
		btnNewButton_1.setBounds(119, 196, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update Item");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// To update enter name of item and then enter field that needs to be updated.
			  
			  	String name = txtItemName.getText();
				String price = txtPrice.getText();
				String qty = txtQuantity.getText();
				
				BasicDBObject Document = new BasicDBObject();
				Document.append("$set", new BasicDBObject().append("price", price));
				Document.append("$set", new BasicDBObject().append("qtyInStock", qty));

				BasicDBObject searchQuery = new BasicDBObject().append("name", name);

				collection.updateOne(searchQuery, Document);
			}
		});
		btnNewButton_2.setBounds(119, 237, 117, 29);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setBounds(74, 69, 68, 16);
		panel_1.add(lblNewLabel_2);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(154, 64, 150, 26);
		panel_1.add(txtPrice);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setBounds(74, 111, 61, 16);
		panel_1.add(lblNewLabel_3);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(154, 102, 150, 29);
		panel_1.add(txtQuantity);
		txtQuantity.setColumns(10);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setSelectionForeground(Color.WHITE);
		table.setGridColor(Color.BLACK);
		table.setBorder(new TitledBorder(null, "Inventory", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(417, 106, 370, 312);
		contentPane.add(table);
	}
}
