public class PlayWithArray {
    public static void main(String[] args) {
        int[] numbers = int [10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int element : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.lenght; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
