import java.util.Scanner;

public class Base {

	public static void main(String[] args) 
	{
		int ch;
		Arithmatic A=new Arithmatic();
		Scientific_calc Cal=new Scientific_calc();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("+-----------------------------------------------+");
		System.out.println("| 1.Addition \t\t 2.Subtraction \t\t|\n| 3.Multiplication \t 4.Divison \t\t|\n| 5.Factorial\t\t 6.Round Off \t\t|");
		System.out.println("| 7.Floor \t\t 8.Ceil \t\t|\n| 9.Power(n^m) \t\t 10.Square Root \t|\n| 11.Degree to Radian\t 12.Radian to Degree \t|");
		System.out.println("| \t***Press any caracter to EXIT*** \t|");
		System.out.println("+-----------------------------------------------+");

		do
		{
			System.out.print("\nEnter your choice:- ");
			ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
					A.add();
					break;
				
				case 2:
					A.sub();
					break;
				
				case 3:
					A.mul();
					break;
				
				case 4:
					A.div();
					break;
	
				case 5:
					System.out.print("Enter no to find factorial:- ");
					A.num=sc.nextInt();
					A.fact=A.factorial(A.num);
					System.out.println("Factorial of "+A.num+" is "+A.fact);
					break;
				
				case 6:
					Cal.round_off();
					break;
					
				case 7:
					Cal.floor();
					break;
					
				case 8:
					Cal.ceil();
					break;
					
				case 9:
					Cal.power();
					break;
					
				case 10:
					Cal.Sq_rt();
					break;
				case 11:
					Cal.deg_to_rad();
					break;
				default:
					System.out.println("Invalid Choice");
				
			}
			System.out.print("\n\n*************************");
			
		}while(ch<12);
		sc.close();

	}

}
