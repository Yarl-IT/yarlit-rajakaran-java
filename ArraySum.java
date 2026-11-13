import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
		System.out.println("Sum of array elements: " + sum);
        
        scanner.close();
    }
}
