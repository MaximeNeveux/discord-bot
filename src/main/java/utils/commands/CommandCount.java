package utils.commands;

import org.javacord.api.event.message.MessageCreateEvent;

public class CommandCount implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		event.getChannel().sendMessage(String.valueOf(args.length));
		
	}

}
