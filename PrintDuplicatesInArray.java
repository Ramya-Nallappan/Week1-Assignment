package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] Array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
   System.out.println("The duplicate Arrays elements are: ");
 
   for (int i=0;i<Array.length-1;i++)
   {
	for (int j=i+1;j<Array.length;j++)   
	{
		if(Array[i]==Array[j])
		{
			System.out.println(Array[i]);
			
		}
	}
   }
   
	}

}
