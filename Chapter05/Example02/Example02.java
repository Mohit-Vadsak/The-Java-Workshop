public class Example02 {
    public static void main(String[] args) {
        // declare a string of a fixed length
        String text = "I <3 bananas"; // 12 characters long

        // StringOutOfBoundsException will occur. provoke an exception
        char character = text.charAt(15); // get the 15th element

        // you will never see this print
        System.out.println("done");
    }
}

/*
Here's a list of the various types of exceptions:

NullPointerException
StringOutOfBoundsException
ArithmeticException
ClassCastException
IllegalArgumentException
IndexOutOfBoundsException
NumberFormatException
IllegalAccessException
InstantiationException
NoSuchMethodException
*/