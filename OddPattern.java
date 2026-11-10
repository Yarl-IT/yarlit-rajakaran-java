class OddPattern {
    public static void main(String[] args) {
        
        int[] oddNumbers = {1, 3, 5};

        for (int i = 0; i < 5; i++) {
          
            for (int j = 0; j < oddNumbers.length; j++) {
                System.out.print(oddNumbers[j]);
                
                if (j < oddNumbers.length - 1) {
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
}
