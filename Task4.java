package Codsoft.com;
import java.util.*;
import java.text.DecimalFormat;
public class Task4{
	

	public static void main(String[]args)
	{
		double rupee,dollar,pound,code;
		
		DecimalFormat f=new DecimalFormat();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to currency converter Enter 1 for rupee,2 for dollae,3 for pound");
		code= sc.nextInt();
		if(code==1)
		{
			System.out.println("Enter amount in rupees:");
			rupee=sc.nextDouble();
			dollar=rupee/83.27;
			System.out.println("Dollar: "+f.format(dollar));
			pound=rupee/105.18;
			System.out.println("Pound: "+f.format(pound));
		}
		else if(code==2)
		{
			System.out.println("Enter amount in dollar:");
			dollar=sc.nextDouble();
			rupee=dollar*83.27;
			System.out.println("Rupee: "+f.format(rupee));
			pound=dollar*0.79;
			System.out.println("Pound: "+f.format(pound));
		}
		else if(code==3)
		{
			System.out.println("Enter amount in Pound:");
			pound=sc.nextDouble();
			rupee=pound*0.0095;
			System.out.println("Rupee: "+f.format(rupee));
			dollar=pound*1.26;
			System.out.println("Pound: "+f.format(dollar));
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
