package com.kevin.utils; 
public class Tools {
	public void printMemory(){
		Runtime rt = Runtime.getRuntime();
		System.out.println("System total memory :"+rt.totalMemory() );
		System.out.println("System: free memory :"+rt.freeMemory() );
	}	
}
