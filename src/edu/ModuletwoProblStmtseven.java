package edu;

public class ModuletwoProblStmtseven {

	int x;
	int number =30;
	float floatNumber = 10;
	public ModuletwoProblStmtseven(int number)
	{
		number = this.number;
	}
	
	public ModuletwoProblStmtseven(float floatNumber)
	{
		floatNumber = this.floatNumber;
	}
	
	public ModuletwoProblStmtseven()
	{
		 x =5;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModuletwoProblStmtseven obj = new ModuletwoProblStmtseven();
		System.out.println(obj.number);
		System.out.println(obj.floatNumber);
		System.out.println(obj.x);
		
	}

}
