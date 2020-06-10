package wordPlay.handler;

public final class MetricsCalculator {

     int charl;

    public void MetricsC(String word,int count){
             if(word.contains(".")){
                 word=word.substring(0,word.length()-1);
                 int val=calavg(word);
                 avg_cal(val,count);

             }
             else{
              
                  int val=calavg(word);
              }}
              
              public int calavg(String word){
              for(int i=0;i<word.length();i++){ 
                     if(word.charAt(i)!=' '){
                  charl=charl+1;
                  }   
                  
              }return charl;}

              
			 public void avg_cal(int val, int count){
                 float input=val/count;
                 System.out.println(count);
                 System.out.println(String.format("%.2f",input));
             }
		  
          
    


}