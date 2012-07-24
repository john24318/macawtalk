package com.macaw.service;

import java.util.List;
import com.macaw.entity.Settings;
import com.macaw.entity.dao.SettingsDAO;

public class SettingsService {
	private SettingsDAO dao;
	
	public SettingsService()
	{
		dao = new SettingsDAO();
	}
	
	public List<Settings> getLanguageList(){
		return dao.querySettingsList(new String[]{"setname","setdesc"},"setkey=?","Language");
	}
}
