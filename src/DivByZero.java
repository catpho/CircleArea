

public class DivByZero {
    public static void main(String args[])
    {
    	
        int var1 = 15;
        int var2 = 5;
        int var3 = 0;
        int ans1 = var1 / var2;
        int ans2 = 0;
        
   try {
	   
   
        // This statement causes a runtime error,
        // as 15 is getting divided by 0 here
        ans2 = var1 / var3;
   }
   catch(java.lang.ArithmeticException excpt ) {
	   System.out.println("System cannot process because of Arithmetic exception. Default answer will be 0, but also incorrect.");
   }
        System.out.println(
            "Division of va1"
            + " by var2 is: "
            + ans1);
        System.out.println(
            "Division of va1"
            + " by var3 is: "
            + ans2);
    }
    }


    
    