package arrays;

public class GreatestCommonDivisorString {
    public static void main (String[] args) {
        GreatestCommonDivisorString greatestCommonDivisorString = new GreatestCommonDivisorString();
        String str1 = "ABABAB";
        String str2 = "AB";
        System.out.println(greatestCommonDivisorString.gcdOfStrings(str1, str2));

    }
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {  // Ensure str1 is not shorter than str2.
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {  // Check if str1 starts with str2.
            return "";  // If not, there's no common divisor.
        } else if (str2.isEmpty()) {
            return str1;  // If str2 is empty, str1 is the gcd.
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);  // Repeat the process with the remaining part of str1 and str2.
        }


    }
}
