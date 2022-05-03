package arrayNew;

public class FindRepeatNumberFromArray {

	public static void main(String[] args) {
	int[] n= {10,23,10,17,19,17};
	int count=0;
	
	
	for(int i=0;i<n.length;i++){
		for(int j=i+1;j<n.length;j++){
		if(n[i]==n[j]) {
		
			System.out.println(n[j]);
		}
	}}
	
		
 
	}

}
