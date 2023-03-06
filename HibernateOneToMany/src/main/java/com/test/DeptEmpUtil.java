package com.test;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class DeptEmpUtil {
	
	public static SessionFactory getSessionFactory() {
		Properties prop=new Properties();
		prop.put(Environment.DRIVER, "oracle.jdbc.OracleDriver");
		prop.put(Environment.DIALECT, "org.hibernate.dialect.Oracle8iDialect");
		prop.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:XE");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		prop.put(Environment.USER, "system");
		prop.put(Environment.PASS, "5492");
		prop.put(Environment.SHOW_SQL, "true");
		prop.put(Environment.FORMAT_SQL, "true");
		
		Configuration con=new Configuration();
		con.setProperties(prop);
		con.addAnnotatedClass(Department.class);
		con.addAnnotatedClass(Employees.class);
		ServiceRegistry serviceReg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	    return con.buildSessionFactory(serviceReg);
	}
	

}
