package utils.commands;

import java.awt.Color;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class CommandPing implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		
		EmbedBuilder builder = new EmbedBuilder();
		builder.setTitle("Pinging...").setColor(Color.ORANGE);
		
		event.getChannel().sendMessage(builder).thenAccept((message)->{
			long unixBot = message.getCreationTimestamp().toEpochMilli();
			long unixUser = event.getMessage().getCreationTimestamp().toEpochMilli();
			long delta = unixBot-unixUser;
			
			builder.setTitle("Pong !").setColor(Color.GREEN).setDescription("Time : "+String.valueOf(delta)+" ms.");
			
			message.edit(builder);
		});
	}

}
