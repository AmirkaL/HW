package isUpperLower;

public class strn {
    public static void main(String[] args) {
        String lower = "example";
        String upper = "EXAMPLE";
        System.out.println(rez(lower));
        System.out.println(rez2(upper));


    }
    private static boolean rez(String str){
        char[] mas = str.toCharArray();
        for(int i=0; i < mas.length; i++){
            if( !Character.isLowerCase( mas[i] ))
                return false;
        }
        return true;
    }

    private static boolean rez2(String str){
        char[] mas = str.toCharArray();
        for(int i=0; i < mas.length; i++){
            if( !Character.isUpperCase( mas[i] ))
                return false;
        }
        return true;
    }
}
