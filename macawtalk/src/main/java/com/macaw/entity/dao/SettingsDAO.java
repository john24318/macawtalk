package com.macaw.entity.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.macaw.entity.Settings;

public class SettingsDAO {
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Settings> querySettingsList(String[] columns)
	{
		String selection = "";
		for(String str : columns){
			selection.concat(str + ",");
		}
		Query query = sessionFactory.openSession().createSQLQuery("select " + selection.trim() + " from Settings");
		sessionFactory.openSession().close();
		return query.list();
	}
	
	public List<Settings> querySettingsList(String[] columns, String where, String[] selectionArgs)
	{
		String selection = "";
		for(String str : columns){
			selection.concat(str + ",");
		}
		Query query = sessionFactory.openSession().createSQLQuery("select " + selection.trim() + " from Settings where " + where);//.setParameter();
		sessionFactory.openSession().close();
		return query.list();
	}
}
