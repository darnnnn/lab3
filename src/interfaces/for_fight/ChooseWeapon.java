package interfaces.for_fight;

import war.Weapons;
import java.util.Random;

public interface ChooseWeapon {
    default Weapons chooseWeapon(){
        Weapons[] weapons = Weapons.values();
        return weapons[new Random().nextInt(weapons.length)];
    }
}
