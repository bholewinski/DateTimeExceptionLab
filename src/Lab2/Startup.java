package Lab2;

/**
 * @author Ben Holewinski
 */
public class Startup {

    public static void main(String[] args) {
        DateService s = new DateService();
        
        s.SimpleDateStringToDateObject("3/15/2014");
        
        s.ExtendedDateStringToCalendarObject("March 15, 2014 2:30 PM");
    }
    
}
