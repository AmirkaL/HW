package Regulars;

public class pov {
    public static void main(String[] args) {
        String text = "This is is a test";
        String reg = "\\b(\\w+)\\s+(\\1)\\b";
        var res = text.replaceAll(reg, "$1 <strong>$2</strong>");

        System.out.printf(res);
    }
}
