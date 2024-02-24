package arrays;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String s = "the sky is blue";
        System.out.println(reverseWordsInAString.reverseWords(s));
    }

    public String reverseWords(String s) {
//        separate the words
        String[] words = s.split(" ");
//        create a string builder
        StringBuilder sb = new StringBuilder();
//        loop through the words
        for (int i = words.length - 1; i >= 0; i--) {
//            if the word is not empty
            if (!words[i].isEmpty()) {
//                add the word to the string builder
                sb.append(words[i]).append(" ");
            }
        }
//        return the string builder
        return sb.toString().trim();

    }
}
