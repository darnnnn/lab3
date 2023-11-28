package transport;
public class Car extends Transport {
    public void go(){
        if (!getNames().isEmpty())System.out.println(String.join(", ", getNames()) + " got into the car.");
    }
}
