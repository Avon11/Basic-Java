import java.util.Scanner;
class TakingInput{
	public static void main(String [] args){
		int a,b,c;
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter Value of A and B");
		a=ob.nextInt();
		b=ob.nextInt();
		c=a+b;
		System.out.println("Sum of values is "+c);

		
	}

}