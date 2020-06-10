package wordPlay.handler;
import  wordPlay.util.Results;
public final class WordRotator {
    private String inputword;
     String resultant_word;
    String ans;
Results resultantword=new Results();
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

    public String rotate(String newword,int index){
        String ans= newword.substring(newword.length()-index)+newword.substring(0,newword.length()-index);
        return ans;
        

    

    }

	
}