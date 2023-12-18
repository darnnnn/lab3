package humans;

import interactionWithHuman.Emotions;
import interfaces.Feel;
import interfaces.GetIntoTpansport;
import transport.Transport;

public class Squatter extends Human implements Feel, GetIntoTpansport {
    public Squatter(String name){
        super(name, 0, "unknown country");
    }
    public void feel(Emotions e){
        setHealth(getHealth()+e.getEffect());
        System.out.printf("%s feel %s.%n", getName(), e);
    }
    public void getIntoTpansport(Transport[] t){
        if (Math.random()<=0.33) t[0].fillUp(this);
        else if (Math.random()<=0.33) t[1].fillUp(this);
        else t[2].fillUp(this);
    }

}
