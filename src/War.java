public class War{
	public static void start(){ // метод для начала войны
    if ( World.getTeam1().size() != World.getTeam2().size() ){ // в бою будет сражаться i-ым элемент из 1 массива с i-ым элементом из 2 массива, поэтому команды должны быть равны
  	  System.out.println("You have created unequal teams. You can't start a war"); 
    } else{
  	  for (int i=0; i < World.getTeam1().size(); i++){ // тк размеры массивов команд равны, без разницы на размер какого массива делать цикл
  	  	     Stop.stop(); // для красивого вывода
		     (World.getTeam1().get(i)).takeWeapon(Weapons.randomWeapon()); // i-ый элемент из 1 и 2 массивов берут рандомное оружие
		     (World.getTeam2().get(i)).takeWeapon(Weapons.randomWeapon());
		     if (Math.random() <= 0.5) { // шанс начать драку у каждого 50%
			   (World.getTeam1().get(i)).startFight(World.getTeam2().get(i));
		     } else {
			   (World.getTeam2().get(i)).startFight(World.getTeam1().get(i));
			   }
			}
			Stop.stop();
			World.setLocation(Locations.POLICE_STATION); // когда война закончилась, меняем локацию на полицейский участок
			Result.result(); // делаем итог битвы
	  }
	}
}