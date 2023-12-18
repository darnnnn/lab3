package interactionWithHuman;
public class Sound{
	private final String description;
	public Sound(String description){
		this.description = description;
	}
	@Override
	public String toString() {
		return String.format("sound %s", description);
	}
}