package humans;

import interactionWithHuman.Emotions;
import interfaces.Feel;
import interfaces.GetIntoTpansport;
import transport.Car;
import transport.Waggon;

public class Squatter extends Human implements Feel, GetIntoTpansport {
    public Squatter(String name){
        super(name, 0, "unknown country");
    }
    public void feel(Emotions e){
        System.out.println(getName() + " feel " + e.toString());
    }
    public void getIntoTpansport(Car car, Waggon w1, Waggon w2){
        if (Math.random()<=0.33) car.fillUp(this);
        else if (Math.random()<=0.33) w1.fillUp(this);
        else w2.fillUp(this);
    }

}
