public class NestedWhileLoop {
    public static void main(String[] args) {
 
        int row = 1;
        while (row <= 5) {
           
            int col = 1;
            while (col <= 3) {
                System.out.print(col);
                col++;
            }
            
            System.out.println(row);
            
            row++;
        }
    }
}
