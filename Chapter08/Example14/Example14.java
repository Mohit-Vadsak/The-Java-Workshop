//Creating a SocketServer

import java.net.*;
import java.io.*;

public class Example14 {
    public static void main(String[] args) throws IOException {
        //the below paart checks that you have selected a port for your server to be listening to.
        //This port number is given as an argument on the CLI
        if (args.length != 1) {
            System.err.println("Usage: java Example14 <port number>");
            System.exit(1);
        }
        
        int portNumber = Integer.parseInt(args[0]);
        //The call to ServerSocket(Integer.parseInt(args[0])) will start the object of the ServerSocket class,
        //configuring the port defined in the arguments to call the program as the one to listen to.
        //Later, serverSocket.accept() will block the server and make it wait until a connection arrives.
        //Once it arrives, it will be automatically accepted.
        try (
            ServerSocket serverSocket =
                new ServerSocket(Integer.parseInt(args[0]));
            Socket clientSocket = serverSocket.accept();     
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);                   
            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println(inputLine);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
