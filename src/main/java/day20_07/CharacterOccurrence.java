package day20_07;

public class CharacterOccurrence {

    public static void main(String[] args) {

        String str = "program";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            if (str.charAt(i) == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}
