package nature.swamp;
public class Monolith{
	private final String material;
	private final int height;
    public Monolith(String material, int height) {
        this.material = material;
        this.height = height;
    }
    public void riseUp(){
        System.out.printf("%s-foot tall %s monolith towered above them.%n", height, material);
    }
}