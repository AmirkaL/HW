package Palindrom;

public class palin {

    public static class palindrome {

        static boolean isPalindrome(String str)
        {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
        public static void main(String[] args)
        {
            String str = "nAaN";
            str = str.toLowerCase();
            if (isPalindrome(str))
                System.out.print(str + " - Является палиндромом");
            else
                System.out.print(str + " - Не является палиндромом");
        }
    }
}
