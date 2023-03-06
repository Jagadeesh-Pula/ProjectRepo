package com.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory=OrderUtils.getSessionFactory();
		Session session=sessionFactory.openSession();
	    
		Criteria cr= session.createCriteria(Order.class);
		//cr.add(Restrictions.between("orderPrice", 100.00, 200.00));
		//cr.add(Restrictions.eqOrIsNull("orderLocation", "Madanapalle"));
		cr.add(Restrictions.idEq(101));
		
		List list= cr.list();
		for(Object obj:list) {
			System.out.println(obj);
		}
		session.close();
	}

}
