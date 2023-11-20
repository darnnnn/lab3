package nature;
public class Monolith{
	private final String material;
	private final int height;
    public Monolith(String material, int height) {
        this.material = material;
        this.height = height;
        System.out.println(height + "-foot tall " + material + " monolith towered above them");
    }
}