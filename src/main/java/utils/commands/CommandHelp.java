package utils.commands;

import java.util.Arrays;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class CommandHelp implements CommandExecutor {
	
	private static CommandRegistry registry;

	public CommandHelp(CommandRegistry registry) {
		// TODO Auto-generated constructor stub
		super();
		CommandHelp.registry = registry;
	}

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		EmbedBuilder embed = new EmbedBuilder().setTitle("A l'aide");
		embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
		for (Command c : registry.getCommands()) {
			embed.addField(c.getId(), "Alias : "+Arrays.toString(c.getAliases()).substring(1,Arrays.toString(c.getAliases()).length()-1)+"\nDescription : "+c.getDescription());
		}
		event.getChannel().sendMessage(embed);

	}

	public CommandRegistry getRegistry() {
		return CommandHelp.registry;
	}
	
	public void setRegistry(CommandRegistry registry) {
		CommandHelp.registry = registry;
	}
	
}
