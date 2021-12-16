package utils.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class CommandRegistry {
	
	private ArrayList<Command> commands;
	
	public CommandRegistry() {
		this.commands = new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void removeCommand(String id) {
		this.commands.removeIf((cmd) -> cmd.getId().equalsIgnoreCase(id));
	}
	
	public Optional<Command> getByAlias(String alias){
		for (Command command : this.commands) {
			if(Arrays.asList(command.getAliases()).contains(alias)) {
				return Optional.of(command);
			}
		}
		
		return Optional.empty();
	}
	
	public ArrayList<Command> getCommands(){
		return this.commands;
	}

}
