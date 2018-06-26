package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.Scanner;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class App {
	public static void main(String[] args) throws UnknownHostException

	{
		Scanner in = new Scanner(System.in);

		MongoClient mongo = new MongoClient("localhost", 27017);
		// MongoClient mongo= new MongoClient("127.0.0.1" , 27017);

		DB db = mongo.getDB("test");
		DBCollection table = db.getCollection("basil");
		int choice;

		do {

			System.out.println("\n  MONGO- DB OPERATIONS \n");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. View all");
			System.out.println("5. Delete");
			System.out.println("6. Exit \n");
			System.out.println("Enter The Choice:");
			choice = in.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter the name:");
				String name = in.next();
				System.out.println("Enter the age");
				int age = in.nextInt();
				System.out.println("Enter the place");
				String place = in.next();

				BasicDBObject document = new BasicDBObject();
				document.put("name", name);
				document.put("age", age);
				document.put("place", place);
				table.insert(document);
				System.out.println("Inserted successfully!");
				break;
			}
			case 2: {
				System.out.println("Enter the name to search");
				String sName = in.next();
				BasicDBObject searchQuery = new BasicDBObject();
				searchQuery.put("name", sName);
				DBCursor cursor = table.find(searchQuery);
				while (cursor.hasNext()) {
					System.out.println(cursor.next());
				}

				break;
			}
			case 3: {

				System.out.println("select the field to update");

				System.out.println("1. name");
				System.out.println("2. age");
				System.out.println("3. place");

				System.out.println("Enter your choice:");
				int eChoice = in.nextInt();

				if (eChoice == 1) {
					System.out.println("Enter the name to update");
					String uName = in.next();
					System.out.println("Enter the new name");
					String nName = in.next();

					BasicDBObject query = new BasicDBObject();
					query.put("name", uName);

					BasicDBObject newDocument = new BasicDBObject();
					newDocument.put("name", nName);

					BasicDBObject updateObj = new BasicDBObject();
					updateObj.put("$set", newDocument);

					table.update(query, updateObj);
					System.out.println("updated successfully");
					break;

				} else if (eChoice == 2) {
					System.out.println("Enter the name to update");
					String uName = in.next();
					System.out.println("Enter the new age");
					int nAge = in.nextInt();

					BasicDBObject query = new BasicDBObject();
					query.put("name", uName);

					BasicDBObject newDocument = new BasicDBObject();
					newDocument.put("age", nAge);

					BasicDBObject updateObj = new BasicDBObject();
					updateObj.put("$set", newDocument);

					table.update(query, updateObj);
					System.out.println("updated successfully");
					break;
				} else if (eChoice == 3) {

					System.out.println("Enter the name to update");
					String uName = in.next();
					System.out.println("Enter the new place");
					String nPlace = in.next();

					BasicDBObject query = new BasicDBObject();
					query.put("name", uName);

					BasicDBObject newDocument = new BasicDBObject();
					newDocument.put("place", nPlace);

					BasicDBObject updateObj = new BasicDBObject();
					updateObj.put("$set", newDocument);

					table.update(query, updateObj);
					System.out.println("updated successfully");
					break;
				} else {
					System.out.println(" please select the choice from 1 - 3 ");
					break;
				}

			}
			case 4: {
				DBCursor cursor = table.find();
				while (cursor.hasNext()) {
					System.out.println(cursor.next());
				}
				break;
			}
			case 5: {

				System.out.println("Enter the name to delete");
				String dName = in.next();

				BasicDBObject deleteQuery = new BasicDBObject();
				deleteQuery.put("name", dName);
				DBCursor cursor = table.find(deleteQuery);
				while (cursor.hasNext()) {
					DBObject item = cursor.next();
					table.remove(item);
				}
				System.out.println("deleted successfully");
				break;

			}
			case 6: {
				System.out.println("Terminated successfully");
				System.exit(0);
				break;
			}

			default:
				System.out.println("Please select the option from 1 - 6 ");
				break;
			}

		} while (choice != 0);

	}
}
