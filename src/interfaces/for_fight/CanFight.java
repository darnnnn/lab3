package interfaces.for_fight;

import humans.Human;

public interface CanFight<T extends Human> extends ChooseWeapon, TakeWeapon, Hit<T> {
}
