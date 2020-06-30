/*
 * Generates 100 lowercase letters randomly and assigns them to an array of characters,
 *  as shown in Figure 6.8a. You can obtain a random letter by using the getRandomLowerCaseLetter() method in the RandomCharacter class in
 */
public class CountLettersInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and create a array
		char[] chars=createArray();
		
		// Display the array
		System.out.println("The lowercase letters are ");
		displayArray(chars);
		// count the occurence of array
		int[] counts=countLetters(chars);
		// Display counts
		System.out.println();
		System.out.println("The occurence of each letters are ");
		displayCounts(counts);
	}

	public static char[] createArray() {
		// TODO Auto-generated method stub
		// Declare an array of characters and create it
		char[] chars=new char[100];
		
		// create lowecase letters randomly and assign them to array
		for(int i=0;i<chars.length;i++) {
			chars[i]=RandomCharacter.getRandomLowerCaseLetter();
		return null;
	}
	}

}
