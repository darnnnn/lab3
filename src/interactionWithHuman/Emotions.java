package interactionWithHuman;
public enum Emotions{
	FEAR("fear."),
	STUPOR("stupor."),
	COURAGE("courage.");
	private final String emotion;

	Emotions(String emotion){
		this.emotion = emotion;
	}

	@Override
	public String toString(){
		return this.emotion;
	}
}