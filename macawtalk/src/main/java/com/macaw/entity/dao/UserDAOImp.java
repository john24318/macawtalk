package com.macaw.entity.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.macaw.entity.User;

public class UserDAOImp implements UserDAO {
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        s.save(user);
        tx.commit();
        s.close();
	}

	@Override
	public List<User> findUser(String where, String... whereArgs) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		String[] whereArray = where.split("?");
		String whereClause = "";
		for(int i=0; i<whereArgs.length; i++){
			whereClause.concat(whereArray[i] + "'" + whereArgs[i] + "'");
		}
		Query query = s.createSQLQuery("SELECT * FROM user WHERE " + whereClause); 
        s.close();
        return query.list();
	}

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Query query = s.createSQLQuery("SELECT * FROM user WHERE username='" + username + "'");
		User user = (User)query.uniqueResult();
        s.close();
        return user;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();  
        Transaction tx = s.beginTransaction();  
        s.update(user);  
        tx.commit();  
        s.close(); 
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();  
        Transaction tx = s.beginTransaction();  
        s.delete(user);  
        tx.commit();  
        s.close();  
	}
}
