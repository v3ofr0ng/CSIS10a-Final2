import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/**
 * Write a description of class RandomEvents here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomEvents extends Fight
{
    // instance variables - replace the example below with your own
    public static void Random(){
        double chance = Math.random() * 60;
        if(chance > 55){
            System.out.println("Guy throws up signs with his hand");//scenario 1
            System.out.println("DOMAIN EXPANSION");
            System.out.println("GUY'S LIVING ROOM");
            System.out.println("");
            System.out.println("The world around you encloses into four walls");
            System.out.println("A shadow grows upon you");
            System.out.println("A couch falls upon you");//come back
            System.out.println("You turn into a puddle of mush");
            php = 0;
        }
        
        
        else{
            System.out.println("");//Scenario 3
            
        }
    }

    public static void playMusic(String location){
        try
        {
            File musicPath = new File(location);//Creates a variable that holds the file location inputted
            //If it exists then...
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//Get tp the file
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
}

