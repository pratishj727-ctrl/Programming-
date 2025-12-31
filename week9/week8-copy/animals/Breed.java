package animals;


/**
 * Write a description of class Scooby here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Breed extends Dogs
{
    String breedType;
    
    protected void breedType()
    {
        System.out.println("Breed type: " + breedType +"\n" + "Name: " + name + "\n" + "Color: " + color);
    }
    
    protected void bark()
    {
        super.bark();
        System.out.println("Scooby Dooby Dooo!");
    }
    
    public static void main(String[] args)
    {
        Breed b1 = new Breed();
        b1.name = "Scooby Doo";
        b1.color = "Brown";
        b1.breedType = "Great Dane";
        b1.bark();
        b1.breedType();
    }
}