package assignment_3_FileProcessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class c2a3q4_2021_DanielMcCarthy {


	

	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		String[] allowedCars = {"porsche", "audi", "mitsubishi", "bmw", "volvo"};
		int[] Map = {0, 0, 0, 0, 0};

		System.out.println("Contents of file:");

		//This correctly prints out the file with my path folder. The path folder will have to be changed for other users.
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\C2-DCU-2020-A1\\src\\assignment_3_FileProcessing\\cars.txt"))) {

			//Print out the contents of the file
			String nextLine;
			while ((nextLine = br.readLine()) != null) {
				System.out.println(nextLine);
				
				//Couldn't get this to work fully.
				//For each word in the file, test if array element matches. Increment Map by 1 at corresponding element.
				for(int i = 0; i < allowedCars.length; i++){
					
					if(nextLine.matches(allowedCars[i])){
						Map[i]++;
					}
				}
				
			}
			
		}
		//Print car names on a newline along with Map at that index.
		for(int i = 0; i < allowedCars.length; i++){
			System.out.println(allowedCars[i] + ": " + Map[i]);
		}

	}

}
