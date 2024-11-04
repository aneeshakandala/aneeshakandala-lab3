//Extend Java’s Exception class to be this exception that is raised when the 
//length of the text is less than five words.

public class TooSmallText extends Exception {
   private String e;

    public TooSmallText(String e) {
        this.e = e;
    }

    @Override
    public String toString(){
        return "TooSmallText: " + e;
    }

}