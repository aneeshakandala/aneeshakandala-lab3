//Extend Java’s IOException class to be this EmptyFileException class
import java.io.IOException;

    public class EmptyFileException extends IOException {

        private String e;

        public EmptyFileException(String e) {
            this.e = e;
        }

        @Override
        public String toString(){
            return "EmptyFileException: " + e;
        }

    }

