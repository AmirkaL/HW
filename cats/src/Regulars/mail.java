package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class mail
{
    private static final String reg = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final Pattern patt = Pattern.compile(reg);

    public static boolean emailValidator(String email)
    {
        Matcher matcher = patt.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        String email = "spbu.pay@mail.ru";

        if (emailValidator(email)) {
            System.out.println("eMail " + email + " верный");
        }
        else {
            System.out.println("eMail " + email + " неверный");
        }
    }
}