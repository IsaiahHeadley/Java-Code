iimport java.util.Scanner;

public class ifelseif{

	
    public static void main(String[] args) {
               
 Scanner age = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter your age");

 int userAge = age.nextInt();  // Read user input
 
	

	if(userAge <= 0){
	 System.out.println("Error");
}else if(userAge <= 18){
	 System.out.println("You are too young to enter");
}else if(userAge > 18){
	 System.out.println("Welcome!");
}else {
	 System.out.println("Really?");

}
}
}
