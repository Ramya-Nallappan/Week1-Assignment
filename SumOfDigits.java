package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=12345;
		int sum = 0;
		int remainder;
		int quotient;
		
				while(input>0)
				{
					quotient =input/10;
					remainder = input%10;
					sum=sum+remainder;
					input=quotient;
				}
				System.out.println("The sume of all digits are: " + sum);

	}

}
