package department;


/**
 * Write a description of class InheritanceApply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class InheritanceApply
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CalculationThird c = new CalculationThird();
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        c.addition(a,b);
        c.substraction(a,b);
        c.multiplication(a,b);
        c.remainder(a,b);
        c.quotient(a,b); 
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        c.factorial(n);
     
    }
}