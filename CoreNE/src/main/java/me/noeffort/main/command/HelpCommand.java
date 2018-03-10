package me.noeffort.main.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.noeffort.main.Main;
import me.noeffort.main.Messages;
import me.noeffort.main.util.MessageUtil;

public class HelpCommand implements CommandExecutor {
	
	private final Main plugin;
	
	public HelpCommand(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.isOp()) {
				sender.sendMessage(MessageUtil.translate(Messages.helpop));
			} else {
				sender.sendMessage(MessageUtil.translate(Messages.helpdefault));
			}
		} else {
			sender.sendMessage(Messages.player);
			return true;
		}
		return true;
	}

}
