package LOgic;


import java.util.Random;
import java.util.Scanner;

public class ScissorPaperRock {

	public static void main(String[] args) {
	
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userIP=sk.nextInt();
        
        Random random=new Random();
        int compIP= random.nextInt(3);
        
        if(userIP==compIP) {
        	System.out.println("Draw");
        }else if(userIP==0 &&compIP==2 || userIP==1 && compIP==0
        		||userIP==2 && compIP==1) {
        	System.out.println("You Win");
        	}else {
        		System.out.println("Computer Win ");
        	}System.out.println("Computer Choise: "+compIP);
	}

}
