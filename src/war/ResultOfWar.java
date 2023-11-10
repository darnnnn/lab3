package war;

import java.util.ArrayList;
import humans.*;
import teams.*;

public class ResultOfWar{

  private ArrayList<String> namesOfAlivePolicemans = new ArrayList<String>(); 
  private ArrayList<String> namesOfAliveAborigines = new ArrayList<String>(); 

  private void checkAlive(Policeman p){ 
    if (p.getStat() == Status.ALIVE) {
      namesOfAlivePolicemans.add(p.getName());
    }
  }

  private void checkAlive(Aborigine a){ 
    if (a.getStat() == Status.ALIVE) {
      namesOfAliveAborigines.add(a.getName());
    }
  }

	public void result() { 
	   System.out.println("Amount of dead aborigines is " + Team1.getAmountOfDeadAborigines() + "\nAmount of captive aborigines is " + Team1.getAmountOfCaptiveAborigines() + "\nAmount of dead policemans is " + Team2.getAmountOfDeadPolicemans());
       
       Team1.get().forEach(a -> checkAlive(a)); // получаю массив всех аборигенов с помощью getTeam1(), для этого массива выполняю метод forEach, с помощью которого для каждого элемента из массива выполняю метод checkAlive()
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
       
       Team2.get().forEach(p -> checkAlive(p)); 
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
}