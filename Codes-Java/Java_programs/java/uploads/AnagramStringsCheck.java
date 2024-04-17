// program to check if the strings are anagrams or not

import java.util.*;

public class AnagramStringsCheck {
    public static void main(String[] args) {
        String str1, str2;
        int len, len1, len2, i, j, found = 0, not_found = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String :- ");
        str1 = sc.nextLine();
        System.out.println("Enter Second String :- ");
        str2 = sc.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        if (len1 == len2) {
            len = len1;
            for (i = 0; i < len; i++) {
                found = 0;
                for (j = 0; j < len; j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    not_found = 1;
                    break;
                }
            }
            if (not_found == 1) {
                System.out.println("Strings Are Not Anagram");
            } else {
                System.out.println("Strings Are Anagrams");
            }
        } else {
            System.out.println("Both Srting Must Have Same Number of Character to be Anagram");
        }
    }
}