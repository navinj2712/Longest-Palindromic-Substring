import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String word){
        String result = "";
        int maxLength = Integer.MIN_VALUE;
        for (int i1 = 0 ; i1 < word.length() ; i1++){
            for (int i2 = i1 + 1 ; i2 < word.length() ; i2++){
                if (word.charAt(i1) == word.charAt(i2) && (palindromeOrNot(word.substring(i1, i2+1)))){
                    int length = word.substring(i1, i2 + 1).length();
                    if (length > maxLength){
                        maxLength = length;
                        result = word.substring(i1,i2 + 1);
                    }
                }
            }
        }
        return result;
    }

    public static boolean palindromeOrNot(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        return (stringBuilder.reverse().toString().equals(word)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = scanner.next();
        System.out.println(longestPalindromicSubstring(word));
    }
}
