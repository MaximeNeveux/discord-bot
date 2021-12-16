package utils.commands;

import java.util.NoSuchElementException;

import org.javacord.api.audio.AudioConnection;
import org.javacord.api.audio.AudioSource;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

import audio.AudioSourceClass;

public class CommandPlay implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		EmbedBuilder embed = new EmbedBuilder().setTitle("La musique").setDescription("Ceci est une musique");
		embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
		event.getChannel().sendMessage(embed);
		try {
			event.getMessageAuthor().getConnectedVoiceChannel().get().connect();
			AudioConnection conn = event.getServer().get().getAudioConnection().get();
			System.out.println("b");
			AudioSourceClass src = new AudioSourceClass();
			System.out.println("c");
			conn.setAudioSource(src);
		} catch (NoSuchElementException e) {
			System.out.println("Catch no such elt exception");
		}
	}

}
