public class Permutation{

    /**
     * 
     * @param words
     * @return 
     */
    public boolean isPermutation(String[] words){

        boolean[] hash = new boolean[128]; // all values ASCII typed

        for(int i = 0; i < words[0].length(); i++){
            hash[words[0].charAt(i)] = true;
        }

        

        return false;
    }
}
