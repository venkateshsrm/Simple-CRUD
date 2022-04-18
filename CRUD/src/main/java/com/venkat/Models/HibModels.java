package com.venkat.Models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.venkat.Entity.Users;

public class HibModels {
	
	SessionFactory factory = (SessionFactory) new Configuration()
			                .configure("hibernate.cfg.xml")
			                .addAnnotatedClass(Users.class)
			                .buildSessionFactory();
			
 Session session  = factory.getCurrentSession();
 
public Users addusers(Users user) {
	//Users user1 = new Users();
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();
	return user;
}

public List<Users> list() {
	 Session session  = factory.getCurrentSession();
	 session.beginTransaction();
	 List<Users> list = session.createQuery("from Users").getResultList();
	 session.getTransaction().commit();
	return list;
}

public Users Update(Users update) {
	 Session session  = factory.getCurrentSession();
	 session.beginTransaction();
	 //List<Users> list = session.createQuery("from Users").getResultList();
	 session.update(update);
	 session.getTransaction().commit();
	return update;
}

public void Deleteuser(Users deluser) {
	 Session session  = factory.getCurrentSession();
	 session.beginTransaction();
	 //List<Users> list = session.createQuery("from Users").getResultList();
	 session.delete(deluser);
	 session.getTransaction().commit();
	
}
	
}
