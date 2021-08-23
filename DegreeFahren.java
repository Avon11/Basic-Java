import java.util.Scanner;
class DegreeFahren{
	public static void main(String args[]){
		double cel,fre;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter temprature in Celsius	degree");
		cel=ob.nextDouble();
		fre=((9*cel)/5)+32;
		System.out.println("Temprature in fahrenheit = "+fre);
	}
}
