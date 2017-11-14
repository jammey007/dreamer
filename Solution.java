package project.emp;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends Employe {

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employe ob = new Employe();

		ob.setEmailid("saranrajasaravana@gmail.com");
		ob.setId(10);
		ob.setName("jammey");
		ob.setPhone(9894306110l);
		System.out.println(ob.getEmailid());
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		System.out.println(ob.getPhone());
		Employe ob1 = new Employe();
		ob1.setEmailid("xyz@gmail.com");
		ob1.setId(101);
		ob1.setName("saro");
		ob1.setPhone(9894306109l);
		System.out.println(ob1.getEmailid());
		System.out.println(ob1.getId());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPhone());

		Employe emp = new Employe(1, "jai", "x@g.com", 987654567l);

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmailid());

		System.out.println(emp.getPhone());
		session.save(emp);
		session.getTransaction().commit();
		session.close();

	}

}
