package com.zolotukhin.spring.hibernate_one_to_many_bi;

import com.zolotukhin.spring.hibernate_one_to_many_bi.entity.Department;
import com.zolotukhin.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();

		Session session = null;
		try {

			//session = factory.getCurrentSession();
			//Department dep = new Department("IT",
			//		100000, 1500000);
			//Employee emp1 = new Employee("Sergey",
			//		"Zolotukhin", 15000000);
			//Employee emp2 = new Employee("Elena",
			//		"Smirnova", 300000);
			//dep.addEmployeeToDepartment(emp1);
			//dep.addEmployeeToDepartment(emp2);
			//session.beginTransaction();
			//
			//session.save(dep);
			//
			//session.getTransaction().commit();
			//System.out.println("Done!");

			//session = factory.getCurrentSession();
			//session.beginTransaction();
			//
			//Department department = session.get(Department.class, 1);
			//System.out.println(department);
			//System.out.println(department.getEmps());
			//
			//session.getTransaction().commit();
			//System.out.println("Done!");

			//session = factory.getCurrentSession();
			//session.beginTransaction();
			//
			//Employee employee = session.get(Employee.class, 1);
			//System.out.println(employee);
			//System.out.println(employee.getDepartment());
			////System.out.println(employee.getDepartment().getEmps());
			//
			//session.getTransaction().commit();
			//System.out.println("Done!");

			//**************************************
			session = factory.getCurrentSession();
			session.beginTransaction();

			Employee employee = session.get(Employee.class, 4);
			session.delete(employee);

			session.getTransaction().commit();
			System.out.println("Done!");

		}
		finally {
			session.close();
			factory.close();
		}

	}

}
