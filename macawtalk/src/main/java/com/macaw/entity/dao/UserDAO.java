package com.macaw.entity.dao;

import java.util.List;
import java.util.ListIterator;

import javassist.bytecode.Descriptor.Iterator;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.macaw.entity.User;

public class UserDAO {
	@Resource
	private SessionFactory sessionFactory;
	
	public List<User> queryUserList(String[] columns)
	{
		String selection = "";
		for(String str : columns){
			selection.concat(str + ",");
		}
		Query query = sessionFactory.openSession().createSQLQuery("SELECT " + selection.trim() + " FROM User");
		return query.list();
	}
	
	public List<User> queryUserList(String[] columns, String where, String... whereArgs)
	{
		String selection = "";
		for(String str : columns){
			selection.concat(str + ",");
		}
		String[] whereArray = where.split("?");
		String whereClause = "";
		for(int i=0; i<whereArgs.length; i++){
			whereClause += whereArray[i] + "'" + whereArgs[i] + "'";
		}
		Query query = sessionFactory.openSession().createSQLQuery("SELECT " + selection.trim() + " FROM User WHERE " + whereClause);
		return query.list();
	}

	public void insertUser(User user)
    {
//        String sql = "INSERT INTO User (username, password, email1, email2, nickname, secretqes, secretans, sex, country, tel, mobile, address, vocation, profile, regtime) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//		
//        Query query = sessionFactory.openSession().createSQLQuery();
//        query.executeUpdate();
//        sessionFactory.openSession().close();
    }
     
}
