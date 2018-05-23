package TarihSaat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class test {

	public static void main(String[] args) {
		
		SimpleDateFormat bicim=new SimpleDateFormat("dd/M/yyyy");
		Date tarih=new Date();
		System.out.println(bicim.format(tarih));
		
		SimpleDateFormat bicim2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Date tarihSaat=new Date();
		System.out.println(bicim2.format(tarihSaat)); 
		
		
		String aylar[]={"Ocak","Şubat","Mart","Nisan","May�s","Haziran","Temmuz","A�ustos","Eylül","Ekim","Kasım","Aralık"};
		Calendar simdi=Calendar.getInstance();
		System.out.println(aylar[simdi.get(Calendar.MONTH)]); // Agustos
		System.out.println(simdi.get(Calendar.DATE));         // 24
		System.out.println(simdi.get(Calendar.YEAR));         // 2014
		System.out.println(simdi.get(Calendar.HOUR));         // 2
		System.out.println(simdi.get(Calendar.MINUTE));       // 12
		System.out.println(simdi.get(Calendar.SECOND));
		
		SimpleDateFormat bicim3=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		GregorianCalendar gcalender=new GregorianCalendar();
		System.out.println(bicim3.format(gcalender.getTime()));

	}

}
