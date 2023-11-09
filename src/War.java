public class War{
	public static void start(){ // метод для начала войны
    if ( Team1.get().size() != Team2.get().size() ){ // в бою будет сражаться i-ым элемент из 1 массива с i-ым элементом из 2 массива, поэтому команды должны быть равны
  	  System.out.println("You have created unequal teams. You can't start a war"); 
    } else{
  	  for (int i=0; i < Team1.get().size(); i++){ // тк размеры массивов команд равны, без разницы на размер какого массива делать цикл
  	  	     Stop.stop(); // для красивого вывода
		     (Team1.get().get(i)).takeWeapon(Weapons.randomWeapon()); // i-ый элемент из 1 и 2 массивов берут рандомное оружие
		     (Team2.get().get(i)).takeWeapon(Weapons.randomWeapon());
		     if (Math.random() <= 0.5) { // шанс начать драку у каждого 50%
			   (Team1.get().get(i)).startFight(Team2.get().get(i));
		     } else {
			   (Team2.get().get(i)).startFight(Team1.get().get(i));
			   }
			}
			Stop.stop();
			World.setLocation(Locations.POLICE_STATION); // когда война закончилась, меняем локацию на полицейский участок
			Result.result(); // делаем итог битвы
	  }
	}
}