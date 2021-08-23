import java.util.Scanner;
class MultipleHackerRank{
	public static void main(String[]args){
		Scanner ob=new Scanner(System.in);
		int num,mul;
		System.out.println("Enter number");
		num=ob.nextInt();
		for(int i=1;i<=10;i++){
			mul=num*i;
			System.out.println(num + "x"+ i + "=" + mul);
		}
	}
}