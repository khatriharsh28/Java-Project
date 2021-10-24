//import java.Math.*;
import java.util.Scanner;

public class Scientific_calc 
{
	double val,exp;
	
	Scanner sc=new Scanner(System.in);

	void round_off()
	{	
		System.out.print("Enter number:- ");
		val=sc.nextDouble();
		System.out.print(Math.round(val));
	}
	void floor()
	{	
		System.out.print("Enter number:- ");
		val=sc.nextDouble();
		System.out.print(Math.floor(val));
	}
	void ceil()
	{	
		System.out.print("Enter number:- ");
		val=sc.nextDouble();
		System.out.print(Math.ceil(val));
	}
	
	void power()
	{
		System.out.print("Enter number and Exponent {number^exponent} :- ");
		val=sc.nextDouble();
		exp=sc.nextDouble();
		System.out.print((int)val+"^"+(int)exp+" = "+(int)Math.pow(val, exp));
	}
	
	void Sq_rt()
	{
		System.out.print("Enter number :- ");
		val=sc.nextDouble();
		System.out.print("Square Root of "+val+" = "+Math.sqrt(val));
	}
	
	void deg_to_rad()
	{
		System.out.print("Enter value(in Degree) :- ");
		val=sc.nextDouble();
		System.out.print("Degree ="+val+", Radian ="+Math.toRadians(val));
		
	}
	
	void rad_to_deg()
	{
		System.out.print("Enter value(in Radian) :- ");
		val=sc.nextDouble();
		System.out.print("Radian ="+val+", Degree ="+Math.toDegrees(val));
		
	}

}
