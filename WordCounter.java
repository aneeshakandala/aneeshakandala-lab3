//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class WordCounter {

    //place try-catch blocks in code to handle exceptions 



    //expects a StringBuffer as an argument (the text), and a String stopword
    //counts the number of words in that through that stopword. 
    //if the stopword is not found in the text, method will raise InvalidStopwordException
    //if stopword is null, count all words in the file
    //return integer word count, unless count was less than five, then you would raise 
    //TooSmallText exception (REGARDLESS OF WHETHER STOPWORD IS FOUND)
    public int processText(){
 
        // Pattern regex = Pattern.compile("your regular expression here");
        // Matcher regexMatcher = regex.matcher(text);
        // while (regexMatcher.find()) {
        //     System.out.println("I just found the word: " + regexMatcher.group());
        // } 

    }

    //expects String path as an argument, converts contents of the file to StringBuffer
    //^which it returns
    //if file cannot be opened, prompt user to re-enter the filename until they enter a file
    //that can be opened
    //if tfile is empty, method should raise an EmptyFileException that contains 
    //the file’s path in its message
    public int processFile(){

    }

    //asks user to choose to process either
        //file with option 1
        //text with option 2
    //if user enters invalid option, allow them to choose again until they have correct option
    //checks to see if there is a second command line argument specifying a stopword
    //calls the methods above tk process the text, outputs the number of words it counted
    //if file is empty, method will display the message of exception raised
    //^^^includes path of the file 
    //if stopword was not found in the text, allow user one chance to re-specify the stopword
    //and try to process that again 
    //if user enters another stopword that can't be found, report that to user
    public int main(){

    }



}
