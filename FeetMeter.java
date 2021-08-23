import java.util.Scanner;
class FeetMeter{
	public static void main(String [] args){
		double feet;
		double meter;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Distance in feet");
		feet=ob.nextDouble();
		meter=feet*0.35;
		System.out.println("Meter Distance "+meter);
}
}