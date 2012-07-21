package com.macaw.service;

import java.util.List;
import com.macaw.entity.Settings;
import com.macaw.entity.dao.SettingsDAO;
import com.macaw.entity.dao.SettingsDAOImp;

public class SettingsService {
	private SettingsDAO dao;
	
	public SettingsService()
	{
		dao = new SettingsDAOImp();
	}
	
	public List<Settings> getLanguageList(){
		return dao.findSettings("setkey=?", "Language");
	}
}
