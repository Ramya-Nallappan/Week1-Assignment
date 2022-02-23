package week1.day2;

public class Fabonacci {

	public static void main(String[] args) {
		int firstnum =0;
		int secondnum=1;
		int sum;
		int input=8;
		System.out.println("The fibonacci series is : ");
		for (int i=1;i<=input;i++)
		{
			System.out.println(firstnum);//0/1/1/
			sum = firstnum + secondnum;//0+1=1/1+0=1/1+1=2
			secondnum =firstnum; //0/1
			firstnum = sum;//1/1/2
		}
		

	}

}
