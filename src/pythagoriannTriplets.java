

public class pythagoriannTriplets {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				for(int k=1;k<=10;k++) {
					if((i*i)==(j*j+k*k)) {
						System.out.println(i+"  "+j+"  "+k);
					}
					
				}
			}
		}
		
	
	}

}
