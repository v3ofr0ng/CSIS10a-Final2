
/**
 * Write a description of class Kicker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kicker extends Fight
{
     public static void kick(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.8){
            System.out.println("You kick Guy in th stomach, he curls up");
            System.out.println("friiiiccccckkk");
            System.out.println("10 DAMAGE");
            ehp = ehp - 10;//depending on the number, the hit lands
        }
        else{
            System.out.println("Guy catches your foot. 'Moron' he proclaims");
            System.out.println("He sweeps your other leg. You fall");
            php = php - 3;

        }

    }
}
