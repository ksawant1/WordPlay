package wordPlay.handler;
import  wordPlay.util.Results;
/**
 * @author Krupa Sawant
 */
public final class WordRotator {
    private String inputword;
     String resultant_word;
     String ans;
    Results resultantword;

public WordRotator(Results rp){
    resultantword=rp;
} 
    /**
    * accepts a word
	* if period is included it removes it and sends to rotate function
	*/
    public void Wordr(String newword,int index){
             if(newword.contains(".")){
                  String lastword=newword.substring(0,newword.length()-1);
                  resultant_word=rotate(lastword,index);
                  resultant_word=resultant_word.toString()+".";
                  resultantword.store(resultant_word);
             }
             else{
                 resultant_word=rotate(newword,index);
                 resultantword.store(resultant_word);
             }
    }
     /**
	* rotates a word to the right by given index
	*/
    public String rotate(String newword,int index){
        String ans= newword.substring(newword.length()-index)+newword.substring(0,newword.length()-index);
        return ans;

    }
	
}