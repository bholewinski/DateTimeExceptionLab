package Lab1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ben Holewinski
 */
public class Invoice {
    Calendar invoiceDate = Calendar.getInstance();
    private int gracePeriod = 15;
    Calendar dueDate;
    
    public void getDueDateAsCalendar() {
        setDueDate(invoiceDate);
        dueDate.add(Calendar.DATE, gracePeriod);
        System.out.println(dueDate);
    }
    
    public void getDueDateAsString() {
        Date date1;
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        date1 = dueDate.getTime();
        String s = df.format(date1);
        
        System.out.println(s);
    }

    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }
    
    
}
