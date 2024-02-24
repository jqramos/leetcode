package arrays;

public class MergeStringAlt {

    public static void main (String[] args) {
        MergeStringAlt mergeStringAlt = new MergeStringAlt();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeStringAlt.mergeAlternately(word1, word2));

    }

    public String mergeAlternately(String word1, String word2) {
        //create a string builder
        StringBuilder sb = new StringBuilder();
        //create a pointer for word1
        int i = 0;
        //create a pointer for word2
        int j = 0;
        //loop through the strings
        while(i < word1.length() || j < word2.length()){
            //if the pointer for word1 is less than the length of word1
            if(i < word1.length()){
                //add the character to the string builder
                sb.append(word1.charAt(i));
                //increment the pointer for word1
                i++;
            }
            //if the pointer for word2 is less than the length of word2
            if(j < word2.length()){
                //add the character to the string builder
                sb.append(word2.charAt(j));
                //increment the pointer for word2
                j++;
            }
        }
        //return the string builder
        return sb.toString();

    }

}
