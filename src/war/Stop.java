package war;

import java.lang.Thread;

public class Stop{ // класс для красивого вывода программы
	public void stop(){
	  try {
        Thread.sleep(2000); //  приостанавливаю выполнение текущего потока на 2 секунды 
      } catch (InterruptedException e) { 
        e.printStackTrace();
      }
    System.out.println("");  // пустая строка после битвы одного аборигена с одним полицейским для понятного вывода
	}
}