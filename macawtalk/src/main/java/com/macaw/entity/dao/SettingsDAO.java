package com.macaw.entity.dao;

import java.util.List;
import com.macaw.entity.Settings;

public interface SettingsDAO {
	public void saveSettings(Settings settings);
	public List<Settings> findSettings(String where, String... whereArgs);
	public Settings findSettingsById(int id);
	public void updateSettings(Settings settings);
	public void removeSettings(Settings settings);
}
