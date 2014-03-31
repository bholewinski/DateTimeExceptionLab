package Lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ben Holewinski
 */
public class DateService {
    private Date date1 = new Date();
    private Calendar date2 = Calendar.getInstance();
    private final String MYDATESTRING = "M/dd/yyyy";
    private final String MYCALENDARSTRING = "MMM dd, yyyy hh:mm a";
    private SimpleDateFormat stringToDate = new SimpleDateFormat(MYDATESTRING);
    private SimpleDateFormat stringToCalendar = new SimpleDateFormat(MYCALENDARSTRING);
    
    public void SimpleDateStringToDateObject(String s) {
        try {
            date1 = stringToDate.parse(s);
            System.out.println(date1);
        } catch (ParseException ex) {
            
        }
    }
    
    public void ExtendedDateStringToCalendarObject(String s) {
        try {
            date1 = stringToCalendar.parse(s);
            date2.setTime(date1);
            System.out.println(date2);
        } catch (ParseException ex) {
            
        }         
    }
}
