import java.util.Scanner;
class Weight{
	public static void main(String [] args){
		double wgt;
		Scanner ob=new Scanner(System.in);
		wgt=ob.nextDouble();
		if(wgt<=1)
			System.out.println("Cost ="+(wgt*3.5));
		else if(wgt>1&&wgt<=3)
			System.out.println("Cost ="+(wgt*5.5));
		else if(wgt>3&&wgt<=10)
			System.out.println("Cost ="+(wgt*8.5));
		else if(wgt>10&&wgt<=20)
			System.out.println("Cost ="+(wgt*10.5));
		else
			System.out.println("Canot be shipped");
	}
}
		