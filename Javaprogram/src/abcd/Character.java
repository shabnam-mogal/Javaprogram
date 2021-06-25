package abcd;

public class Character {
	
	
	
	
	
	static void count(String str){
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			String s="";
			
			while(i < ch.length && ch[i] !=0)
			{
				s=s+ch[i];
				i++;
				
			}
			if(s.length()>0)
				System.out.println(s +"->"+s.length());
		}
	
	}
	
	

	public static void main(String[] args) {
		String str="countull the data is very powerf";
		count(str);
		
	}



	public static boolean isDigit(char c) {
		// TODO Auto-generated method stub
		return false;
	}

}
