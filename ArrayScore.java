import java.util.Scanner;
class ArrayScore{
	public static void main(String [] args){
		int n,i;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter number of students");
		n=ob.nextInt();
		int score[]=new int[n];
		for(i=0;i<score.length;i++){
			score[i]=ob.nextInt();
		}
		for(i=0;i<score.length;i++){
			if(score[i]>90)
				System.out.println("Score is "+score[i]+" Grade is A");
			else if(score[i]>80 && score[i]<90)
				System.out.println("Score is "+score[i]+" Grade is B");
			else if(score[i]>70 && score[i]<80)
				System.out.println("Score is "+score[i]+" Grade is C");
			else if(score[i]>60 && score[i]<70)
				System.out.println("Score is "+score[i]+" Grade is D");
			else if(score[i]>50 && score[i]<60)
				System.out.println("Score is "+score[i]+" Grade is E");
			else
				System.out.println("Score is"+score[i]+" Grade is F");
		}
	}
}