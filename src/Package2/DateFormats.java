package Package2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {

	public static void main(String[] args) {
		
		Date date1 = new Date();   // current date & time
        System.out.println(date1);
        
        //-------------------------------
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date1));
        
        //-------------------------------
        
        String oldDateStr = "25/09/2025";  // original date string
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // 1. Parse the old string into a Date object
            Date date = oldFormat.parse(oldDateStr);

            // 2. Format the Date object into new string format
            String newDateStr = newFormat.format(date);

            System.out.println("Old format: " + oldDateStr);
            System.out.println("New format: " + newDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
	}

}
