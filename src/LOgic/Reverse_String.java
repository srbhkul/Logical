package LOgic;

public class Reverse_String {

	public static void main(String[] args) {
	
	String a="Saurabh Kulkarni";	
	String b []=a.split(" ");	
	String d="";
	
	for (int i=0;i<=b.length-1;i++) {
		String c=b[i];
		
		for(int j=c.length()-1;j>=0;j--) {
		
		 d = d+c.charAt(j);
		
		}d=d+" ";	
	}
	System.out.print(d);		
	}

}
