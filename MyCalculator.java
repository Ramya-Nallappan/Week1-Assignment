package week1.day2;

public class MyCalculator{
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Obj = new Calculator();
		Obj.add(5,10,20 );
		System.out.println(Obj.add(5, 10, 20));
		int subtraction = Obj.sub(8, 4);
		System.out.println(subtraction);
		System.out.println(Obj.mul(8,8));
		float Div= Obj.divide(20, 2);
		System.out.println(Div);
		//System.out.println(division);
	
		

	}

}