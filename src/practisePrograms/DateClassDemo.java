package practisePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {
	
	public static void main(String[] args) {
		
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
