package edu;

public class OverloadModuletwo2 extends OverloadModuletwo {

	public int multiply(int number1, int number2) 
    {
        return number1+number2;
    }
   
   
    public static void main(String args[])
    {
    	OverloadModuletwo obj = new OverloadModuletwo2();
    	System.out.println("Addition of two numbers: "+obj.multiply(12, 6));
    	System.out.println("multiple of three numbers: "+obj.multiply(20f, 21f, 22f));
    	
    }

	
}
