/**
*
* OOPSBannerApp UC7 - Store Character Pattern in a class
*
* This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate 
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using mappings. This approach enhances code organization and modularity.
*
* @author Developer
* @version 7.0
*/
// Extend User story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using mappings. Thereby addressing the drawback of not having 
// centralized character pattern management system.
 
 
public class OOPSBannerApp {

 
	static class CharacterPatternMap {


		Character character;
		String[] pattern;
 
		/**
		 * Constructs a CharacterPatternMap with a character and its pattern
		 *
		 * @param character the character to be mapped
		 * @param pattern the ASCII art pattern representation as arrays of Strings.
		 */

		public CharacterPatternMap(Character character, String[] pattern) {

			/**
			 * Retrieves the mapped character
			 * @return the character associated with this pattern map
			 */

			this.character = character;

			this.pattern = pattern;

		}
 
		public Character getCharacter()  {
 
			return character;

		}
 
		public String[] getPattern() {

			return pattern;

		}
 
	}


	public static CharacterPatternMap[] createCharacterPatternMaps() {

		String[] oP = new String[] {

			"  ****  ",

			" *    * ",

			"*      *",

			"*      *",

			"*      *",

			"*      *",

			" *    * ",

			"  ****  ",

		};
 
		String[] pPat = new String[] {

			"*******",

			"*     *",

			"*     *",

			"*******",

			"*      ",

			"*      ",

			"*      ",

			"*      ",

		};
 
		String[] sP = new String[] {

			"*******",

			"*",

			"*",

			"*******",

			"      *",

			"      *",

			"      *",

			"*******",

		};
 
 
		CharacterPatternMap oPattern = new CharacterPatternMap('O', oP);
		CharacterPatternMap pPattern = new CharacterPatternMap('P', pPat);
		CharacterPatternMap sPattern = new CharacterPatternMap('S', sP);
		CharacterPatternMap[] map = new CharacterPatternMap[3];

		map[0] = oPattern;
		map[1] = pPattern;
		map[2] = sPattern;
		
		return map;

	}
 
	public static String[] getCharacterPattern(Character ch, CharacterPatternMap[] charMaps) {

		for (int i=0; i < charMaps.length; i++) {

			if(ch.equals(charMaps[i].character)) {
				return charMaps[i].pattern;
			}

		}

		return charMaps[0].pattern;
 
	}
 
	public static void printMessage(String message, CharacterPatternMap[] charMaps) {

		// System.out.println(getCharacterPattern('O') + " " + getCharacterPattern('O') + " " + getCharacterPattern('P') + " " + getCharacterPattern('S'));

		/*for (Character c : message) {
			String[] lines = getCharacterPattern(c, charMaps);
			for (String line : lines) {
				System.out.println(line);

			}

		}

		*/
 
		for (int i=0; i < message.length(); i++) {
			Character c = message.charAt(i);
			String[] lines = getCharacterPattern(c, charMaps);
			for (String line : lines) {

				System.out.println(line);
			}

		}

	}
 
	public static void main(String[] args) {
		//Create CharacterPatternMap array
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		//Define the message to be displayed 
		String message = "OOPS";
		//Print the banner message
		printMessage(message, charMaps);

	}

} 
