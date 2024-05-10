import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
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
        //***************Music*********
        String filepath = "newSong.wav";//music
        playMusic(filepath);//play music ,method
        JOptionPane.showMessageDialog(null, ":)");//still music, just shows a message!

        //********************Beginning the fight and the instance for the enemy's attacks*************
        start();
        OppFight wuh = new OppFight();//instance of the opponent fighting

        //**********Turn*********
        int turn = 1; //turn counter

        //***********Random event******
        RandomEvents guh = new RandomEvents();

        //************Fighting loop***************
        while(php > 0){
            //this if statement is the base case when you beat the enemy
            if (ehp <= 0){  
                System.out.println("Guy stumbles back, the blood drips from his mouth, he gasps for air. 'I shouldve known I couldnt win'");
                System.out.println("He drops to the floor");
                System.out.println("YOU WIN");
                return;
            }
            else{
                System.out.println("***************TURN " + turn + "***************");//Seperates the turns, makes it a teeny bit easier to see
                try {
                    fight(); //player fighting
                }
                catch (Exception e) {
                    System.out.println("Since you didnt want to type a number your turn is skipped >:(");
                }
                wuh.fight();//opponent fighting using the instance created above
                guh.Random();
                turn++;//adding every turn
            }
        }
        System.out.println("Your legs give out. Your head throbs, your body burns, your eyes begin to black out");//The end of you
        System.out.println("'Come back in 10 years' he proclaims as he walks away");
        System.out.println("YOU LOSE");
    }

    //*******Music method**********
    public static void playMusic(String location){
        try
        {
            File musicPath = new File(location);//Creates a variable that holds the file location inputted
            //If it exists then...
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//Get to the file
                Clip clip = AudioSystem.getClip();//Get the clip of the file
                clip.open(audioInput);//Open the file
                clip.start();//Play!
            }
            else
            {
                System.out.println("Can't find file");//just incase the file cant be found
            }
        }
        catch(Exception e)
        {
            System.out.println(e);//prints out a little message
        }
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

        while (true) {
            int bleh = choice.nextInt();  // Read user input
            //Each one is a different move, and calls a different class;
            if(bleh == 1){
                Puncher youch = new Puncher(); //new instance of the move
                youch.punch();
                break;
            }
            else if(bleh == 2){
                Kicker ugh = new Kicker();
                ugh.kick(); 
                break;
            }
            else if(bleh == 3){
                Suplexer blurgh = new Suplexer();
                blurgh.suplex();
                break;
            }
            else if(bleh == 4){
                Jumpkneer aiaiai = new Jumpkneer();
                aiaiai.jumpKnee();
                break;
            }
            else if(bleh == 5){
                Duster huh = new Duster();
                huh.sweep();
                break;
            }
            else{
                System.out.println("Type one of the numbers pal");
                fight();
            }
            
        }
    }

    //This method just chooses a random scenario to start the game
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
