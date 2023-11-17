package nature;
public class Monolith{
	private String material;
	private int height;
    public Monolith(String material, int height) {
        this.material = material;
        this.height = height;
        System.out.println(height + "-foot tall " + material + " monolith towered above them");
    }
}