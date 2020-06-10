package wordPlay.driver;
import wordPlay.util.FileProcessor;
import wordPlay.util.Results;
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
		  WordRotator new_word= new WordRotator();
		  Results resultantword=new Results();
		  String nextword;
		  int num;
		  num=1;
		  int num1;
		  while(true){
		  nextword=fp.poll();
	      if((nextword.length()<num) && !(nextword.contains("."))){
			  
			  num1=num-nextword.length();
			  new_word.Wordr(nextword,num1);
			  num=num+1;
	

		  }
		  if(nextword.contains(".")){
			  
			  if(nextword.length()<=num){
			  num1=num-nextword.length()+1;
			  new_word.Wordr(nextword,num1);

			  break;}
			  else{
				  new_word.Wordr(nextword,num);
				  break;
			  }
		  }
		  else if(nextword.length()>=num){
			  
	      new_word.Wordr(nextword,num);
		  num++;
		  
		 }

		  }
		  
		resultantword.writeToFile();
		}catch(FileNotFoundException ex){
			System.out.println("file not found");
		}

		try{
		    FileProcessor fp1= new FileProcessor(args[0]);
			MetricsCalculator new_word= new MetricsCalculator();
			String nextword;
			int count=1;
		    while(true){
		    nextword=fp1.poll();
			if(nextword.contains(".")){
			  new_word.MetricsC(nextword,count);
			  break;
		    }
		   else
		     {
		     new_word.MetricsC(nextword,count);
			  count++;
			  }
		  
		    }
		 
		  

		}catch(FileNotFoundException ex){
			System.out.println("file not found");


		}
		



	}
}
