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
		Query query = sessionFactory.openSession().createSQLQuery("SELECT " + selection.trim() + " FROM Settings");
		return query.list();
	}
	
	public List<Settings> querySettingsList(String[] columns, String where, String... whereArgs)
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
		Query query = sessionFactory.openSession().createSQLQuery("SELECT " + selection.trim() + " FROM Settings WHERE " + whereClause);
		return query.list();
	}
}
