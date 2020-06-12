package wordPlay.exceptions;
/**
 * @author Krupa Sawant
 * throws exception when there is no input in the file
 */

public class EmptyFileException extends Exception{

    public EmptyFileException(String s){
        super(s);
    }
}