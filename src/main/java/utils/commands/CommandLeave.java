package utils.commands;

import java.util.NoSuchElementException;

import org.javacord.api.audio.AudioConnection;
import org.javacord.api.entity.channel.ServerVoiceChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class CommandLeave implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		EmbedBuilder embed = new EmbedBuilder();
		try {
			AudioConnection conn = event.getServer().get().getAudioConnection().get();
			ServerVoiceChannel voiceChan = event.getMessageAuthor().getConnectedVoiceChannel().get();
			long id = event.getApi().getClientId();
			boolean rightChannel = voiceChan.isConnected(id);
			if (rightChannel) {
				conn.close();
				embed.setTitle("Leaving.");
				embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
				event.getChannel().sendMessage(embed);
			} else {
				embed.setTitle("Tu dois être dans mon channel pour me déconnecter.");
				embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
				event.getChannel().sendMessage(embed);
			}
		} catch (NoSuchElementException e) {
			/*embed.setTitle("Non");
			embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
			embed.setDescription("JAMAIS JE PARTIRAI JAMAIS");
			event.getChannel().sendMessage(embed);*/
			
		}
		
	}

}
