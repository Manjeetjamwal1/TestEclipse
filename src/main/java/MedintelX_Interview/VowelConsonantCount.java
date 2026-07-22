package MedintelX_Interview;

public class VowelConsonantCount {
    public static void main(String[] args) {

        String str = "my1 name4 is3 singh1";
        str = str.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel      : " + ch);
                vowelCount++;
            }
            else if (Character.isLetter(ch)) {
                System.out.println("Consonant  : " + ch);
                consonantCount++;
            }
            else if (Character.isDigit(ch)) {
                System.out.println("Number     : " + ch);
                digitCount++;
            }
            else if (Character.isWhitespace(ch)) {
                System.out.println("Space");
                spaceCount++;
            }
        }

        System.out.println("\nTotal Vowels      : " + vowelCount);
        System.out.println("Total Consonants  : " + consonantCount);
        System.out.println("Total Numbers     : " + digitCount);
        System.out.println("Total Spaces      : " + spaceCount);
    }
}