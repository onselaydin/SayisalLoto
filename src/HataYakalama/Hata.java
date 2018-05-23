package HataYakalama;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Hata {

	public static void main(String[] args) {
		try {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.sayýyý girin:");
            double bolunen=sc.nextDouble();
            System.out.println("2.sayýyý girin:");
             double bolen=sc.nextDouble();
             double sonuc=bolunen/bolen;
            System.out.println("Sonuç="+sonuc);
     } catch (InputMismatchException hata1) {
            System.out.println("Lütfen sadece sayý giriniz.");
     }
     catch(ArithmeticException hata2)
     {
           System.out.println("Bölen sayý 0 olamaz");
     }
     finally{                  
           System.out.println("Ýþlem sonlandý.");
     }

	}

}
