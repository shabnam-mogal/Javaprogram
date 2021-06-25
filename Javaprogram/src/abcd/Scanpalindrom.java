package abcd;

import java.util.Scanner;

public class Scanpalindrom {

	public static void main(String[] args) {


		
		
		
StringBuffer a=new StringBuffer();
Scanner b=new Scanner(System.in);
System.out.println("enter the value");
String capt=b.nextLine();
a.reverse();
if(a.equals(b.toString())){
	System.out.println("passes");
}

else{
	System.out.println("failed");
}

	}

}
