import java.util.ArrayList;

public class Result{

	public static void result() { // подвожу итог битвы
	   System.out.println("Amount of dead aborigines is " + Aborigine.getAmountOfDeadAborigines() + "\nAmount of captive aborigines is " + Aborigine.getAmountOfCaptiveAborigines() + "\nAmount of dead policemans is " + Policeman.getAmountOfDeadPolicemans());
       
       World.getTeam1().forEach(a -> Result.checkAlive(a)); // получаю массив всех аборигенов с помощью getTeam1(), для этого массива выполняю метод forEach, с помощью которого для каждого элемента из массива выполняю метод checkAlive(), он расписан дальше
       switch(namesOfAliveAborigines.size()){
         case 0 :
         	break;
         case 1 :
         	System.out.println(String.join(", ", namesOfAliveAborigines) + " is alive. But it won't last long"); // метод join(разделитель, строки) соединяет строки и возвращает string 
         	break;
         default:
         	System.out.println(String.join(", ", namesOfAliveAborigines) + " are alive. But it won't last long");
         	break;
       }
       

       World.getTeam2().forEach(p -> Result.checkAlive(p)); // то же самое для второй команды
       switch(namesOfAlivePolicemans.size()){
         case 0 :
         	break;
         case 1 :
         	System.out.println(String.join(", ", namesOfAlivePolicemans) + " is alive. He is hero");
         	break;
         default:
         	System.out.println(String.join(", ", namesOfAlivePolicemans) + " are alive. They are heroes");
         	break;
       }
	}

	private static ArrayList<String> namesOfAlivePolicemans = new ArrayList<String>(); // создаю массив из имен живых полицейских

	private static void checkAlive(Policeman p){ //проверяю статус полицейского и вношу его имя в массив
		if (p.getStat() == Status.ALIVE) {
           namesOfAlivePolicemans.add(p.getName());
		}
    }
    
    private static ArrayList<String> namesOfAliveAborigines = new ArrayList<String>(); // создаю массив из имен живых аборигенов

	private static void checkAlive(Aborigine a){ //проверяю статус аборигена и вношу его имя в массив
		if (a.getStat() == Status.ALIVE) {
           namesOfAliveAborigines.add(a.getName());
		}
    }

    

}