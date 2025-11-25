public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String lowerStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lowerStr += (char) (str.charAt(i) + 32);
            } else {
                lowerStr += str.charAt(i);
            }
        }
        return lowerStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1 == "" && str2 == "" || str2 == "")
            return true;

        else if (str1 == "")
            return false;

        int start = 0;

        for (int i = 0; str1.length() - i >= str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                start = i;

                int count = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(j + start) == str2.charAt(j)) {
                        count++;
                    }

                }
                if (count == str2.length())
                    return true;

            }
        }
        return false;
    }
}
