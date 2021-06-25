package abcd;

public class Sample {
	
	
	
	
	
	
	
	
	
	
//stroing the values in string progrm.
public static void main(String args[]){
	String s1=new String("ABC");//store in heap memory
	String s2="abc";//stored in string constant pool
	System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.length());//length of the string
    System.out.println(s2.length());//length of the string
  
	//store the value in characters use in charat method 
    //System.out.println(s1.charAt(1));//store the value in 0  posion
    //System.out.println(s2.charAt(4));
    System.out.println(s1.concat(s2));//join the two output in same string used by concat method 
    System.out.println(s2.concat(s1));
    //equals of the two strings 
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
    
}

}
