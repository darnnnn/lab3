package transport;
import java.sql.SQLOutput;
import java.util.ArrayList;
import humans.Human;

public class Car extends Transport {
    public void go(){
        if (!getNames().isEmpty())System.out.println(String.join(", ", getNames()) + " got into the car.");
    }
}
