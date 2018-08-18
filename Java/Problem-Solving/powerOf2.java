//find if no is power of 2 or not
import java.util.Scanner;

public class powerOf2 {

	
		   public static boolean isPowerOf2(int n)
		    {
		        if (n == 0)
		            return false;
		        while(n != 1)
                {
                    if(n%2 != 0)
                        return false;
                    n = n/2;
                }
               return true;
		        
		    }

		
		    public static void main(String[] args)
		    {
		    	Scanner uinput = new Scanner(System.in);
                int limit = uinput.nextInt();
                int[] nValues = new int[limit];
                for(int i=0; i<limit; i++)
                {
                    nValues[i] = uinput.nextInt();
                }
                
                for(int i=0; i<limit; i++)
                {
                    if(isPowerOf2(nValues[i]))
                       System.out.println("YES");
                    else
                       System.out.println("NO");
                       
                }
		       

		        


		    }
}
