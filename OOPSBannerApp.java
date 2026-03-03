public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character; 
        String[] pattern;

        
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   ",        });
        
        characterPatternMap[1] = new CharacterPatternMap('P', new String[] {
            "*****    ",
            "**  **   ",
            "**  **   ",
            "*****    ",
            "**       ",
            "**       ",
            "**       ",        });
        
        characterPatternMap[2] = new CharacterPatternMap('S', new String[] {
            "    **** ",
            "   **    ",
            "   **    ",
            "    ***  ",
            "      ** ",
            "      ** ",
            "   ****  ",
        });
        
        characterPatternMap[3] = new CharacterPatternMap(' ', new String[] {
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < charMaps.length; i++) {
            if (charMaps[i] != null && charMaps[i].getCharacter() == ch) {
                return charMaps[i].getPattern();
            }
        }
        return charMaps[3].getPattern(); 
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int lineIndex = 0; lineIndex < 7; lineIndex++) {
            StringBuilder lineToPrint = new StringBuilder();
            
            for (int charIndex = 0; charIndex < message.length(); charIndex++) {
                char c = message.charAt(charIndex);
                String[] pattern = getCharacterPattern(c, charMaps);
                lineToPrint.append(pattern[lineIndex]).append("   ");
            }
            System.out.println(lineToPrint.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        String message = "OOPS";
        
        printMessage(message, charMaps);
    }
}