
/**
 * This basic calendar return the date, 
 * allow to change the date by 
 * user input or advance it one day.
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
     * Constructor for objects of class BasicCalendar.
     */
    public CalendarioBasico()
    {
        day = 01;
        month = 01;
        // There is no world before 2000.
        year = 01;
    }

    /**
     * Returns date in format (dd-mm-yy) with 8 characters. 
     */
    public String getDate ()
    {
        String date = (day+100) + "-" + (month+100) + "-" + (year+100); 
        date = date.substring(1,4) 
               + date.substring(5,8) 
               + date.substring(9,11);
        return date;
    }
    
    /**
     * Set a specific date.
     * Note: There are no control methods to validate data entry.
     */
    public void setDate (int setDay, int setMonth, int setYear) 
    {
        day = setDay;
        month = setMonth;
        // How we only want to store two numbers
        // and the value is between 2000 - 2099
        // we subtract 2000 to the input.
        year = setYear - 2000;
    }
    
    /**
     * Add one day to the date.
     * 
     * Who needs a T.A.R.D.I.S.?
     */
    public void addOneDay ()
    {
        // Check if adding a day changes the month or year.
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
