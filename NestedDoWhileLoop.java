class NestedDoWhileLoop {
    public static void main(String[] args) {
        int row = 1;
        
        do {
            int col = 1;
			do {
                System.out.print(col);
                col++;
            } while (col <= 3);
            
            System.out.println(row);
            row++;
            
        } while (row <= 5);
    }
}
