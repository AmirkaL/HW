package Regulars;

public class zamen {
    public static void main(String[] args) {
        String text = "I need to understand the human mind";
        String text2 = "attraction buzzzz";

        text = text.replace("human\u0020", "computer\u0020");
        text2 = text2.replaceAll("([a-z])\\1+", "$1");
        System.out.println(text);
        System.out.println(text2);
    }
}
