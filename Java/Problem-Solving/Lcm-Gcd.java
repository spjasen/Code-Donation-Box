import java.util.Scanner;

public class Lcm-Gcd {


	
		//Recursive Function for gcd or hcf
		   public static int gcd(int a, int b)
		    {
		        if (a == 0)
		            return b;
		        
		        return gcd(b%a, a);
		    }

		
		    public static void main(String[] args)
		    {
		    	Scanner uinput = new Scanner(System.in);
		        int a = 0, b = 0, g, l ;
		        a = uinput.nextInt();
		        b = uinput.nextInt();
		        g = gcd(a, b);
		        
		        //Divide product of a and b with gcd
		        l = (a*b)/g;
		        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
		        System.out.println("LCM(" + a +  " , " + b+ ") = " + l);

		    }
}