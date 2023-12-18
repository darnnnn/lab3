package interactionWithHuman;
public enum Emotions{
	FEAR("fear", -10),
	DEPRESSION("depression", -5),
	STUPOR("stupor", -5),
	COURAGE("courage", 20),
	HAPPINESS("happiness", 10);
	private final String emotion;
	private final int effect;

	Emotions(String emotion, int effect){
		this.emotion = emotion;
		this.effect = effect;
	}
	public int getEffect(){
		return effect;
	}

	@Override
	public String toString(){
		return this.emotion;
	}
}