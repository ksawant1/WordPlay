package wordPlay.handler;
import  wordPlay.util.Results;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 * @author Krupa Sawant
 */
public final class MetricsCalculator {
     int charl;
     int inc;
     int val;
     private static DecimalFormat df2=new DecimalFormat("#.##");
     Results resultantword;

/**
 * takes an individual word and calculates the number of characters it contains and measures
 * the average word length based on total number of words and then passes it to the result instance
 *
 */
public MetricsCalculator(Results rp){
    resultantword=rp;
}
     public void MetricsC(String word,int count){
         
         if(word!=null){
             if(word.contains(".")){
                 word=word.substring(0,word.length()-1);
                 val=calavg(word);
                 inc++;
                
             }
             else{
              
                   val=calavg(word);
                   inc++;
              }}
             if(inc==count)
              avg_cal(val,count);

        }
           
         public int calavg(String word){
             for(int i=0;i<word.length();i++){ 
                     if(word.charAt(i)!=' '){
                  charl=charl+1;
                  }   
                  
              }return charl;}

              
		 public void avg_cal(int val,int count){
                 float input=(float)val/count;
                 resultantword.storemetric(input);
             }  

}
