package project.emp;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends Reservation {

	public Solution(int id, String vehicle, String date, String time, int cost) {
		super(id, vehicle, date, time, cost);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Reservation tr = new Reservation(101, "flight", "12-12-2017", "12.00am", 12000);

		System.out.println(tr.getId());
		System.out.println(tr.getVehicle());
		System.out.println(tr.getDate());
		System.out.println(tr.getTime());
		System.out.println(tr.getCost());
		session.save(tr);
		session.getTransaction().commit();
		session.close();

	}

}