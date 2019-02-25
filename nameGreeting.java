/**********************************************************************
*	Program:	 PRG420Week1_CodingAssignment	
* 	Purpose: 	 Week 1 Individual Assignment #2	
*	Programmer:	 Isaiah Headley
*	Class:		 PRG/420			
*	Creation Date:	 2/24/2019
*********************************************************************
*
**********************************************************************
*	Program Summary: This program asks the user for a one-word name
*                        and then displays a constructed greeting
*                        that looks like this: 
*
*                        Hello, NAME!
**********************************************************************/
/**
package prg420week1_codingassignment;


 *
 * @author NETBEANS PLACES YOUR INITIALS HERE
 */


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
