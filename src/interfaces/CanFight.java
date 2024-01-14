package interfaces;

import humans.Human;
import war.Weapons;

import java.util.Random;

public interface CanFight<T extends Human>{
    default Weapons chooseWeapon(){
        Weapons[] weapons = Weapons.values();
        return weapons[new Random().nextInt(weapons.length)];
    }
    void takeWeapon(Weapons weapon);
    void hit(T t);
}
