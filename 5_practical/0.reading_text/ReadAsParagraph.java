import java.io.BufferedReader; //Similar to Scanner library 
import java.io.FileReader; 


public class ReadAsParagraph {
    public static void main (String[] args) throws Exception 
    {

        System.out.println("This works so far!");

        FileReader file = new FileReader("/users/medalis/src/Code_Challenges/ThoughtWorks/input.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine(); //Keeps reading line after line 

        while(line != null)
        {
            text += line; 
            line = reader.readLine();
        }

        System.out.println(text);

    }
}
