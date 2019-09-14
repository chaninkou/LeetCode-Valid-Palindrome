package validpalindrome;

public class CheckIfValidPalindromeFunction {
	public boolean isPalindrome(String s) {
		// If its empty, it is automatically a valid palindrome
		if(s.isEmpty()){
			return true;
		}
		
		// Starts from 0 and last element to move in the middle
		int head = 0;
		int tail = s.length() - 1;
		
		char cHead, cTail;
		
		// Only stop the loop when it gets to the middle means we compare them all
		while(head <= tail){
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			
			// isLetterOrDigit is to ignore the non letter or digit by going to the next element
			if(!Character.isLetterOrDigit(cHead)){
				head++;
			} else if (!Character.isLetterOrDigit(cTail)){
				tail--;
			} else {
				// If they do not match, it is not a valid palindrome right away
				if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
					return false;
				}
				
				// Move to the next element
				head++;
				tail--;
			}
		}
		
		// If it gets here, that means its a valid palindrome
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
