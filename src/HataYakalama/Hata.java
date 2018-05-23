package HataYakalama;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Hata {

	public static void main(String[] args) {
		try {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.say�y� girin:");
            double bolunen=sc.nextDouble();
            System.out.println("2.say�y� girin:");
             double bolen=sc.nextDouble();
             double sonuc=bolunen/bolen;
            System.out.println("Sonu�="+sonuc);
     } catch (InputMismatchException hata1) {
            System.out.println("L�tfen sadece say� giriniz.");
     }
     catch(ArithmeticException hata2)
     {
           System.out.println("B�len say� 0 olamaz");
     }
     finally{                  
           System.out.println("��lem sonland�.");
     }

	}

}
