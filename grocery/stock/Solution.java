package org.auto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");
		session.save(vehicle);
		TwoWheeler two = new TwoWheeler();
		two.setName("bike");
		two.setSteeringHandle("Bike Steering");
		session.save(two);
		FourWheeler four = new FourWheeler();
		four.setName("Porsche");
		four.setSteeringWheel("Porsche steering wheel");

		
		
		session.save(four);
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
