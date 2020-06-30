import java.util.Scanner;

/*
 * Each ticket for the Pick-10 lotto has 10 unique numbers ranging from 1 to 99. Suppose you buy a lot of tickets and like to have them cover all 
 * numbers from 1 to 99. Write a program that reads the ticket numbers from a file and checks whether all numbers are covered. Assume the last number 
 * in the file is 0. Suppose the file contains the numbers 
 * 80 3 87 62 30 90 10 21 46 27 12 40 83 9 39 88
 *  95 59 20 37 80 40 87 67 31 90 11 24 56 77 11 48 51 42 
 *  8 74 1 41 36 53 52 82 16 72 19 70 44 56 29 33 54 64 99 14 
 *  23 22 94 79 55 2 60 86 34 4 31 63 84 89 7 78 43 93 97 45
 *   25 38 28 26 85 49 47 65 57 67 73 69 32 71 24 66 92 98 
 *   96 77 6 75 17 61 58 13 35 81 18 15 5 68 91 50 76 0
 *    Your program should display The tickets cover all numbers Suppose the file contains
 *     the numbers 11 48 51 42 8 74 1 41 
 *     36 53 52 82 16 72 19 70 44 56 29 33 0
 */
public class Lotto_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean[] isCovered = new boolean[99]; // befault is false
		
		// Read each number and mark its corresponding element covered
		int number=in.nextInt();
		while(number!=0) {
			isCovered[number-1]=true;
			number=in.nextInt();
		}
		// check whether all covered
		boolean allCovered=true; // assumes all covered initially
		for(int i=0;i<isCovered.length;i++) {
			if(!isCovered[i]) {
				allCovered=false; // find one number not covered
				break;
			}
		}
		// Display result
		if(allCovered)
			System.out.println("The tickets cover all numbers");
		else
			System.out.println("The tickets doesnot contain all the number");
	}

}
