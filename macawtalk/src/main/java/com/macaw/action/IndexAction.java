package com.macaw.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.macaw.entity.Settings;
import com.macaw.service.SettingsService;
import com.opensymphony.xwork2.ActionSupport;

@Component("IndexAction")
public class IndexAction extends ActionSupport {
	/**
    *
    */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SettingsService settingsService;
	List<Settings> settingsList;
	
	public IndexAction() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("IndexAction created on " + df.format(new Date()));
	}
	
	public String index() {
		settingsList = settingsService.getLanguageList();
		return "success";
	}
	
	public List<Settings> getSettingsList() {
		return settingsList;
	}
}
