import java.util.Scanner;

public class Base {

	public static void main(String[] args) 
	{
		int ch;
		Arithmatic A=new Arithmatic();
		Scientific_calc Cal=new Scientific_calc();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("+-----------------------------------------------+");
		System.out.println("| 1.Addition \t\t 2.Subtraction \t\t|\n| 3.Multiplication \t 4.Divison \t\t 5.Round Off \t\t|");
		System.out.println("| 6.Floor \t\t 7.Ceil \t\t|\n| 8.Power(n^m) \t\t 9.Square Root \t|\n| 10.Degree to Radian\t 11.Radian to Degree \t|");
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
					Cal.round_off();
					break;
					
				case 6:
					Cal.floor();
					break;
					
				case 7:
					Cal.ceil();
					break;
					
				case 8:
					Cal.power();
					break;
					
				case 9:
					Cal.Sq_rt();
					break;
				case 10:
					Cal.deg_to_rad();
					break;
				default:
					System.out.println("Invalid Choice");
				
			}
			System.out.print("\n\n*************************");
			
		}while(ch<11);
		sc.close();

	}

}
