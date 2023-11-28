package transport;

public class Waggon extends Transport {
    public void go(){
        if (!getNames().isEmpty()) System.out.println(String.join(", ", getNames()) + " got into the waggon.");
    }
}
