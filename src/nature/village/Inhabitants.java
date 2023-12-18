package nature.village;

public class Inhabitants {
    public void openDoor(Huts.Door door){
        door.setCondition(Condition.OPEN);
        System.out.printf("Hysterical inhabitants jumped out of %s huts to meet them.%n", door.huts().getAmount());
    }
    public void say(String phrase){
        System.out.printf("Inhabitants said: %s%n", phrase);
    }
}
