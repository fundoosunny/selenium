public class BreakandCont {

public void go() 

{
System.out.println("First");
//break;
// continue;
System.out.println("Last");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BreakandCont b= new BreakandCont(); b.go();
		 */
		int i=0;	
		for (i=0;i<10;i++)
			
		{
			if (i>=5&&i<=7)
				continue;  //continue to skip the iterations
			/*
			 * if (i==5) break; System.out.println(i); 
			 */
			System.out.println(i);
		}
		System.out.println("outside the loop");
		
	}

}
