package validpalindrome;

public class CheckIfValidPalindromeFunction {
	// two pointers methods, O(n) solution
	public boolean isPalindrome(String s) {
		// If its empty, it is automatically a valid palindrome
		if(s.isEmpty()){
			return true;
		}
		
		int head = 0;
		int tail = s.length() - 1;
		
		char cHead, cTail;
		
		while(head < tail){
			cHead = s.charAt(head);
			cTail = s.charAt(tail);
			
			// isLetterOrDigit is to ignore the non letter or digit
			if(!Character.isLetterOrDigit(cHead)){
				head++;
			} else if (!Character.isLetterOrDigit(cTail)){
				tail--;
			} else {
				// The front and end have to match even if A == a
				if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
					return false;
				}
				
				// Move to the next element
				head++;
				tail--;
			}
		}
		
		// valid palindrome
		return true;
	}

	// Cool solution with regular expression
	public boolean isPalindrome2(String s) {
		// ^ will make sure everything that is not A-Za-z0-9
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

		// Using reverse() function in StringBuffer to reverse a string
		String reversed = new StringBuffer(actual).reverse().toString();

		// // If the actual string is equal to the reverse, than it is valid
		// palindrome
		return actual.equals(reversed);
	}
}
