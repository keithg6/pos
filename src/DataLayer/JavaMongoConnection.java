package DataLayer;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;


public class JavaMongoConnection
{

	public static void main (String args[])
	{
	
		//Connect to Server
			MongoClient mongoClient = MongoClients.create(
			    "mongodb+srv://gerardo:group4@cluster0-a37wq.mongodb.net/POSsystem?retryWrites=true&w=majority");
			MongoDatabase database = mongoClient.getDatabase("POSsystem");
			System.out.println("server connection successful");
			
		//List Collections in Database
			MongoIterable<String> collections = database.listCollectionNames();
				for (String name: collections)
					{
					    System.out.println(name);
					}

	}

	

}
