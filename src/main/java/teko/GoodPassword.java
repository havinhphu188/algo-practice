package teko;

import java.util.Scanner;

public class GoodPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        if (isSafe(password)) System.out.println("YES");
        else System.out.println("NO");
//        System.out.println("'@' = " + (int)'@');
//        System.out.println("'#' = " + (int)'#');
//        System.out.println("'$' = " + (int)'$');
    }

    private static boolean isSafe(String password) {
        if ((password.length()>16)||(password.length()<6)) return false;
        boolean containUncapLetter = false;
        boolean containCapLetter = false;
        boolean contain1num = false;
        boolean containSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if( (c >= 'A')&&(c<='Z')) containCapLetter = true;
            else if( (c >= 'a')&&(c<='z')) containUncapLetter = true;
            else if( (c >= '0')&&(c<='9')) contain1num = true;
            else if ((c== 35)||(c==36)||(c==64)) containSpecialChar = true;
        }
        boolean result = containUncapLetter&&containCapLetter&&contain1num&&containSpecialChar;
        return result;
    }
}
