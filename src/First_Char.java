


public class First_Char {
public static void main(String[] args) {
	String s= "saurabh";
	int count=0; 
	for(int i=0;i<s.length();i++) {
		for(int j=1;j<s.length();j++ ) {
		if(s.charAt(i)==s.charAt(j)) {
			count++;
			if(count==1) {
				System.out.println(s.charAt(i));
				break;
			}
	}
		}
	}

}
}
