
/**
 * Write a description of class Jumpkneer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jumpkneer extends Fight
{
    public static void jumpKnee(){
        double chance = Math.random() * 10;//creates a random number

        if(chance >= 0.75){
            System.out.println("You grab onto the back of Guy's head and pull his face it into your knee");
            System.out.println("He stumbles back as blood drips from his nose");
            ehp = ehp - 15;//depending on the number, the hit lands
        }
        else{
            System.out.println("Guy pushes your hands off");
            System.out.println("AYAYAI");
            System.out.println("He slams the crown of his head into your chin");
            System.out.println("10 DAMAGE");
            php = php - 10;

        }

    }
}
