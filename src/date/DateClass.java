package date;


import java.text.SimpleDateFormat;
import java.util.*;

public class DateClass {

		public static void main(String[] args) {
			
			Date d= new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String dateformat=formatter.format(d);
			System.out.println(dateformat);
			
			
			formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(formatter.format(d));
			
			formatter = new SimpleDateFormat("dd MMMM yyyy");
			System.out.println(formatter.format(d));
			
			
			
			
			/*Date d1 = new Date(2000, 11, 21);
			Date d= new Date();
			if(d.after(d1)){
				System.out.println("True");
			} else{
				System.out.println("False");
			}		
			System.out.println(d1);
			System.out.println(d);*/
		}
}
