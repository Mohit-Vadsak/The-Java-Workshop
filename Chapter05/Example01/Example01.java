public class Example01 {
    public static void main(String[] args) {
        // declare a string with nothing inside
        String text = null;

        // you will see this at the console
        System.out.println("Go Java Go!");

        //This line will give error because we cant find length of null string
        System.out.println(text.length());

        // So this wont get executed
        System.out.println("done");
    }
}
