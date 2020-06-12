package wordPlay.exceptions;
/**
 * @author Krupa Sawant
 * throws exception when there special characters are present
 */
public class SpecialCharacterException extends Exception{

    public SpecialCharacterException(String s){
        super(s);
    }
}