package validpalindrome;

public class Main {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		
		System.out.println("Input: " + s);
		
		CheckIfValidPalindromeFunction solution = new CheckIfValidPalindromeFunction();
		
		System.out.println("Solution: " + solution.isPalindrome(s));
	}
}
