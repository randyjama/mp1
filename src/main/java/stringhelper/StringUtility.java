package stringhelper;

import java.util.Arrays;
import java.util.Collections;

public class StringUtility {

	/*
	 * Consult the methods that are declared in class String. Visit
	 * docs.oracle.com/javase/8/docs/api/java/lang/String.html. Some important
	 * methods are charAt, length(), trim, substring, indexOf, isEmpty,
	 * lastIndexOf, startsWith, endsWith, split.
	 */

	/**
	 * Return true iff str is a palindrome: it reads the same backwards and
	 * forwards.
	 *
	 * Examples: For str = "", return true For str = "ab", return false For str
	 * = "aba", return true. For str = "abba", return true. For str = "Madam,
	 * I'm Adam", return false. For str = "MadamImAdam", return false. For str =
	 * "madamimadam", return true.
	 * 
	 * @param str
	 *            is not null
	 * @return true if str is a palindrome and false otherwise
	 */
	
	//MAYBE TRY ONE ARRAY THEN JUST COMPARE THE FIRST AND LAST INDEX THEN MEET IN THE MIDDLE
	public static boolean isPalindrome(String str) {
		// Do not visit each character of the string more than once each.
		
		char [] charArray = str.toCharArray();
		int i = 0;
		int j = charArray.length-1;
		if(charArray.length == 0) { //check for specific case of an array with length 0
			return true;
		}
		else {
			while (i <= charArray.length / 2) {
				if (charArray[i] == charArray[j]) { //checks both ends of the array, moving toward the center
					i++;
					j--;
				}
				else { //if the 2 ends of the string being checked do not match, string is NOT palindrome
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Return true if str is a palindrome or if it contains a smaller substring
	 * of length >=2 that is a palindrome.
	 * 
	 * Examples: 'abba' would return true because it is a palindrome. 'dabba'
	 * would also return true because 'abba' is a substring that is a
	 * palindrome. 'decorum' would return 'false' because it is not a palindrome
	 * and no substring of length >= 2 is a palindrome.
	 * 
	 * @param str
	 *            is not null
	 * @return true if str has a substring with at least two characters that is
	 *         a palindrome and false otherwise.
	 */
	public static boolean hasPalindromicSubstring(String str) {
		// TODO: Implement this method

		char [] charArray = str.toCharArray();
		int i = 0; //i and j track the 2 ends of the array that will be check for matched characters
		int j = charArray.length - 1;
		//k and l are used for checking a palindrome once a match in the array characters is found
		
		//if charArray's length is <2 then it immediately fails the test
		if (charArray.length < 2) {
			return false;
		}
		
		//??? HOW TO RETURN TRUE/FALSE
		//??? WHAT IF GIVEN PALINDROME OF A SINGLE OR NO CHARACTERS
		//??? ISSUE WITH CONTINUING TO CHECK FOR MATCHES AFTER A PALINDROME ISNT FOUND AFTER A MATCH
		for (i = 0; i <= j; i++) {
			if(charArray[i] == charArray[j] && 1 + j - i <= 2) { //match found, begin palindrome check
				//1+j-i is the substring length
				int k = i;
				int l = j;
				for (int m = j-i; m < 0; m--) { //loop for palindrome check
					if (charArray[k] == charArray[l]) {
						k++;
						l--;
						}
					else {
						break;
					}
				}
			}
			j--;
			if(i == j) { //must check index of i and j in array
				return false;
			}
		}
		
		return true;

	}

	/**
	 * Return the number of times query occurs as a substring of mainString (the
	 * different occurrences may overlap). Precondition: query is not null and
	 * query is not the empty string "". Examples: For mainString = "ab", query
	 * = "b", return 1. For mainString = "Luke Skywalker", query = "ke", return
	 * 2. For mainString = "abababab", query = "aba", return 3. For mainString =
	 * "abc", query = "", return 4
	 *
	 * @param mainString
	 *            is not null and neither is it the empty string
	 * @return a count of the number of times query appears in mainString
	 */
	
	public static int countOccurrences(String mainString, String query) {
		// TODO: Implement this method

		char [] arrayMain = mainString.toCharArray();
		char [] arrayQuery = query.toCharArray();
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		int result = 0;
		
		//if length of query is greater than mainString, immediately return 0;
		if(arrayMain.length < arrayQuery.length) {
			return 0;
		}
		
		for (i=0; i < arrayMain.length; i++) { //begin checking arrayMain for match with query's first character
			if (arrayMain[i] == arrayQuery[0]) { //match is found
				l=0;
				k=i;
				while (arrayMain[k] == arrayQuery[l]) { //last 2 conditions are to make sure you don't go past the array size
					k++;
					l++;
					if (l == arrayQuery.length) { //if chars matched through the whole query check, increment result
 						result++;
						break;
					}
				}
			}
		}
		
		return result; 
	}

	private static boolean Contains(String mainString, String query) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Suppose a string represents somebody's full name. The first word in the
	 * string is the first name, the last word is the last name, and any words
	 * in between are middle names. The string may have an arbitary amount of
	 * whitespace (blank spaces) between words and at the beginning or the end.
	 * Return a string that is a nicely formatted name in the format Lastname,
	 * Firstname [Middle Initials]. In the string that this method returns, the
	 * first character of the last name, the first character of the first name
	 * and the middle initials must be capitalized; all other characters must be
	 * in lower case.
	 * 
	 * Some examples: sathish gopalakrishnan should result in Gopalakrishnan,
	 * Sathish. Matei Radu Ripeanu should result in Ripeanu, Matei R. John Ronald
	 * reuel Tolkien should result in Tolkien, John R. R. Arvind should result
	 * in Arvind (this is a special case when there is only one word in the
	 * string)
	 */

	/**
	 * Return a nicely formatted name in the format Lastname, Firstname, [Middle
	 * Initials.]
	 * 
	 * @param nameStr
	 *            contains at least one word
	 * @return a nicely formatted name string, ignoring special characters
	 */
	public static String formatName(String nameStr) {
		/*
		 * String is a datatype or (in Java) a class. An object of class String
		 * is immutable -- you cannot change the sequence of chars that it
		 * contains. However, you can create new strings by catenating together
		 * parts of the original string.
		 * 
		 * This task can be solved by selecting appropriate methods in the
		 * String class and then using if statements.
		 */
		// TODO: Implement this method
		
		nameStr = nameStr.replaceAll("\\s+", " ");
		String [] wordArray = nameStr.trim().split(" ");
		String result = "";
		
		//format first and last index array to capital first char, lowercase rest chars
		//syntax for idea from https://stackoverflow.com/questions/3904579/how-to-capitalize-the-first-letter-of-a-string-in-java
		if(wordArray[0] == " " || wordArray[0] == "") { //first check for empty or single spaced arrays after splitting
			result = "";
			return result;
		}
		
		String first = wordArray[0].substring(0,1).toUpperCase() + wordArray[0].substring(1).toLowerCase();
		String last = wordArray[wordArray.length - 1].substring(0,1).toUpperCase() + wordArray[wordArray.length - 1].substring(1).toLowerCase();
		
		if (wordArray.length > 2) { //if more than one word, produce last and format
			result = last + ", " + first + " ";
		}
		else if (wordArray.length == 1) {//if only first name, produce and return result
			result = first;
			return result;
		}
		else if (wordArray.length == 2) { //if only first and last name, produce and return result
			result = last + ", " + first;
			return result;
		}
		
		for (int i = 1; i < wordArray.length - 1; i++) { //loop for middle names
				String letter = wordArray[i].substring(0, 1).toUpperCase(); //take first letter of mid name and capitalize
				//if last middle name found, don't insert a space after period
				if (i == wordArray.length - 2) {
					letter = letter.concat(".");
					result = result + letter;
					return result;
				}
				else {
					letter = letter.concat(". ");
					result = result + letter;
				}
		}
		
		return result;
		}

	/**
	 * Return true iff s1 and s2 are anagrams of each other. An anagram of a
	 * string is another string that has the same characters, but possibly in a
	 * different order. Like other methods of this class, this method too is
	 * case-sensitive, so 'a' and 'A' are considered different characters.
	 *
	 * Examples: For s1 = "mary", s2 = "army", return true. For s1 = "tom
	 * marvolo riddle", s2 = "i am lordvoldemort", return true. For s1 =
	 * "tommarvoloriddle", s2 = "i am lordvoldemort", return false. For s1 =
	 * "foo", s2 = "bar", return false.
	 * 
	 * @param s1
	 *            and s2 are not null
	 * @return true if s2 is an anagram of s1, and false otherwise
	 */
	public static boolean anagrams(String s1, String s2) {
		// TODO: Implement this method

		// You do not need to use iteration/recursion.
		// Hint: how can a sequence of characters be uniquely ordered
		// You might need to first convert the string to an array of
		// characters, and then use a function from class
		// [`Arrays`](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html).
		char [] charString1 = s1.toCharArray();
		char [] charString2 = s2.toCharArray();
		int [] intString1 = new int[charString1.length];
		int [] intString2 = new int[charString2.length];
		int temp;
		
		//convert char arrays to int arrays
		for (int i = 0; i < charString1.length; i++) {
			intString1 [i] = charString1[i];
		}
		
		for (int i=0; i < charString2.length; i++) {
			intString2 [i] = charString2[i];
		}
		
		//if the arrays aren't the same length, immediately not anagrams
		if (intString1.length != intString2.length) {
			return false;
		}
		
		//begin sorting intString1
        for (int i = 0; i < intString1.length; i++) { //loop structure taken from http://www.sanfoundry.com/java-program-sort-array-ascending-order/
            for (int j = i + 1; j < intString1.length; j++) {
                if (intString1[i] > intString1[j]) {
                	temp = intString1[i];
                    intString1[i] = intString1[j];
                    intString1[j] = temp;
                }
            }
        }
        
		//begin sorting intString2
        for (int i = 0; i < intString2.length; i++) { //loop structure taken from http://www.sanfoundry.com/java-program-sort-array-ascending-order/
            for (int j = i + 1; j < intString2.length; j++) {
                if (intString2[i] > intString2[j]) {
                	temp = intString2[i];
                    intString2[i] = intString2[j];
                    intString2[j] = temp;
                }
            }
        }
        
        //begin comparison
        for (int i = 0; i < intString1.length; i++) {
        	if (intString1[i] != intString2[i]) {
        		return false;
        	}
        }
        
		return true;
	}

	/**
	 * An encoding of the string `aaassddddffg` is the string `3a2s4d2f1g`.
	 * Along these lines, `zzz56yyy` would be encoded as `3z15163y`. Assuming
	 * this encoding method, an encoded string is a *sequence* of
	 * digit-character pairs. Implement a method to decode a string (given the
	 * encoded version). (What should you do if a string is not in the correct
	 * format? For now, assume that all test strings will conform to the
	 * expected format.)
	 * 
	 * @param encstr
	 *            Is in the appropriate encoded format
	 * @return a String that has been decoded from the special format
	 */
	public static String decode(String encstr) {
		/*
		 * To produce the integer that is in String encstr use function
		 * Integer.parseInt(s1). Remember that a character c is not a String,
		 * and to change c into a String you may have to concatenate it with the
		 * empty String. This function will probably need a nested loop
		 */
		String result = "";
		
		for (int i = 0; i < encstr.length(); i++) {
			int j = Character.getNumericValue(encstr.charAt(i)); //get numerical
			char k = encstr.charAt(i+1); //get character
			for (int l = 0; l < j; l++) {
				result += k; //list character into result j times
			}
			i++; //increment i again to skip the character part's of the encoded string
		}
		
		return result;
	}
}


/*
		char [] name = nameStr.toCharArray();
		char [] firstName = null;
		
		//find first word
		for (int i = 0; i < name.length; i++)
		{
			if (name[i] != ' ') {
				while (name[i] != ' ') {
					firstName[i] = name[i];
					i++;
				}
			}
			else { //end of name is reached
				firstName[i] = ',';
				firstName[i+1] = ' ';
				break;
			}
		}
		//format first word
 */






