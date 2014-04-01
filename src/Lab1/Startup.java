package Lab1;

/**
 * @author Ben Holewinski
 */
public class Startup {

    public static void main(String[] args) {
        Invoice i = new Invoice();
        
        i.calcDueDateAsCalendar();
        i.getDueDateAsString();
    }
    
}
