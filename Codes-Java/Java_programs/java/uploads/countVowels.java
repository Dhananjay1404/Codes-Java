public class countVowels {
    public static void main(String args[]) {
        String str = "This is my certification exam";
        System.out.println(str.length());
        int vowels = 0, con = 0, spaces = 0, is = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels++;
            }
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e'
                    && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o'
                    && str.charAt(i) != 'u') {
                con++;
            }
            if (str.charAt(i) == ' ') {
                spaces++;
            }
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == 'i' && str.charAt(i + 2) == 's'
                    && str.charAt(i + 3) == ' ') {
                is++;
            }
        }
        System.out.println("Total Number of Vowels = " + vowels);
        System.out.println("Total Number of Con = " + con);
        System.out.println("Total Number of Spaces = " + spaces);
        System.out.println("Total Number of 'is' = " + is);
    }
}

// public class countVowels
// {
// public static void main(String args[])
// {
// String line="This is my Java certification exam";
// int vowels=0,consonants=0,spaces=0;
// int line2 = line.indexOf("is");
// System.out.println("is:" +line2);
// line=line.toLowerCase();
// for(int i=0;i<line.length();i++)
// {
// char ch=line.charAt(i);
// //check if character is any of a,e,i,o,u
// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
// {
// ++vowels;
// }
// //check if character is in between a-z
// else if((ch>='a' && ch<='z'))
// {
// ++consonants;
// }
// else if(ch==' ')
// {
// ++spaces;
// }

// }
// System.out.println("Vowels: " +vowels);
// System.out.println("Consonants: "+consonants);
// System.out.println("White spaces: "+spaces);
// }
// }