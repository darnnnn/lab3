package war;
import java.lang.Thread;
public class MyThread{
	public static void stop(){
	  try {
        Thread.sleep(2000);
        System.out.println("");
      } catch (InterruptedException e) { 
        e.printStackTrace();
      }
	}
}