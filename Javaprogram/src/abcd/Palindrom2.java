package abcd;

public class Palindrom2 {

	public static void main(String[] args) {
		
		
		
		
		
	String s1="madam";
	StringBuffer s2=new StringBuffer(s1);
	s2.reverse();
	//System.out.println(s2);
	//System.out.println(s1);
	if(s1.equals(s2.toString())){
		System.out.println("madam is palidrom");
		
	}
	else{
		System.out.println("string is not palidrome");
	}
	
	

	}

}
