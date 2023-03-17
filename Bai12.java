import java.util.Scanner;

 public class Bai12 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhập số hàng của ma trận: ");
         int m = input.nextInt();
         System.out.print("Nhập số cột của ma trận: ");
         int n = input.nextInt();
         int[][] matrix = new int[m][n];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                 matrix[i][j] = input.nextInt();
             }
         }
         int max_value = matrix[0][0];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 if (matrix[i][j] > max_value) {
                     max_value = matrix[i][j];
                 }
             }
         }
         System.out.println("Phần tử lớn nhất trong ma trận là: " + max_value);
     }
 }