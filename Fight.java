import java.util.Scanner;
/**
 * Write a description of class Fight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fight
{
    public static int php = 50; //player and enemy health points
    public static int ehp = 50;
    public static void main(String []args){
        start();
        while(php > 0){
            if (ehp <= 0){
                System.out.println("Guy stumbles back, the blood drips from his mouth, he gasps for air. 'I shouldve known I couldnt win'");
                System.out.println("He drops to the floor, you won, but what price did you pay");
                return;
            }
            else{
                fight();
                //oppfight();
            }
        }
        System.out.println("Your legs give out. Your head throbs, your body burns, your eyes begin to black out as Guy walks to you");
        System.out.println("He looks at you and flings his arm in a windmill motion until he hits you. The last thing you see is the sun as you float over a bed of clouds miles off the ground");

    }

    public static void fight(){
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What move you want to do");
        System.out.println("(type in the number of the move you want to do)");
        System.out.println("1) punch");
        System.out.println("2) kick");
        System.out.println("3) suplex");
        System.out.println("4) jumping knee");
        System.out.println("5) sweep");

        int bleh = choice.nextInt();  // Read user input
        if(bleh == 1){
            punch();
        }
        else if(bleh == 2){
            kick(); 
        }
        else if(bleh == 3){
            suplex();
        }
        else if(bleh == 4){
            jumpKnee();
        }
        else if(bleh == 5){
            sweep();
        }
        else{
            System.out.println("Buddy just pick one of the moves");
            fight();
        }
    }

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

    public static void kick(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.8){
            System.out.println("You kick Guy in th stomach, he curls up");
            System.out.println("friiiiccccckkk");
            ehp = ehp - 10;//depending on the number, the hit lands
        }
        else{
            System.out.println("Guy catches your foot. 'Moron' he proclaims");
            System.out.println("He sweeps your other leg. You fall");
            php = php - 3;

        }

    }

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
                System.out.println("You pull Guy upwards, your feet leave the ");
                System.out.print("ground as you torpedo him into the floor");
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

    public static void sweep(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.5){
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

    public static void start(){
        double chance = Math.random() * 3;
        if(chance > 2.5){
            System.out.println("Guy jumps out of a car as you walk by.");//scenario 1
            System.out.println("'I, Guy, challenge you to a fight to restore the honor of my people'");
        }
        else if(chance > 1.5 && chance <= 2.5){
            System.out.println("As you walk up to the ring, you can hear your heart pounding. The lights are blinding, the air is humid, the crowd is cheering");//scenario 2
            System.out.println("Before you stands the uncontested Guyfighting champion of the world, Guy");
        }
        else{
            System.out.println("As your rush to your apartment complex, you bump into a man, spilling his coffee");//Scenario 3
            System.out.println("Thats the last straw pal I'm gonna pummel you");
        }
    }

}
