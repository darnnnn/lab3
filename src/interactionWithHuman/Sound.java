package interactionWithHuman;
public class Sound{
	private final String source;
	public Sound(String source){
		this.source = source;
	}
	@Override
	public String toString() {
		return "sound from " + source;
	}
}