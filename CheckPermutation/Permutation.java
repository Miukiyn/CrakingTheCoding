
/**
 * Author: Iago Adrien - Miukiyn
 * Version: 1.0
 */ 
package CheckPermutation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Permutation {
    /**
     * Main method to be executed
     * @param words Array that will hold the two strings to compare
     * @param split Delimiter used to separate the input string into two parts
     * @param str Input string to be read and split into two words
     * @return Returns true if one string is a permutation of the other, and false otherwise
     */
    public static void main(String[] agr){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[2];
        String split = " ";

        try{
            System.out.print("Give two string: ");
            String str = reader.readLine();
            
            
            words = str.split(split);
            if(!(words[1] == null)){
                System.out.println(isPermutation(words));
            }
            


        }catch(IOException e){
            System.out.println("Erro: " + e);
        }
    }

    /**
     * Method to check if one word is a permutation of another
     * @param words Array containing the two strings to compare
     * @return returns true if it is a permutation, and false otherwise
     */
    public static boolean isPermutation(String[] words){
        boolean permutation = false;
        
        if(!(words[0].equals(words[1])) && sum(words[0]) == sum(words[1])){ 
            permutation = true;
        }
        return permutation;
    }

    /**
     * Method that sums the ASCII values to check if they contain the same values
     * @param str String to be summed
     * @return returns the sum of the values
     */
    public static int sum(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum = sum + str.charAt(i); 
        }
        return sum;
    }
}
