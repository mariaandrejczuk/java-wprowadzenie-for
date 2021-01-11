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

        System.out.println("---------- ZADANIE 3 ----------");

        char c = 'a';
        char c1 = 'z';
        System.out.println((int) c);
        System.out.println((int) c1);

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i);
        }

        System.out.println("---------- ZADANIE 4 ----------");

        int[][] numbers = {{1, 3, 4}, {1, 1}, {4, 5, 5, 7, 3}, {5, 1, 1, 1}};

        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i][1]); //wyświetla po jednym elemencie z każdego wiersza o indeksie
            // i (kolejno) znajdujące  się  w kolumnie o indeksie = 1.

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}


