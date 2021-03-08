package epam.hometask1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition :"+add(a,b));
		System.out.println("Subtraction :"+sub(a,b));

		System.out.println("Multiplication :"+mul(a,b));
		System.out.println("Division :"+div(a,b));


	}
	static int add(int num1,int num2)
	  {
	    
	    return num1+num2;
	  }
	static int sub(int num1,int num2)
	  {
	    return num1-num2;
	  }
	  static int mul(int num1,int num2)
	  {
	    return num1*num2;
	  }
	  static int div(int num1,int num2)
	  {
	     return num1/num2;
	  }

}
