
/**
 * Write a description of class oppFight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OppFight extends Fight
{
    public static void main(String [] args){
        fight();
    }

    public static void fight(){
        double bleh = Math.random();  // Read user input
        if(bleh <= 0.2){
            punch2();
        }
        else if(bleh > 0.2 && bleh <= 0.4){
            kick2(); 
        }
        else if(bleh > 0.4 && bleh <= 0.6){
            upper();
        }
        else if(bleh > 0.6 && bleh <= 0.8 ){
            combo();
        }
        else if(bleh > 0.8 ){
            beastMode();
        }
    }

    public static void punch2(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.5){
            System.out.println("Guy throws a straight straight to your face");
            System.out.println("5 DAMAGE");
            php = php - 5;//depending on the number, the hit lands
        }
        else{
            System.out.println("Guy throws a punch");
            System.out.println("You weave past it");
        }

    }

    public static void kick2(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.8){
            System.out.println("Guy shoots his foot into your stomach, knocking the air out of you");
            System.out.println("10 DAMAGE");
            php = php - 10;//depending on the number, the hit lands
        }
        else{
            System.out.println("You step back from an attempted kick from Guy");

        }

    }

    public static void upper(){
        double chance = Math.random() * 10 + 1;//creates a random number

        if(chance >= 8.5){
            System.out.println("Guy drops low");
            System.out.print("He pushes of the floor, bringing his fist stright to your chin");
            System.out.println("You fly through the air");
            System.out.println("5 DAMAGE");
            
            php = 5;

            Double oh = Math.random();
            if(oh < 0.2 ){
                System.out.println("Guy jumps up behind you");
                System.out.println("He grabs onto your legs and spins you in the air ");
                System.out.println("Your vision spins as he hurls you into the ground");
                System.out.println("20 DAMAGE");
                php = php - 20;
            }
            else{
                System.out.println("You slam back onto the ground");
            }

        }
        else{
            System.out.println("Guy trys to throw an uppercut towards you");
            System.out.println("You slap his hand away and step away");

        }
    }

    public static void combo(){
        double chance = Math.random() * 10;//creates a random number
        int dam = 0;
        if(chance >= 0.5){
            System.out.println("Guy throws a jab");
            
            php = php - 4;//depending on the number, the hit lands
            dam = dam + 4;
            if(chance >= 0.6){
                System.out.println("Guy throws a right");
                php = php - 3;
                dam = dam + 3;
                if(chance >= .7){
                    System.out.println("Now a left");
                    php = php - 3;
                    dam = dam + 3;
                    if(chance >= 0.8){
                        System.out.println("NOW A GRAND SLAM");
                        System.out.println("BOOOOOOOOOMMMMMMMMMM");
                        php = php - 5;
                        dam = dam + 5;
                        //add picture of dunking spongebob if you can
                    }
                }
            }
            System.out.println(dam + " DAMAGE");
        }
        else{
            System.out.println("Guy throws towards your liver");
            System.out.println("You manage to block it");
        }
    }
    
    public static void beastMode(){
        double chance = Math.random();//creates a random number

        if(chance >= 0.5){
            System.out.println("Guy drops to the floor, and yells ");
            
            // For this one I wanted to add different animals that Guy could
            //imitate, so a math.random would decide
            

            double oh = Math.random();
            if(oh < 0.2){
                
                    System.out.println("DUCK DODGE <(00)");
                    System.out.println("Guy leaps into the air and drops like a feather towards you");
                    System.out.print("AAUUUUGGGGHHH");
                    fight();
                

                
            }
            else if(oh >=0.2 && oh <=0.8){
                System.out.println("WOLF WALLOP");
                System.out.println("Guy rips of his shirt");
                System.out.println("(He still has another one under it) :l");
                System.out.println("He bounds towards you and strikes you across the cheek");
                System.out.println("10 DAMAGE");
                //add wolf piucture

                php = php - 10;
            }
            else if(oh > 0.8){
                System.out.println("KANGAROO KICK");
                System.out.println("Guy jumps and dropkicks you into the wall");
                System.out.println("15 DAMAGE");
                php = php - 15;
                
            }

        

        else{
            System.out.println("His voice cracks as he tries to yell");

        }
    }
    else{
        System.out.println("Guy thinks about his next move");
    }

    }
}

    
