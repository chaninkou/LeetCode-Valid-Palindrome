package validpalindrome;

public class CheckIfValidPalindromeFunction {
	public boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;
		}

		int head = 0;
		int tail = s.length() - 1;

		char cHead, cTail;

		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);

			// If current character is not letter or numbers
			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			} else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				// If this return false, then we know immediately that they
				// don't match
				if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
					return false;
				}

				head++;
				tail--;
			}
		}

		// If it gets here, that means they were always the same from first to
		// last
		return true;
	}

	// Cool solution with regular expression
	// public boolean isPalindrome(String s) {
	// // Replace all the character that is not letter or numbers and make it
	// lowercase
	// String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

	// // Using reverse() function in StringBuffer to reverse a string
	// String reversed = new StringBuffer(actual).reverse().toString();

	// // If the actual string is equal to the reverse, than it is valid
	// palindrome
	// return actual.equals(reversed);
	// }
}
