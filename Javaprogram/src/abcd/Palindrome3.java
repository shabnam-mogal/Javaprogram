package abcd;

import java.util.Scanner;

public class Palindrome3 {

	public static void main(String[] args) {

		
		
		
		
	String reverse="";
	System.out.println("enter the string value");
	
Scanner a=new Scanner(System.in);	
String b=a.nextLine();
for(int i=b.length()-1;i>=0;i--){
	reverse=reverse+b.charAt(i);
}
if(b.equals(reverse)){
	System.out.println("given string is palindrom");
}
else{
	System.out.println("given string is not palidrome");
}
	}

}
