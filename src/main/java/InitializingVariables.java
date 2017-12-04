public class InitializingVariables {

	/*
	The sayHappyBirthday() method should print out HAPPY BIRTHDAY
	by iterating through a for-loop and adding each individual character to a string
	before printing it.

	Something is wrong with the logic though and it doesn't quite work correctly. Make changes
	to the code so that HAPPY BIRTHDAY is printed.
	Refer to pages 43 - 46 of the textbook.
	*/
	public static void sayHappyBirthday() {
		char[] happyBirthdayArray = {'H', 'A', 'P', 'P', 'Y', ' ', 'B',
																'I', 'R', 'T', 'H', 'D', 'A', 'Y'};


		for (char aHappyBirthdayArray : happyBirthdayArray) {
			String happyBirthdayString = "";
			happyBirthdayString += aHappyBirthdayArray;
		}
		//TODO print out happyBirthdayString
	}

	public static void main(String args[]) {
		sayHappyBirthday();
	}

}
