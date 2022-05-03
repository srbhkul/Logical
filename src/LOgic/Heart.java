package LOgic;

public class Heart {

	public static void main(String[] args) {
		
	for (int i =1;i<7;i++) {
			
	for(int j=1;j<8;j++) {
	     if(i==1 && j==2||i==1 && j==3||i==1 && j==6||i==1 && j==5||i==2 && j==4||j==1 &&i==2
	      ||j==1 && i==3	|| j==7 && i==2 || j==7&& i==3 || i-j==2 || i+j==10) {
			System.out.print(" *");
		}else {
			System.out.print("  ");
				}
			}System.out.println();
		}

	}

}
