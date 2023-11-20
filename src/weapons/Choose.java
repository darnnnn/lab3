package weapons;
import java.util.Random;
public class Choose{
    public Weapons random(){
        Weapons[] weapons = Weapons.values();
        return weapons[new Random().nextInt(weapons.length)];
    }
}