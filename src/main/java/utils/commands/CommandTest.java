package utils.commands;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class CommandTest implements CommandExecutor {

	@Override
	public void run(MessageCreateEvent event, Command command, String[] args) {
		// TODO Auto-generated method stub
		EmbedBuilder embed = new EmbedBuilder().setTitle("Test Embed").setDescription("Ceci est un test d'embed");
		embed.setAuthor("Demandé par : "+event.getMessageAuthor().getDisplayName().toString());
		embed.addField("Field 1", "Ceci est un field supplementaire");
		embed.addField("Field 2", "Ceci est un field supplementaire encore", true);
		embed.addField("Field 3", "Ceci est un field supplementaire toujours", true);
		event.getChannel().sendMessage(embed);
	}

}
