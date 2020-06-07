package wordPlay.driver;
import wordPlay.util.FileProcessor;
import wordPlay.handler.WordRotator;
import wordPlay.handler.MetricsCalculator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*; 
/**
 * @author John Doe
 *
 */
public class Driver {
	public static void main(String[] args) throws FileNotFoundException,IOException{

		/*
		 * As the build.xml specifies the arguments as input,output or metrics, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if ((args.length != 3) || (args[0].equals("${input}")) || (args[1].equals("${output}")) || (args[2].equals("${metrics}"))) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		}
		System.out.println("Hello World! Lets get started with the assignment");
		//System.out.println(args[0]);

		try{
          FileProcessor fp= new FileProcessor(args[0]);
		  String nextword;
		  int num;
		  num=1;
		  while(true){
		  
		  nextword=fp.poll();
		  if(nextword.matches("\\d+(\\.)")){
			  System.out.println(nextword);
			  break;
			  
		  }
		  if(nextword.contains(".")){
			  String lastword=nextword.substring(0,nextword.length()-1);
			  WordRotator new_word= new WordRotator(lastword,num);
			  break;
		  }
		  
		  else{
		  WordRotator new_word= new WordRotator(nextword,num);
		  num++;
		  
		 }
		  }
		}catch(FileNotFoundException ex){
			System.out.println("file not found");
		}

		try{
		    FileProcessor fp1= new FileProcessor(args[0]);
			String nextword;
		    while(true){
		    nextword=fp1.poll();
			if(nextword.contains(".")){
			  String lastword=nextword.substring(0,nextword.length()-1);
			  MetricsCalculator new_word= new MetricsCalculator(lastword);
			  break;
		    }
		   else
		     {
		      MetricsCalculator new_word= new MetricsCalculator(nextword);
			  }
		  
		    }
		 
		  

		}catch(FileNotFoundException ex){
			System.out.println("file not found");


		}


	}
}
