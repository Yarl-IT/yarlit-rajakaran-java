class InvertedNumberPyramid {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int i = 0; i < totalRows; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            
            for (int k = 1; k <= totalRows - i; k++) {
                System.out.print(k);
                if (k < totalRows - i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
