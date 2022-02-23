package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
//printing the intersection values between 2 arrays
		int[] Arr1 = {2,1,11,4,6,7};

int [] Arr2= {2,1,8,4,3,7};
for (int i=0;i<Arr1.length;i++)
{
	for (int j=0;j<Arr2.length;j++)
if (Arr1[i]==Arr2[j])
	System.out.println(Arr1[i]);
}
	}

}
