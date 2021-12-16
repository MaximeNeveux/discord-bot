package utils.commands;

import java.util.NoSuchElementException;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class CommandConnect implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		
		EmbedBuilder embed = new EmbedBuilder().setTitle("Voice channel : ");
		embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
		try {
			embed.setDescription(event.getMessageAuthor().getConnectedVoiceChannel().get().getName());
			event.getMessageAuthor().getConnectedVoiceChannel().get().connect();
		} catch (NoSuchElementException e) {
			embed.setDescription("Vous devez être connecté dans un voice channel pour utiliser le bot.");
		}
		event.getChannel().sendMessage(embed);

	}

}
