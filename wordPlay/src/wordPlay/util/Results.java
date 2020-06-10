package wordPlay.util;
import java.util.ArrayList;
public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    ArrayList<String> words= new ArrayList<String>();

    public Results(){
        
        

    }	
    public void writeToFile(){
        

            for (int i=0;i<words.size();i++){
                System.out.println(words.get(i));
            }
    }

    public void writeToStdout(){

    }

    public void store(String word){
        words.add(word);
        //writeToFile();
        System.out.println(words);

        
        
    }
    

}
