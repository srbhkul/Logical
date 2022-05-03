package Rivision;



public class Capital {

	public static void main(String[] args) {
		String s="MY name IS Slim Shady";
		int Upcount =0;
		int lowcount =0;
		
		for(int i=0;i<=s.length()-1;i++) {
			int a=s.charAt(i);
			if(a>=65 && a<=96) {
				Upcount=Upcount+1;
			}if(a>=97 && a<=122) {
				lowcount=lowcount+1;
			}
		}System.out.println("Count Of Uper Case "+Upcount);
		System.out.println("Count of lower Case "+lowcount);
		
	}
         
}
