package org.grocery.stock;

import java.text.ParseException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends Item {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Scanner ob = new Scanner(System.in);
		Item item = session.get(Item.class, 1);
		System.out.println(item.getId());
		System.out.println(item.getName());
		System.out.println(item.getPrice());
		System.out.println(item.getQuantity());
		session.beginTransaction();
		item.setName("Gum");
		item.setPrice(12.09);
		session.update(item);
		session.getTransaction().commit();
		Item i = new Item();
		int ch = 1;

		while (ch >= 1) {
			System.out.println("Enter 1 to add\n Enter 2 to get result");
			ch = ob.nextInt();
			switch (ch) {
			case 1: {
				i.setName(ob.next());
				i.setQuantity(ob.nextInt());
				i.setPrice(ob.nextDouble());
				session.save(i);
				
				session.close();
				sf.close();
				System.out.println("Item saved");
				break;
			}
			case 2: {
				System.out.println(Item.getTotalNoOfProducts());
				break;
			}
			default:
				ch = 0;
				break;
			}

		}

	}

}
