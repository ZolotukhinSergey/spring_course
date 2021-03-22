package com.zolotukhin.spring.hibernate_one_to_one;

import com.zolotukhin.spring.hibernate_one_to_one.entity.Detail;
import com.zolotukhin.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Detail.class)
				.buildSessionFactory();

		Session session = null;
		try {
			//Session session = factory.getCurrentSession();
			//Employee employee = new Employee("Sergey", "Zolotukhin",
			//		"IT", 900000);
			//Detail detail = new Detail("Krasnodar",
			//		"886154232568",
			//		"example@example.com");
			//employee.setEmpDetail(detail);
			//session.beginTransaction();
			//
			//session.save(employee);
			//
			//session.getTransaction().commit();
			//System.out.println("Done!");

			//Session session = factory.getCurrentSession();
			//Employee employee = new Employee("Oleg",
			//		"Smirnov",
			//		"Sales", 50000);
			//Detail detail = new Detail("Moscow",
			//		"84956213245",
			//		"olegka@example.com");
			//employee.setEmpDetail(detail);
			//session.beginTransaction();
			//
			//session.save(employee);
			//
			//session.getTransaction().commit();
			//System.out.println("Done!");

			session = factory.getCurrentSession();
			session.beginTransaction();

			Employee emp = session.get(Employee.class, 2);
			session.delete(emp);
			//System.out.println(emp.getEmpDetail());

			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
