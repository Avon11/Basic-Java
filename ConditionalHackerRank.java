import java.util.Scanner;
class ConditionalHackerRank{
	public static void main(String [] args){
	Scanner ob=new Scanner(System.in);
	int n;
	System.out.print("Enter a number");
	n=ob.nextInt();
	if(n%2!=0)
		System.out.print("Weird");
	if(n%2==0){
		if(n>=2 && n<=5)
			System.out.print("Not Weird");
		else if(n>=6 && n<=20)
			System.out.print("Weird");
		else
			System.out.print("Not Weird");
	}
}
}