package isUnique;

/**
 * Author: Iago Adrien - Miukiyn
 * Version: 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IsUnique{
    public static void main(String[] agrs){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{

            String in = reader.readLine(); // in
            System.out.println(IsUniqueChar(in)); // out

        }catch(IOException e){
            System.out.println("Erro: " + e);
        }
    }

    /**
     * Check if a string contains all unique characters
     * 
     * metahod: hash table 
     * 
     * @param str the string to check whether it contains all unique characters
     * @return true if contains all unique characters and false if not
     */
    public static boolean IsUniqueChar(String str){
        if(str.length()>128) return false; // If the string is longer than 128 characters, it is impossible for all characters to be unique.

        boolean[] hash = new boolean[128]; // Define a character array with all possible ASCII codes that can be typed.

        for(int i = 0; i < str.length(); i++){
            int ascii = str.charAt(i);
            if(hash[ascii]){
                return false; // If the ASCII value captured with charAt is already marked as true, then return false, because this value already exists in the string.
            }
            hash[ascii] = true; // Set the value in the hash to true, indicating that this character is present in the string.
        }
        return true; // Return true, if all characters is unique.
        
    }

}