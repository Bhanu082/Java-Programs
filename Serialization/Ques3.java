////write a java program to replace all vowels with previous character in the String
public class Ques3 {
    public static void main(String[] args) {
        String s = "Bhavani";
        s = s.toLowerCase();  // Make the string lowercase
        String vowels = "aeiou";

        // Convert the string to a character array for easy modification
        char[] charArr = s.toCharArray();

        // Iterate over the character array
        for (int i = 1; i < charArr.length; i++) {
            // Check if the current character is a vowel
            if (vowels.indexOf(charArr[i]) != -1) {
                // Replace vowel with the previous character
                charArr[i] = charArr[i - 1];
            }
        }

        // Convert the modified character array back to a string
        String fin = new String(charArr);
        System.out.println(fin);
    }
}

