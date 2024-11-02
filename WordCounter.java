import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    //place try-catch blocks in code to handle exceptions 



    //expects a StringBuffer as an argument (the text), and a String stopword
    //counts the number of words in that through that stopword. 
    //if the stopword is not found in the text, method will raise InvalidStopwordException
    //if stopword is null, count all words in the file
    //return integer word count, unless count was less than five, then you would raise 
    //TooSmallText exception (REGARDLESS OF WHETHER STOPWORD IS FOUND)
    public int processText(StringBuffer text, String stopword) throws InvalidStopwordException, TooSmallText {
        int count = 0;//counts the number of words in text through the stopword

        //try {
            Pattern regex = Pattern.compile("[a-zA-Z0-9']+") ;
            Matcher regexMatcher = regex.matcher(text);
            
            while (regexMatcher.find()) {//find each word in the text the matches the expression
                count++;//incrementing count everytime word is found 
                String foundword = regexMatcher.group(); //retrieving the content of the word itself
                //System.out.println("I just found the word: " + regexMatcher.group());

                if(stopword != null){//stopword found!
                    return count;//returning word count up until this point
                }
            } 

            if(stopword != null){
                throw new InvalidStopwordException("Couldn't find stopword: " + stopword );
            }

            if(count < 5){
                throw new TooSmallText("Only found " + count + "words.");
            }
    
        //}
        
    
        return count; 
    }

    //expects String path as an argument, converts contents of the file to StringBuffer
    //^which it returns
    //if file cannot be opened, prompt user to re-enter the filename until they enter a file
    //that can be opened
    //if the file is empty, method should raise an EmptyFileException that contains 
    //the file’s path in its message
    public StringBuffer processFile(String path) throws EmptyFileException{
        
        StringBuffer filecontents = new StringBuffer();
        Scanner sc = new Scanner(System.in);

            while (filecontents == null){
                //String newfile;
                try (BufferedReader b = new BufferedReader(new FileReader(path))){
                    String linecontents;

                    while ((linecontents = b.readLine()) != null){
                        filecontents.append(b);
                    }

                    if(filecontents.length() == 0){
                        throw new EmptyFileException(path + " was empty");
                    }
                    break;//exiting loop
                }

                catch (IOException e){
                    System.out.println("Please re-enter the filename: ");
                    path = sc.nextLine();
                }

            }

        return filecontents; 
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
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String option = null; //option being inputed, either 1 or 2 
        String stopword = null;

        while (stopword == null){
            System.out.println("Please choose an option. Type option 1 for file, 2 for text");
            option = sc.nextLine();

            
        }
        

    }



}
