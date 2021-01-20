package edu;

import java.io.IOException;
import java.util.ArrayList;


public class ProblemstmtOneModthree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<Integer> num = new ArrayList<Integer>(n); 
		
		for(int i=0; i<=n; i++)
		{
			 num.add(i);
		}
		System.out.println(num);
		
		for(int j=0;j<num.size();)
		{
			int numRemoved =num.remove(j);
			System.out.println(numRemoved+ " is removed from list");
		}
		
		
	}

}
