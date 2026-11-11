class ArrayWhileLoopReverse {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int x = numbers.length - 1;

        while (x >= 0) {
            System.out.println(numbers[x]);          
			x--;
        }
    }
}
