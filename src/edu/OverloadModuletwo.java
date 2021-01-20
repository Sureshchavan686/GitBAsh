package edu;

public class OverloadModuletwo {

	public int multiply(int number1, int number2) 
    {
        return number1*number2;
    }
   public float multiply(float number1, float number2, float number3) 
    {
        return number1*number2*number3;
    }
    
    public static void main(String args[])
    {
    	OverloadModuletwo obj = new OverloadModuletwo();
    	System.out.println("multiple of two numbers: "+obj.multiply(12, 6));
    	System.out.println("multiple of three numbers: "+obj.multiply(20f, 21f, 22f));
    	
    }

	
}
