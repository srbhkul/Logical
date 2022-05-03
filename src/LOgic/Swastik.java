
package LOgic;

public class Swastik {

	public static void main(String[] args) {
	int n=5;
	for (int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
     if(i==3 || j==3 || j==1 && i<3 || i==5 && j<3 ||j==5 && i>=3 || i==1 && j>=3  ) {
				System.out.print(" *");
			}else {
				System.out.print("  ");
			}
		}System.out.println( );
		
	}
  
	}

}
//j==1 && i<=2 || i==5 && j<=2 || j==5 && i>=3 || i==1 && j>=3