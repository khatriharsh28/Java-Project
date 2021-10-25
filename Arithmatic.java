import java.util.Scanner;

public class Arithmatic 
{
	int num,i;
	float a,b,result;
	double fact;
	Scanner sc=new Scanner(System.in);
	
	void get_no()
	{
		System.out.print("Enter 2 numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	void add()
	{
		get_no();
		result=a+b;
		System.out.print("Addition is "+result);
	}
	
	void sub()
	{
		get_no();
		result=a-b;
		System.out.print("Subtraction is "+result);
	}
	
	void mul()
	{
		get_no();
		result=a*b;
		System.out.print("Multiplication is "+result);
	}
	
	void div()
	{
		get_no();
		if(b==0)
			System.out.println("Division by 0 is not possible");
		else
		{
			result=a/b;
			System.out.print("Division is "+result);
		}
	}
	
	double factorial(int num)
	{
		fact=1;
		for(i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
