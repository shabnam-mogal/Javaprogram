package abcd;

public class Palindrom {

	public static void main(String[] args) {
		
		
		
		String s1="madam";
		StringBuffer b=new StringBuffer(s1);
		b.reverse();
		if(s1.equals(b.toString())){
			System.out.println("madam is a palindrom");
		}
		else{
			System.out.println("madam is a not palindrom");
		}
	}

}
