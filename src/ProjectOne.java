/** 
 * 	Programming Project #1
 * 	Nick Charles Martin
 * 	CIS 2151 
 * 	Prof. John Baugh
 */


import java.util.*;
import java.io.*;

public class ProjectOne 
{

	public static void main(String[] args) throws IOException 
	{
		
		int onTime = 0; // late = 0; Probably not needed
		int totalStudents, canThres, arrivalTime;
				
		File file = new File("input.txt");
		Scanner inputFile = new Scanner(file);
		int testCases = inputFile.nextInt();
		
		
		for (int i = 0; i < testCases; i++)
		{
			totalStudents = inputFile.nextInt();
			canThres = inputFile.nextInt();
			
			for (int j = 0; j < totalStudents; j++)
			{
				arrivalTime = inputFile.nextInt();
				
				if(arrivalTime <= 0)
					onTime++;
					
		//		else if(arrivalTime > 0)	Probably not needed!
		//			late++;
							
			}
		
			if(canThres > onTime)
				System.out.println("yes");
			
			else
				System.out.println("no");
			
		}
		inputFile.close();
		
	}

}
