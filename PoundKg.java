import java.util.Scanner;
class PoundKg{
	public static void main(String [] args){
		double pound,kg;
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter weight in pound");
		pound=ob.nextDouble();
		kg=0.456*pound;
		System.out.println("Weight in Kg ="+kg);
	}
}