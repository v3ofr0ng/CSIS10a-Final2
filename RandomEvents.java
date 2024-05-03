
/**
 * Write a description of class RandomEvents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomEvents extends Fight
{
    // instance variables - replace the example below with your own
    public static void main(String []args){
        double chance = Math.random() * 60;
        if(chance > 55){
            System.out.println("Guy throws up signs with his hand");//scenario 1
            System.out.println("DOMAIN EXPANSION");
            System.out.println("GUY'S LIVING ROOM");
            
            System.out.println("The world around you encloses into four walls");
            System.out.println("A shadow grows upon you");
            System.out.println("A couch falls upon you");//come back
            System.out.println("You turn into a puddle of mush");
            php = 0;
        }
        else if(chance > 1.5 && chance <= 2.5){
            System.out.println(" MUSIC CHANGE");//scenario 2
            System.out.println("Before you stands the uncontested Guyfighting champion of the world, Guy");
        }
        else{
            System.out.println("As your rush to your apartment complex, you bump into a man, spilling his coffee");//Scenario 3
            System.out.println("Thats the last straw pal I'm gonna pummel you");
        }
    }
    
}
