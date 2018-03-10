package me.noeffort.main;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.noeffort.main.command.HelpCommand;
import me.noeffort.main.command.InfoCommand;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	@Override
	public void onEnable() {
		getLogger().info("Plugin Enabled! " + getVersion());
		registerCommands();
	}
	
	public void registerCommands() {
		this.getCommand("help").setExecutor(new HelpCommand(this));
		this.getCommand("info").setExecutor(new InfoCommand(this));
	}
	
	public String getVersion() {
		PluginDescriptionFile pdf = this.getDescription();
		return pdf.getVersion();
	}
	
	public static Main get() {
		return instance;
	}

}
