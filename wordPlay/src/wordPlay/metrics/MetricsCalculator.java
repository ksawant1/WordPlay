package wordPlay.handler;

public final class MetricsCalculator {

    private int count;
    int j;
    int length=0;
    private int result;
    
    //j=9;

    public MetricsCalculator(String word){


               j=9;
			  count=0;
              /*
              if(word.contains(".")){
        
                  
                  String lastword=word.substring(0,word.length()-1);
                 
                   int val=calavg(lastword);
                   
                   System.out.println(val);
                   
                    
                    //result=0;
              }
              else{*/
                  
                  
                  int val=calavg(word);
                  
                  result=result+val;
                  System.out.println(val);
                  
              //}
             
              }
              
              public int calavg(String word){
              for(int i=0;i<word.length();i++){
                  
                     if(word.charAt(i)!=' '){
                  count=count+1;
                  }
                  

                   
                  
              }return count;}

              
			 // break;
		  
          
    


}