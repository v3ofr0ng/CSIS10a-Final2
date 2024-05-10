import java.util.Scanner;
/**
 * Write a description of class Duster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Duster extends Fight
{
    public static void sweep(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.7){
            System.out.println("You drop to your feet and swing your leg under Guy, dropping him to his back");
            ehp = ehp - 3;
            // ablility to build upon previous moves
            System.out.println("what now");
            System.out.println("1) elbow drop");
            System.out.println("2) crawl and punch");

            double chance2 = Math.random();

            Scanner uh = new Scanner(System.in);
            int oh = uh.nextInt();
            if(oh == 1){
                if(chance2 > 0.8){
                    System.out.println("You push yourself up, bounding towards the fallen Guy");
                    System.out.println("You push back on your toes and drop backwards elbow pointed headfirst at Guy's chest");
                    System.out.print("FFFUUUUUUUUUUUUUUU-");
                    System.out.println("CRACK");
                    System.out.println("Air, blood and tears jump out of Guy's mouth and eyes");
                    System.out.println("20 DAMAGE");
                    ehp = ehp - 20;
                }

                else if( chance <= 0.8){
                    System.out.println("You bound upwards and drop your elbow straight towards Guy's chest");
                    System.out.println("Guy rolls to the left");
                    System.out.println("Your elbow drops directly onto the floor");
                    System.out.println("GRRRRAAAAHHHHHHHH");
                    System.out.println("Your elbow bounces of the floor and smacks your face");

                    php = php - 15;
                }
            }
            else if(oh == 2){
                System.out.println("You throw yourself ontop of Guy");
                System.out.println("As he struggles to get you off, you throw the old  one-two right in the kisser");
                System.out.println("GET OFFFFFF :(");
                System.out.println("He pushes you off and jumps to his feet");
                System.out.println("5 DAMAGE");

                php = php - 5;
            }
            else{
                System.out.println("since you didnt wanna type one of the the numbers your turn is skipped >:(");
                return;
            }

        }

        else{
            System.out.println("Guy jumps over the leg sweep");

        }

    }
}
