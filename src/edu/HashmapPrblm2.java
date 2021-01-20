package edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapPrblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> Animals = new HashMap<>(); 
  
        
        Animals.put("Zebra", "Black"); 
        Animals.put("Lion", "Brown"); 
        Animals.put("Tiger", "Yellow"); 
        
  
        
        if (Animals.containsKey("Code")) 
            System.out.println("Testing .containsKey : " + 
                                           Animals.get("Code")); 
  
       
        Set<String> Animalkeys = Animals.keySet(); 
        System.out.println("Initial keys  : " + Animalkeys); 
  
  
        
        Collection<String> Animalvalues = Animals.values(); 
        System.out.println("Initial values : " + Animalvalues); 
  
         
        Animals.put("Rhino", "SingleHorned"); 
  
       
        System.out.println("New Keys : " + Animalkeys); 
        System.out.println("New Values: " + Animalvalues); 

		
	}

}
