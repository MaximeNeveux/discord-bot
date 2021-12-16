package utils.commands;

import java.util.Arrays;

import org.javacord.api.event.message.MessageCreateEvent;

import main.Main;

public class MessageManager {
	
	private static final String PREFIX = Main.getConfigManager().getToml().getString("bot.prefix");
	
	private static CommandRegistry registry = new CommandRegistry();
	
	public static void create(MessageCreateEvent event) {
		
		if (event.getMessageContent().startsWith(PREFIX)) {
			String[] args = event.getMessageContent().split(" ");
			
			String commandName = args[0].substring(PREFIX.length());
			args = args.length == 1 ? new String[0] : Arrays.copyOfRange(args, 1, args.length);
			
			String[] finalArgs = args;
			
			registry.getByAlias(commandName).ifPresent((cmd) -> {
				cmd.getExecutor().run(event, cmd, finalArgs);
			});
		}
	}
	
	static {
		registry.addCommand(new Command(
				"ping",
				"Pings the bot",
				new CommandPing(),
				"ping","p?")
				);
		registry.addCommand(new Command(
				"count",
				"Compte enculé",
				new CommandCount(),
				"count")
				);
		registry.addCommand(new Command(
				"test-embed",
				"On test les embeds",
				new CommandTest(),
				"test","embed")
				);
		registry.addCommand(new Command(
				"connect",
				"Connexion à un voice channel",
				new CommandConnect(),
				"connect","start")
				);
		registry.addCommand(new Command(
				"help",
				"Affichage de toutes les commandes",
				new CommandHelp(registry),
				"help","h")
				);
		registry.addCommand(new Command(
				"leave",
				"Quitte le channel vocal",
				new CommandLeave(),
				"leave","quit")
				);
		registry.addCommand(new Command(
				"play",
				"Joue un truc (peut etre on sait pas)",
				new CommandPlay(),
				"play","p")
				);
	}

}
