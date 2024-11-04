//Extend Java’s Exception class to be this exception that is raised when the 
//stopword is not found in the text.

public class InvalidStopwordException extends Exception {
    
    public InvalidStopwordException(String m) {
        super(m);
    }

}