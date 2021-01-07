public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {5,2,-5,1,5,22,5};
        /*
        1-szy obieg - dwa porówania
        5,2,-5
        2,5,-5
        2,-5,5
        2-porównanie:
        -5, 2, 5
         */

        //wyświetlenie elementów:
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]+",");
        }

    }
}
