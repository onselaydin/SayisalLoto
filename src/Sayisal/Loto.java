package Sayisal;

import java.util.ArrayList;
import java.util.Collections;

public class Loto {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
        for (int i=1; i<50; i++) { //1'den 49'a kadar olan sayýlarý listele
            list.add(i);
        }    
        System.out.println(list);
        Collections.shuffle(list); //49 sayýyý karýþtýr
        System.out.println(list);  //sayýlarýn karýþýk halini listele
        System.out.println("\n");
        
        int k =1;
        for (int b=0; b<8; b++) {  //8 kolon olmalý
            System.out.println("Kolon: " + k); //kolon numarasýný yazdýr
                for (int a=0; a<6; a++) {  //her bir kolon için sýrayla 6 tane sayý seç
                    System.out.print(list.get(0)+"  "); //seçilen sayýyý (sýrayla) yazdýr
                    list.remove(0); //seçilen sayýyý, listeden çýkar
                }
                if (b==7) { //son kolonun altýna, dýþarýda kalan sayýyý yazdýr
                    System.out.println("\n");
                    System.out.println("Kullanilmayan Sayi: " + list);
                    
                }
            System.out.println(" ");                    
            k++;  //sonraki kolona geçmek için, deðiþken numarasýný 1 arttýr

        }

	}

}
