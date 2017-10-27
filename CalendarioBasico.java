
/**
 * This basic calendar allows you to set the day, the month and year, 
 * return its value and can advance one day with a method.
 * 
 * Note: Some things stay in Spanish by exercise requirement.
 * 
 * @author (Daniel Carmenes Alvarez) 
 * @version (2017/10/27)
 */
public class CalendarioBasico
{
    // Save the day.
    private int day;
    // Save the month.
    private int month;
    // Save the year.
    private int year;
    
    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        // There is no world before 2000.
        year = 2001;
    }

    /**
     * Returns date in format (dd-mm-yy) with 8 characters. 
     */
    public String obtenerFecha ()
    {
        String noNumDay = String.valueOf(day);
        String noNumMonth = String.valueOf(month);
        String noNumYear = String.valueOf(year);
        // If the day has only one character, put a zero before day.
        if (noNumDay.length() < 2)
        {
            noNumDay = "0" + String.valueOf(day);
        }
        // If the month has only one character, put a zero before day.
        if (noNumMonth.length() < 2)
        {
            noNumMonth = "0" + String.valueOf(month);
        }
        return noNumDay + "-" + noNumMonth + "-" + noNumYear.substring(2,4);
    }
    
    /**
     * Allows you to assign a specific date.
     * Note: There are no control methods to validate data entry.
     */
    public void fijarFecha (int setDay, int setMonth, int setYear) 
    {
        day = setDay;
        month = setMonth;
        year = setYear;
    }
    
    /**
     * Advance one day the date.
     * Did anyone mention the T.A.R.D.I.S?
     */
    public void avanzarDia ()
    {
        if (day == 30)
        {
            day = 01;
            if (month == 12) 
            {
                month = 01;
                year += 1;                
            }
            else 
            {
                month += 1;
            }
        }
        else 
        {
            day += 1;
        }
    }    
}
