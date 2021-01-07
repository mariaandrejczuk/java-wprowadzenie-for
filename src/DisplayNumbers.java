
//Zadanie 1

public class DisplayNumbers {
    public static void main(String[] args) {

        System.out.println("---------- ZADANIE 1 ----------");
//        System.out.println(91);
//        System.out.println(90);
//        System.out.println(89);

        for (int i = 91; i >= -7; i--) {
            System.out.println(i);
        }

        System.out.println("---------- ZADANIE 2 ----------");

        for (int i = 62349; i <= 62392; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

