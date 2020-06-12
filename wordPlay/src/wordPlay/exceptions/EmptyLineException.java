package wordPlay.exceptions;
/**
 * @author Krupa Sawant
 * throws exception when there is a missing line in input file
 */

public class EmptyLineException extends Exception{

    public EmptyLineException(String s){
        super(s);
    }
}