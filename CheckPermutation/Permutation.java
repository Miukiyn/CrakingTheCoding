/**
 * Author: Iago Adrien - Miukiyn
 * Version: 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Permutation {

    /**
     * Main method that reads input from the user, splits the input into two words,
     * and checks if one is a permutation of the other.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String split = " ";
        String[] words = new String[2];

        try {
            // Read input line and convert it to uppercase, then split by space
            String in = reader.readLine();
            words = in.toUpperCase().split(split);

            // Check if the two words are permutations of each other
            System.out.println(isPermutation(words));

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * Checks if the second word is a permutation of the first word.
     * Only works correctly with two words of equal length and within the ASCII range.
     *
     * @param words An array containing two strings to be compared
     * @return true if one string is a permutation of the other, false otherwise
     */
    public static boolean isPermutation(String[] words) {
        if (words.length != 2 || words[0].length() != words[1].length()) {
            return false; // Quick fail if not exactly two words or different lengths
        }

        int[] charCount = new int[128]; // ASCII character set

        // Count the frequency of each character in the first word
        for (int i = 0; i < words[0].length(); i++) {
            charCount[words[0].charAt(i)]++;
        }

        // Subtract the frequency using the second word
        for (int i = 0; i < words[1].length(); i++) {
            charCount[words[1].charAt(i)]--;
            if (charCount[words[1].charAt(i)] < 0) {
                return false; // More of a character in second word than in first
            }
        }

        return true;
    }
}
