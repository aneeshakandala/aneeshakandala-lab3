//Extend Java’s Exception class to be this exception that is raised when the 
//stopword is not found in the text.

public class InvalidStopwordException extends Exception {
    
    private String e; 

    public InvalidStopwordException(String e) {
        this.e = e;
    }

    @Override
    public String toString(){
        return "InvalidStopwordException: " + e;
    }

}