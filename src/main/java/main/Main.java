package main;

import java.io.File;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import utils.ConfigManager;
import utils.commands.MessageManager;

public class Main {
	
	private static DiscordApi api;
	private static ConfigManager manager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manager = new ConfigManager(new File(System.getProperty("user.dir"),"config.toml"));
		
		api = new DiscordApiBuilder().setToken(manager.getToml().getString("bot.token")).login().join();
		
		api.addMessageCreateListener(MessageManager::create);

	}
	
	public static ConfigManager getConfigManager() {
		return manager;
	}

}
