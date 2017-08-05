import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadLineByLine {
    public static void main (String[] args) throws Exception {

        System.out.println("Yea reading line bt line");

        FileInputStream fstream = new FileInputStream("/users/medalis/src/Code_Challenges/ThoughtWorks/input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        // Read file line by line 
        while ((strLine = br.readLine()) != null) {
            System.out.println(strLine);
        }

        //close the input stream 
        br.close();

    }

  


}
