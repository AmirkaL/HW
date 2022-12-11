package isNumber;

public class qMain {
    public static void main(String[] args) {
        int num = String.valueOf(598).length();

        if (num == 3) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}

class lastNum {
    public static void main(String[] args) {
        int num = 13054665;
        int rez = num % 10;

        if (rez == 5) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}

class last2Num {
    public static void main(String[] args) {
        int num = 130122;
        int rez = num % 10;
        int rez1 = num % 100;

        if (rez1 == 00) {
            System.out.print("True");
        } else if (rez1 / rez == 11) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}

class year {
    public static void main(String[] args) {
        int num = 2022;
        if ((num & 3) == 0 && ((num % 25) != 0 || (num & 15) == 0)) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }

    }
}

class isCil {
    public static void main(String[] args) {
        int num = 29;
        int i;

        boolean isNum = false;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                isNum = true;
                break;
            }
        }
        if (isNum) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
