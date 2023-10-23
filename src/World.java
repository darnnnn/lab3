import java.util.ArrayList;

public class World implements Actions{ // класс делающий "глобальные" действия

	private Locations location; 
	private static ArrayList<Aborigine> team1 = new ArrayList<Aborigine>(); // массивы для войск аборигенов и полицейских 
	private static ArrayList<Policeman> team2 = new ArrayList<Policeman>();

	public static ArrayList<Aborigine> getTeam1(){
		return team1;
	}
    
    public static ArrayList<Policeman> getTeam2(){
		return team2;
	}

	public World(){
		setLocation(Locations.ISLAND); // действие в тексте начинается на острове, поэтому при создания мира локация автоматически остров
    }

	public void setLocation(Locations location){
		this.location = location;
		switch(location){
		case ISLAND:
            System.out.println("Aborigines jumping around the fire");
			break;
		case POLICE_STATION:	
            System.out.println("The journey was over and the aborigines were sent to the police station");
            break;
		}
	}

	public void createTeamOfAborigines(Aborigine...ab){ // метод для создания войск аборигенов
		for (Aborigine a: ab){
			team1.add(a);
		}
	}

	public void createTeamOfPolicemans(Policeman...po){ // метод для создания войск полицейских
		for (Policeman p: po){
			team2.add(p);
		}
	}

    public void startWar(){ // метод для начала войны
    if ( team1.size() != team2.size() ){ // в бою будет сражаться i-ым элемент из 1 массива с i-ым элементом из 2 массива, поэтому команды должны быть равны
  	  System.out.println("You have created unequal teams. You can't start a war"); 
    } else{
  	  for (int i=0; i < team1.size(); i++){ // тк размеры массивов команд равны, без разницы на размер какого массива делать цикл
  	  	     Stop.stop(); // для красивого вывода
		     (team1.get(i)).takeWeapon(Weapons.randomWeapon()); // i-ый элемент из 1 и 2 массивов берут рандомное оружие
		     (team2.get(i)).takeWeapon(Weapons.randomWeapon());
		     if (Math.random() <= 0.5) { // шанс начать драку у каждого 50%
			   (team1.get(i)).startFight(team2.get(i));
		     } else {
			   (team2.get(i)).startFight(team1.get(i));
			   }
			}
			Stop.stop();
			setLocation(Locations.POLICE_STATION); // когда война закончилась, меняем локацию на полицейский участок
			Result.result(); // делаем итог битвы
	  }
	}
  
}