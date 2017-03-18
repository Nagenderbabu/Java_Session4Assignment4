import java.util.Scanner;


public class ReverseMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// initializing ReverseofString class
		ReverseofString rst=new ReverseofString();
		// Scanner object to scan input
	     Scanner sc=new Scanner(System.in);
	     // prints statement asking user to enter the string input
	     System.out.print("Enter the string: "+" ");
	     // passing the input to the input variable 
	     rst.input=sc.next();
	     // passing the string input value to String buffer constructor
	    StringBuffer sb=new StringBuffer(rst.input);
	    // prints output
	     System.out.println("the reverse of given string is: ");
	     // displays reverse of the string 
	     System.out.println(sb.reverse());
	}

}
