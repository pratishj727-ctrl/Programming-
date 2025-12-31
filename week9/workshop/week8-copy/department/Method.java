package department;


/**
 * Write a description of class Method here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Method
{
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child();
        
        p.parentInfo();
        c.childInfo();
        p.parentInfo();
    }
}