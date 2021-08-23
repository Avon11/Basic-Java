import java.util.Scanner;
class Triangle{
	public static void main(String [] args){
		byte a,b,c;
		Scanner ob= new Scanner(System.in);
		a=ob.nextByte();
		b=ob.nextByte();
		c=ob.nextByte();
		if(a+b>=c & b+c>=a & a+c>=b)
			System.out.println("Parameter is "+(a+b+c));
		else
			System.out.println("Input is invalid");
	}
}