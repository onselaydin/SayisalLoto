package Sayisal;

import java.util.ArrayList;
import java.util.Collections;

public class Loto {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
        for (int i=1; i<50; i++) { //1'den 49'a kadar olan say�lar� listele
            list.add(i);
        }    
        System.out.println(list);
        Collections.shuffle(list); //49 say�y� kar��t�r
        System.out.println(list);  //say�lar�n kar���k halini listele
        System.out.println("\n");
        
        int k =1;
        for (int b=0; b<8; b++) {  //8 kolon olmal�
            System.out.println("Kolon: " + k); //kolon numaras�n� yazd�r
                for (int a=0; a<6; a++) {  //her bir kolon i�in s�rayla 6 tane say� se�
                    System.out.print(list.get(0)+"  "); //se�ilen say�y� (s�rayla) yazd�r
                    list.remove(0); //se�ilen say�y�, listeden ��kar
                }
                if (b==7) { //son kolonun alt�na, d��ar�da kalan say�y� yazd�r
                    System.out.println("\n");
                    System.out.println("Kullanilmayan Sayi: " + list);
                    
                }
            System.out.println(" ");                    
            k++;  //sonraki kolona ge�mek i�in, de�i�ken numaras�n� 1 artt�r

        }

	}

}
