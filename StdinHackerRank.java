import java.util.Scanner;
class StdinHackerRank{
	public static void main(String [] args){
		Scanner ob=new Scanner(System.in);
		int num;
		double numdub;
		num=ob.nextInt();
		numdub=ob.nextDouble();
		ob.nextLine();
		String str=ob.nextLine();
		System.out.println("String: "+str);
		System.out.println("Double: "+numdub);
		System.out.println("Int: "+num);
	}
}