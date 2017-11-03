
/**
 * This basic calendar return the date (dd-mm-yy), 
 * allow to change the date by 
 * user input or advance it one dia.
 * 
 * @author (Daniel Carmenes Alvarez) 
 * @version (2017/10/27)
 */
public class CalendarioBasico
{
    // Save the dia.
    private int dia;
    // Save the mes.
    private int mes;
    // Save the ano.
    private int ano;
    
    /**
     * Constructor for objects of class CalendarioBasico.
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        // There is no world before 2000.
        // The Eschaton comes in 2100.
        ano = 1;
    }

    /**
     * Returns date in format (dd-mm-yy) with 8 characters. 
     */
    public String obtenerFecha ()
    {
        // Create a text chain like: '1dd-1mm-1yy'.
        String date = (dia+100) + "-" + (mes+100) + "-" + (ano+100);
        // Now, ignore '1' and take the rest.
        date = date.substring(1,4) 
               + date.substring(5,8) 
               + date.substring(9,11);
        return date;
    }
    
    /**
     * Set a specific date.
     * Note: There are no control methods to validate data entry.
     */
    public void fijarFecha (int setDia, int setMes, int setAno) 
    {
        dia = setDia;
        mes = setMes;
        // How we only want to store two numbers
        // and the value is between 2000 - 2099
        // we subtract 2000 to the input.   
        ano = setAno;
        
    }    
    /**
     * Add one dia to the date.
     * 
     * Who needs a T.A.R.D.I.S.?
     */
    public void avanzarFecha ()
    {
        // Check if adding a dia changes the mes or ano.
        if (dia == 30)
        {
            dia = 01;
            if (mes == 12) 
            {
                mes = 01;
                ano += 1;                
            }
            else 
            {
                mes += 1;
            }
        }
        // 'Cristian hates me' validation. 
        // Stop the Eschaton, 2100 never comes!
        // If it is going to reach 2100, 
        // set calendar to default.
        else if (dia == 30 && mes == 12 && ano == 99)
        {
            dia = 1;
            mes = 1;
            ano = 0;
        }
        else 
        {
            dia += 1;
        }
    }    
}
