package wordPlay.handler;

public final class WordRotator {
    private String inputword;
    String ans;

    public WordRotator(String newword,int index){
             
             rotate(newword,index);
         

         



    }

    public void rotate(String newword,int index){
        //System.out.println(newword.length()-index);
        String ans= newword.substring(newword.length()-index)+newword.substring(0,newword.length()-index);
        System.out.println(ans);
        

         

    }
               


	
}