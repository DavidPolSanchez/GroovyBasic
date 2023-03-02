package groovy.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JAVAfile {


    public JAVAfile() throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new FileReader("file.txt"));
        try{
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
           while(line!=null){
               sb.append(line);
               sb.append(System.lineSeparator());
               line= bufferedReader.readLine();
           }
           String everything = sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            bufferedReader.close();
        }
    }
}
