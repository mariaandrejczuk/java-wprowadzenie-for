public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {10, -5, 1};
        /*
        1-szy obieg - dwa porówania
        5,2,-5
        2,5,-5
        2,-5,5
        2-porównanie:
        -5, 2, 5
         */

        //wyświetlenie elementów:
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + ",");
        }
        System.out.println();

        //sortowanie elementów:
        for (int z = 0; z < numbers.length; z++) {
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                }
            }
        }

        //wyświetlenie elementów:
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j] + ",");
        }
        System.out.println();
    }
}
