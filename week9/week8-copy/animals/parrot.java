package animals;


/**
 * Write a description of class parrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class parrot extends Birds
{
    
    protected void foodType()
    {
        System.out.println("Eats pests");
    }
    
    public static void main(String[] args){
        parrot p1 = new parrot();
        p1.fly();
        p1.eats();
    }
}