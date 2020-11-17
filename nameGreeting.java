

import java.util.Scanner;

public class nameGreeting {
    
    public static void main(String[] args) {

        // The scanner is created to capture input from the device
        Scanner input = new Scanner(System.in);


        // At this prompt the device is asking the user for input
        System.out.println("Hello please enter your name");


        // This statement will capture the users name and assign it to a variable to be used in the greeting
        String givenName = input.next();

        // the program will then display a greeting with the given name
        System.out.println("Hello " + givenName +" You are Awesome!!");

    }
    
}
