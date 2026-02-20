/**
*
* OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Fucntion.
*
* This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
* such as the Collections Framework to manage character Patterns in a more flexible 
* and efficient manner. The application retrieves and displays the "OOPS" banner
* using a HashMap there by enhancing code organization and modularity.
*
* @author Developer
* @version 8.0
*/
// Extend User story 7 to utilize advanced Object-Oriented Programming concepts
// such as Collections Framework to manage character patterns in a more flexible 
// and effiecient manner. The application retrieves and displays the "OOPS" banner
// usingn these HashMap.
 
import java.util.HashMap;

public class OOPSBannerApp {

 	/**
	 * Creates a HashMap containing ASCII art patterns for supported characters.
	 *
	 * <p> Each character is mapper to an array of strings where each string represents 
	 * one line of the character's ASCII art pattern. All patterns are assumend to have 
	 * the same height.
	 *
	 * @return a HashMap where keys are characters (char) and values are String arrays
	 * 		representing the ASCII art pattern lines for each character
	 */

	public static HashMap<Character, String[]> createCharacterMap() {
		// Create a HashMap to store character patterns
		
		HashMap<Character, String[]> charMap = new HashMap<>();

		charMap.put('O' ,new String[] {

						"  ****  ",

						" *    * ",

						"*      *",

						"*      *",

						"*      *",

						"*      *",

						" *    * ",

						"  ****  ",
		});

		charMap.put('P' ,new String[] {
						
						"*******",

						"*     *",

						"*     *",
			
						"*******",
				
						"*      ",

						"*      ",

						"*      ",

						"*      ",
		});

		charMap.put('S' ,new String[] {
						"*******",

						"*",

						"*",

						"*******",

						"      *",

						"      *",

						"      *",

						"*******",

		});

		return charMap;
	}

	/**
	 * Displays a banner message using the provided character map.
	 *
	 * <p>This method renders the input messafe as a lage ASCII art banner by iterating
	 * through each line of the character patterns and horizontally concatenating the 
	 * corresponding line from each character in the message.
	 *
	 * @param message the String message to display as a banner. Each character must 
	 * 		exist as a key in the charMap
	 * @param CharMap a HashMap containing character patterns, where each character maps to a String array of pattern lines
	 */

	public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

		for (int i=0; i < message.length(); i++){
			String[] pat = charMap.get(message.charAt(i));
			for (String line :pat){
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message,charMap);
	}
}
 
