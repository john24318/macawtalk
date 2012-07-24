package com.macaw.entity.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.macaw.entity.Settings;

public class SettingsDAOImp implements SettingsDAO {
	
	@Override
	public void saveSettings(Settings settings) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        s.save(settings);
        tx.commit();
        s.close();
	}

	@Override
	public List<Settings> findSettings(String where, String... whereArgs) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		String[] whereArray = where.split("?");
		String whereClause = "";
		for(int i=0; i<whereArgs.length; i++){
			whereClause.concat(whereArray[i] + "'" + whereArgs[i] + "'");
		}
		Query query = s.createSQLQuery("SELECT * FROM settings WHERE " + whereClause); 
        s.close();
        return query.list();
	}

	@Override
	public Settings findSettingsById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Settings settings = (Settings)s.get(Settings.class, id);
        s.close();
        return settings;
	}

	@Override
	public void updateSettings(Settings settings) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();  
        Transaction tx = s.beginTransaction();  
        s.update(settings);  
        tx.commit();  
        s.close(); 
	}

	@Override
	public void removeSettings(Settings settings) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();  
        Transaction tx = s.beginTransaction();  
        s.delete(settings);  
        tx.commit();  
        s.close();  
	}
}
