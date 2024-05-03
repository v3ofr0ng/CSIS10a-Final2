
/**
 * Write a description of class Puncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puncher extends Fight
{
    public static void punch(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.5){
            System.out.println("You swing at Guy, sending him backwards");
            ehp = ehp - 5;//depending on the number, the hit lands
        }
        else{
            System.out.println("Guy dodges your punch");

        }

    }
}
