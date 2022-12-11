package Regulars;

public class reg {
    public static void main(String[] args){
        System.out.println(cat("(.*)cat(.*)","cat and cat"));
        System.out.println(cat("(.*)cat(.*)","Cat"));
        System.out.println(cat("(.*)cat(.*)","theCATisHERE"));

        System.out.println(cat("(.*)cat(.*)","kat"));
        System.out.println(cat("(.*)cat(.*)",""));
        System.out.println(cat("(.*)cat(.*)","cot"));
    }
    static boolean cat(String ser, String text) {
        return text.toLowerCase().matches(ser);
    }
}


