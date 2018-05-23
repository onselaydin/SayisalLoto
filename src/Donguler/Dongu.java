package Donguler;

public class Dongu {

	public static void main(String[] args) {
		int nums[]={7,3,12,4,14,4,1,8};
        int aranan=4;
        boolean durum=false;
        for(int x:nums){
               if(x==aranan)
               {
                      durum=true;
                      break;
               }
        }

        if(durum)
        System.out.println("Deðer bulundu.");
        else
        System.out.println("Dðer bulunamadý.");

	}

}
