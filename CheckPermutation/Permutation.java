/**
* Author: Iago Adrien - Miukiyn
* Version: 1.0
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Permutation{

    /**
     * 
     * @param agrs
     * @param in 
     * @param words
     */
    public static void main(String[] agrs){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String split = " ";
        String[] words = new String[2]; 

        try{
            String in = reader.readLine();

            System.out.println(isPermutation(words = in.toUpperCase().split(split)));
            
        }catch(IOException e){
            System.out.println("Erro: " + e);
        }

    }

    /**
     * 
     * @param words
     * @return 
     */
    public static boolean isPermutation(String[] words){

        boolean[] hash = new boolean[128]; // all values ASCII typed

        //
        for(int i = 0; i < words[0].length(); i++){
            hash[words[0].charAt(i)] = true;
        }
        
        //
        for(int i = 0; i < words[1].length(); i++){
            if(!(hash[words[0].charAt(i)] && hash[words[1].charAt(i)])){ //
                return false;
            }
            return true;
        }
        return false;
    }
}
