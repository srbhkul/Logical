package arrayNew;

public class FindduplicateAndHowManyTimeDuplicate {

	public static void main(String[] args) {
		String sk="saurabh kulkarni";
		String dk = sk.replace(" ","");
		int count = 0;
		int a=0;
		for(int i=0;i<dk.length();i++) {
			
			for(int j=i+1;j<dk.length();j++) {
				if(dk.charAt(i)==dk.charAt(j)) {
				count++;
					if(count>0) {	
				sk.replace(sk.charAt(i),' ' );
				 dk = sk.replace(" ","");
				a = sk.length()-dk.length();
				System.out.println(sk.charAt(i)+" "+a);
				}
				}
				
			}
			
			
		}
		
		
		
	}
}

