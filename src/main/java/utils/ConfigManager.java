package utils;

import java.io.File;

import com.moandjiezana.toml.Toml;

public class ConfigManager {
	
	private Toml toml;
	
	public ConfigManager(File file) {
		this.toml = new Toml().read(file);
	}
	
	public Toml getToml() {
		return this.toml;
	}
	
	public void setToml(Toml toml) {
		this.toml = toml;
	}

}
