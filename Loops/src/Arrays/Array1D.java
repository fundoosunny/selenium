package Arrays;

public class Array1D {

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		/*
		 * int s[] =
		 * {0,1,2,3,4,56,7,78,88,8,897,987,97,86,98,9879,8876,613,123,21398,18981}; for
		 * (int i=0;i<21;i++) { int abc=s[i]; System.out.println(abc); }
		 * 
		 */	
		int[] array = new int[5];		
		String[] myArray = new String [13];
		/*
		 * System.out.println(myArray); System.out.println(array.length); //length is
		 * not methoda-- final variable
		 */
		/*
		 * array[0]=10; array[2]=20; // System.out.println(array[2]);
		 */	
		for(int index=0;index<array.length;index++)
	{
			 array[index]=(int)(Math.random()*1000);
			 
	System.out.println(array[index]);	
	}
	
//	for (int var:array) 
	//{ System.out.println(var);
	//}

	System.out.println("reverse order");	
for (int index =array.length-1;index>=0;index--)
{
System.out.println(array[index]);	
}
	
	}

}
