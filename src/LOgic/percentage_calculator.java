package LOgic;
import java.util.Scanner;

public class percentage_calculator {
	public static void main(String[] args) {
		//Percentage calculator
        System.out.println("Welcome To the percentage calculator");
        float total = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Mark Of The Subject");
        int total_marks = input.nextInt();
        System.out.println("Enter the Mark Of Subject 1 ");
        float s1 = input.nextFloat();
        total = total+s1;
        System.out.println("Enter The Mark Of Subject 2 ");
        float s2 = input.nextFloat();
        total = total+s2;
        System.out.println("Enter The Mark Of Subject 3 ");
        float s3 = input.nextFloat();
        total =total+s3;
        System.out.println("Enter The Mark Of Subject 4 ");
        float s4 = input.nextFloat();
        total = total+s4;
        System.out.println("Enter The Mark Of Subject 5 ");
        float s5 = input.nextFloat();
        total = total+s5;
        float grandTotal = total*100/(total_marks*5);
        System.out.println("Your Total Percentage  = " + grandTotal + " % " );
         if (grandTotal>90) 
        {System.out.println("Grade IS A "); }      
        if (grandTotal<90 && grandTotal>=80 ) 
        {System.out.println("Grade is B");
        }
        if (grandTotal<80 && grandTotal>=60) {
        System.out.println("Grade IS C ");   
        }
        if (grandTotal<60 && grandTotal>=35) {
        System.out.println("Grade IS D ");   
            }
        System.out.println("Thank You");
        System.out.println("made By Saurabh");
       
	}

}
