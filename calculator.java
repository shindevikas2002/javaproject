import java.util.Scanner;

public class calculator {
	
	void menu()
	{
		System.out.println("type 1 for addition");
		System.out.println("type 2 for substraction");
		System.out.println("type 3 for multiplication");
		System.out.println("type 4 for division");
		
	}

	public static void main(String [] args) {
		
		calculator cal=new calculator();
		double num1 = 0,num2 = 0,result=0;
		int operation=0,again=0,resultagain=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number");
		num1=sc.nextDouble();
		do {
		System.out.println("enter second number");
		num2=sc.nextDouble();
		
		if (resultagain==1)
		{
			num1=result;
		}
		
		double addition = num1+num2;
		double substraction= num1-num2;
		double multiplication= num1*num2;
		double division= num1/num2;
		cal.menu();
		operation=sc.nextInt();
		switch(operation) {
		case 1: 
			System.out.println(addition);
			result=addition;
			break;
		case 2:
			System.out.println(substraction);
			result=substraction;
			break;
		case 3: 
			System.out.println(multiplication);
			result=multiplication;
			break;
		case 4:
			System.out.println(division);
			result=division;
			break;
		default:
			System.out.println("wrong selection");
		}
			
			System.out.println("press 1 if you want to continue with result");
		      resultagain=sc.nextInt();
			
				System.out.println("press 1 if you want to do another calation else press 0");
				again=sc.nextInt();
			
		}
		while(again==1);
			
		
			
		
		
		
		
	}
}

	
		
			
		
		
