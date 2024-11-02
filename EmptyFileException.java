//Extend Java’s IOException class to be this EmptyFileException class
import java.io.IOException;

//An exception of this type should be raised when the contents of the file to be parsed are empty
// You should pass in a string to its constructor, which passes that string to the parent’s constructor.
//This string will be what is printed when your other code does something like:
/* 
    catch (TooSmallText e){
        System.out.println(e); // will print whatever string you passed to the constructor
    }
*/
public class EmptyFileException extends IOException{




}
