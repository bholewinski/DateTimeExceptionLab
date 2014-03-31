package Lab3;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ben Holewinski
 */
public class Startup {

    public static void main(String[] args) {
        DateService s = new DateService();
        String a = "3/15/2014";
        String b = "March 15, 2014 2:30 PM";
        
        if(a == null || a.length() <= 8) {
        try {
            s.SimpleDateStringToDateObject(a);
        } catch (ParseException ex) {
            
        }
        }
        
        if(b == null || a.length() <= 8) {
        try {
            s.ExtendedDateStringToCalendarObject(b);
        } catch (ParseException ex) {
            
        }
        }
    }
    
}
