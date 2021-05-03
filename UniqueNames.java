package week4;

import acm.program.ConsoleProgram;
import java.util.*;
public class UniqueNames extends ConsoleProgram {
	
	// Adds name to list
	public void run() {
		
		ArrayList<String>sList = new ArrayList<String>();
		while (true) {
				String name = readLine("Enter name: ");
				if (name.equals("")) break;
				// Adds only unique names
				if (!sList.contains(name)) {
					sList.add(name);
				}
		}
		System.out.println("Unique name list contains: ");
		printSList(sList);	
	}
	
	public void printSList(ArrayList sList) {
		for(int i =0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
	}
	
}
