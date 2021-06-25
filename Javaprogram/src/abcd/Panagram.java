package abcd;

public class Panagram {

	public static void main(String[] args) {
		// 
		
		
		 String sample = "";

	        char[] chars = sample.toCharArray();

	        StringBuilder sb = new StringBuilder();
	       
	        for(char c : chars){

	           if(Character.isDigit(c)){

	              sb.append(c);

	           }

	        }

	        System.out.println("No in String is: "+sb);

	
	
	}

}
