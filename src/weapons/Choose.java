package weapons;
import java.util.Random;
public class Choose{
   private static Random r = new Random();
   public static Weapons randomWeapon(){ // метод, возвращающий рандомное оружие
      Weapons[] weapons = Weapons.values(); // создаю массив из возможных оружий, метод values() возвращает массив с константами enum Weapons
      return weapons[r.nextInt(weapons.length)]; // возвращаю рандомный элемент этого массива с помощью класса random и его метода nextInt, который возвращает рандомное int от нуля до переданного ему int значения(не включая это значение)
   }
}   