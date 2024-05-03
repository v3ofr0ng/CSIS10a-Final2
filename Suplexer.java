import java.util.Scanner;
/**
 * Write a description of class Suplexer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Suplexer extends Fight
{
    public static void suplex(){
        double chance = Math.random() * 10 + 1;//creates a random number

        if(chance >= 8.5){
            System.out.println("You sidestep behind Guy,and wrap your arms around");
            System.out.print(" his abdomen. He lets out a suprised grunt as he turns");
            System.out.println(" to face you in terror");
            System.out.println("What do you do?(number again)");
            System.out.println("1) SUPLEX");
            System.out.println("2) BITE");
            System.out.println("3) Let go?");

            Scanner uh = new Scanner(System.in);
            int oh = uh.nextInt();
            if(oh == 1){
                System.out.println("FFFUUUUUAAGGGGGUUUHHHHHH");
                System.out.print("You pull Guy upwards, your feet leave the ");
                System.out.println("ground as you torpedo him into the floor");
                System.out.println("20 DAMAGE");
                ehp = ehp - 20;
            }
            else if(oh == 2){
                System.out.println("You dig your teeth into Guy's neck. ");
                System.out.println("YYOOOUCH 'WHATS WRONG WITH YOU'says Guy ");
                System.out.println("You feel your strength and stamina replenish ");
                System.out.println("as the iron flavored blood flows");

                ehp = ehp - 5;
                php = php + 5;
            }
            else{
                System.out.println("since you didnt wanna type one of the the numbers your turn is skipped >:(");
                return;
            }

        }
        else{
            System.out.println("Guy slaps your hands off of him");
            System.out.println("Not slick, pal");

        }

    }
}
