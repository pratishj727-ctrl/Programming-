package department;


/**
 * Write a description of class CalculationThird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationThird extends CalculationSecond
{
    protected void quotient(int a, int b)
    {
        System.out.println("Div1: "+ (a/b));
    }
    protected void remainder(int a, int b)
    {
        System.out.println("Div2: "+ (a%b));
    }
}