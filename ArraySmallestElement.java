import java.util.Scanner;
class ArraySmallestElement{
	public static void main(String[]args){
		int n,i,min;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter number of element in array");
		n=ob.nextInt();
		int ele[]=new int[n];
		for(i=0;i<ele.length;i++){
			ele[i]=ob.nextInt();
		}
		min=ele[0];
		for(i=0;i<ele.length;i++){
			if(ele[i]<min)
				min=ele[i];
		}
		System.out.println("Smallest element is "+min);
	}
}
		