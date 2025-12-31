package animals;


/**
 * Write a description of class Birds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Birds extends Aves
{
    protected String foodType;
    protected void eats()
    {
        System.out.println(foodType);
    }
}