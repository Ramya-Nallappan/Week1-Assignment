package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=31;
	    boolean bool=false;
System.out.println("Identify if the given number is prime or not:");
for (int i = 2; i < input; i++) {
		if (input%i==0)
		bool= true;
}
if (bool==true)
	System.out.println("The given number "+ input + "is not a prime number");
else
	System.out.println("The given number "+ input + " is a prime number");

}
		
}


	


