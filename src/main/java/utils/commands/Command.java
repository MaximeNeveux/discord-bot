package utils.commands;

public class Command {
	
	private String id, description;
	private String[] aliases;
	private CommandExecutor executor;
	
	public Command(String id, String description, CommandExecutor executor, String... aliases) {
		super();
		this.id = id;
		this.description = description;
		this.aliases = aliases;
		this.executor = executor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getAliases() {
		return aliases;
	}

	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}

	public CommandExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(CommandExecutor executor) {
		this.executor = executor;
	}
	

}
