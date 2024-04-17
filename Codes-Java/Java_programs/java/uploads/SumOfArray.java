public class SumOfArray {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all Elements : " + sum);
    }
}
