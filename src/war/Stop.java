package war;

import java.lang.Thread;

public class Stop{ 
	public void stop(){
	  try {
        Thread.sleep(2000); //  приостанавливаю выполнение текущего потока на 2 секунды 
      } catch (InterruptedException e) { 
        e.printStackTrace();
      }
    System.out.println("");  
	}
}