package wordPlay.driver;
import wordPlay.util.FileProcessor;
import wordPlay.util.Results;
import wordPlay.exceptions.SpecialCharacterException;
import wordPlay.exceptions.EmptyLineException;
import wordPlay.exceptions.EmptyFileException;
import wordPlay.handler.WordRotator;
import wordPlay.handler.MetricsCalculator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;

import java.io.*; 
import java.util.regex.*;
/**
 * @author Krupa Sawant
 *
 */
public class Driver {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException,FileNotFoundException,IOException,EmptyFileException,EmptyLineException,SpecialCharacterException{

		/*
		 * As the build.xml specifies the arguments as input,output or metrics, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 * @exception FileNotFoundException On input file not found.
		 *  @exception IOException On any I/O errors while reading lines from input file.
		 * @exception EmptyFileException if file is empty
		 * @exception EmptyLineException if line in file is empty
		 * @exception SpecialCharacterEcception [^A-Za-z0-9 .] not allowed
		 */
		if ((args.length != 3) || (args[0].equals("${input}")) || (args[1].equals("${output}")) || (args[2].equals("${metrics}"))) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		}

    /**
	* creates instances for wordrotator, metriccalculator and results 
	*/
		
        Results resultantword=new Results();
        WordRotator new_word= new WordRotator(resultantword);
		//Results resultantmetric=new Results();
		MetricsCalculator newword= new MetricsCalculator(resultantword);
	    Pattern pattern= Pattern.compile("[^A-Za-z0-9 .]");
		

		try{
          FileProcessor fp= new FileProcessor(args[0]);
		  String nextword;
		  int count=1,num=1,num1;
		  
		  /**
	    * checks for boundary conditions
		* passes individual word to rotatorclass and metric calculator class while maintaining
		* end of line using period
	     */

		  while(true){
			  nextword=fp.poll();
              if(nextword == null){
				  break;
                
				
			  }		
			  
			  if((nextword!=null)) {
				  Matcher matcher= pattern.matcher(nextword);
				  if(matcher.find()){
					  throw new SpecialCharacterException("Words contain characters other than [a-zA-Z0-9]");

				  }
			  }

			  if(nextword.isEmpty()){
				 throw new EmptyLineException("File contains empty Lines");
			  }
			  
			

	          if((nextword!=null) && (nextword.length()<num) && !(nextword.contains("."))){
				num1=num-nextword.length();
			    new_word.Wordr(nextword,num1);
			    num=num+1;
			    newword.MetricsC(nextword,count);
			    count++;

		        }

		      if((nextword!=null) && nextword.contains(".")){
				  if(nextword.length()<=num){
					  num1=num-nextword.length()+1;
					  new_word.Wordr(nextword,num1);
					  num1=1;
					  num=1;
					  newword.MetricsC(nextword,count);
					  count++;
			        }
			      else{
					  new_word.Wordr(nextword,num);
					  num=1;
					  num1=1;
					  newword.MetricsC(nextword,count);
					  count++;
				  
		
				   	  
			        }
		        }
		      else if((nextword.length()>=num) && (nextword!=null)){
				  new_word.Wordr(nextword,num);
				  num++;
				  newword.MetricsC(nextword,count);
				  count++;
		  
		        }

				  
		 
		    }
			
		  
		  
		  
		
		}catch(FileNotFoundException ex){
			throw new FileNotFoundException("file is missing");
		}catch(IOException ex){
			System.out.println("input not right");
		}catch(NullPointerException ex){
			throw new NullPointerException("input not right");
		}catch(ArrayIndexOutOfBoundsException ex){
			throw new ArrayIndexOutOfBoundsException("empty input file");
		}
         

		 /**
	    * to print results to console and output,metrics file 
	   */
		resultantword.writeToStdout();
		resultantword.writeToFile();
		
		

		  
		



	}
}
