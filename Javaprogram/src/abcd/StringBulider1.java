package abcd;

public class StringBulider1 {

	public static void main(String[] args) {
		
		
		
		
StringBuilder ab=new StringBuilder("welcome to selenium data ")	;
System.out.println(ab);
//stringbuffer (synchronised)only threadat time
//stringbuilder (non synchronised)many threads at same time		

//System.out.println(ab.reverse());
System.out.println(ab.append("parveen"));
System.out.println(ab.delete(1, 6));

System.out.println(ab.insert(1,"parveen"));
System.out.println(ab.replace(1, 4, "salman"));
	}

}
