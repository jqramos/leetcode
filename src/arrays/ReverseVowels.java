package arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels reverseVowels = new ReverseVowels();
        String s = "hello";
        System.out.println(reverseVowels.reverseVowels(s));

    }

    public String reverseVowels(String s) {
        //create a string builder
        StringBuilder sb = new StringBuilder();
        //create a pointer for the end of the string
        int i = s.length() - 1;
        //loop through the string
        for (int j = 0; j < s.length(); j++) {
            //if the character at the pointer is a vowel
            if (isVowel(s.charAt(j))) {
                //loop through the string
                while (!isVowel(s.charAt(i))) {
                    //decrement the pointer
                    i--;
                }
                //add the character at the pointer to the string builder
                sb.append(s.charAt(i--));
            } else {
                //add the character to the string builder
                sb.append(s.charAt(j));
            }
        }
        //return the string builder
        return sb.toString();

    }

    public boolean isVowel(char c) {
        //return true if the character is a vowel
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
