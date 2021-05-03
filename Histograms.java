package week4;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

import java.io.*;
import java.util.*;



public class Histograms extends ConsoleProgram {
	
	
	
	public void run() {
		makeArray();
		inputScores();
		showScores();
	}
	
	private void makeArray() {
		scoreArray = new int[11];
		for (int i = 0; i <= 10; i++) {
			scoreArray[i] = 0;
		}
	}
	
	private void inputScores() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("MidtermScores.txt"));
			
			while (true) {
				String line = br.readLine();
				
				if (line == null) break;
				int score = Integer.parseInt(line);
				if (score < 0 || score > 100) {
					throw new ErrorException("Score is out of range");
				} else {	
					int tens = score / 10;
					scoreArray[tens]++;
				}
				br.close();
			}
		}
		catch (IOException e) {
			println("An I/O exception has occured");
		}
	}
	
	
	
	private void showScores() {
		for (int tens = 0; tens <= 10; tens++) {
			String line = null;
			switch (tens) {
			case 0: line = "00-09: "; break;
			case 1: line = "10-09: "; break;
			case 2: line = "20-09: "; break;
			case 3: line = "30-09: "; break;
			case 4: line = "40-09: "; break;
			case 5: line = "50-09: "; break;
			case 6: line = "60-09: "; break;
			case 7: line = "70-09: "; break;
			case 8: line = "80-09: "; break;
			case 9: line = "90-09: "; break;
			case 10: line = "100: "; break;
			}
			String asterisks = createAsterisks(scoreArray[tens]);
			System.out.println(line + asterisks);
		}
	}
	
	private String createAsterisks(int a) {
		String asterisks = "";
		for (int i = 0; i < a; i++) {
			asterisks += "*";
		}
		return asterisks;
	}
	
	private int[] scoreArray;
	

	
}
