import java.util.logging.*;

public class LoggingExceptions {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger(); 
        //We declare a Logger object that we will be using to log the data into
        String s = null;
        //Invoking a Exception to use Logger
        try {
            System.out.println(s.length());
        } catch (NullPointerException ne) {
            logger.log(Level.SEVERE, "Exception happened", ne);
        }
    }
}
