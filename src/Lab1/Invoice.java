package Lab1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ben Holewinski
 */
public class Invoice {
    private Calendar invoiceDate;
    private int gracePeriod;
    private Calendar dueDate;

    //All initialization should occur in the constructor
    public Invoice() {
        invoiceDate = Calendar.getInstance();
        gracePeriod = 15;
    }
    
    public final void calcDueDateAsCalendar() {
        setDueDate(invoiceDate);
        dueDate.add(Calendar.DATE, gracePeriod);
        System.out.println(dueDate);
    }
    
    public final String getDueDateAsString() {
        Date date1;
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        date1 = dueDate.getTime();
        String s = df.format(date1);
        
        return s;
    }

    public final Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public final void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public final int getGracePeriod() {
        return gracePeriod;
    }

    public final void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public final Calendar getDueDate() {
        return dueDate;
    }

    public final void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }
    
    
}
