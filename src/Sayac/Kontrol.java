package Sayac;
import java.util.Timer;
import java.util.TimerTask;
public class Kontrol {

	static int sayac=0;
	public static void main(String[] args) {
		
		Timer myTimer=new Timer();
        TimerTask gorev =new TimerTask() {

               @Override
               public void run() {
                      System.out.println("Merhaba");
                      sayac++;
                      if(sayac==5)
                             myTimer.cancel();
               }
        };

        myTimer.schedule(gorev,0,3000);
        
        
	}

}
