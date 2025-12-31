package department;


/**
 * Write a description of class CalculationSecond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationSecond extends Calculation
{
    protected void factorial(int n)
    {
        int fact = 1;
        for(int i =1; i<=n; i++)
        {
            fact=fact*i;
            System.out.println("Factorial: "+ fact);
        }
        
    }
}