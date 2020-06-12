package wordPlay.util;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 * @author Krupa Sawant
 *
 */

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    ArrayList<String> words= new ArrayList<String>();
    ArrayList<Double> metrics= new ArrayList<Double>();
    double metric_value;
    int final_count=0;
    int final_count1=0;
    private static DecimalFormat df2=new DecimalFormat("#.##");

    public Results(){
    }	

    /**
    * writetoFile() prints the array list of words and the metrics calculated into the output.txt file
    */

    public void writeToFile() throws IOException{
        try{
      FileWriter writer= new FileWriter("/home/owner/Desktop/DesignPatterns/csx42-summer-2020-assign1-ksawant1/wordPlay/output.txt");
      FileWriter writermetric=new FileWriter("/home/owner/Desktop/DesignPatterns/csx42-summer-2020-assign1-ksawant1/wordPlay/metrics.txt");
      for (int i=0;i<words.size();i++){

                if(words.get(i).contains(".")){
                     writer.write(words.get(i)+ "\n");
                     final_count1=final_count1+1;
                    
                }
                else{
               writer.write(words.get(i)+ " ");
            }
    }
      writermetric.write("AVG_NO_WORDS_PER_SENTENCE: " + (float)words.size()/final_count1 + "\n");
      writermetric.write("AVG_WORD_LENGTH:" + df2.format(metrics.get(words.size()-1)));
      writer.close();
      writermetric.close();
        }catch(IOException ex){
			System.out.println("file not found");
            }
    }
    /**
    * writeToStdout prints the word array list onto the console along with the metrics.
    *
    */
    public void writeToStdout() throws ArrayIndexOutOfBoundsException{
        try{
        for (int i=0;i<words.size();i++){

                if(words.get(i).contains(".")){
                     System.out.print(words.get(i)+ "\n");
                     final_count=final_count+1;
                    
                }
                else{
               System.out.print(words.get(i)+ " ");
            }
    }
    
        System.out.println("Avg_no_of_words_per_sentence:" + ((float)words.size()/final_count));
        System.out.println("Avg_word_length " + df2.format(metrics.get(words.size()-1)));

    }catch(ArrayIndexOutOfBoundsException ex){
			throw new ArrayIndexOutOfBoundsException("empty input file");
    }
    }
     /**
     * stores the rotated words and metrics in arraylist
     *
     */
    public void store(String word){
        words.add(word);      
        
    }  
    public void storemetric(double input){
    metrics.add(input);     
        
    } 

}
