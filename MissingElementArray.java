package week1.day2;

import java.util.Arrays;

public class MissingElementArray {

//Missing Single element in an array	
	public static void main(String[] args) {
		int[] Array= {1,2,3,4,7,6,8};
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
		int start;
		start=Array[0];
					
			for (int i=0;i<Array.length;i++)
			{
			
						if (Array[i]!=start)	
			{
				System.out.println(start);
				
			break;
			}
               start++;			

			}
			
		}
		
	}


