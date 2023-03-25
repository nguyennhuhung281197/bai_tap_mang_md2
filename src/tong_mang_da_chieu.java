import java.util.Arrays;
import java.util.Scanner;

public class tong_mang_da_chieu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int row = sc.nextInt();

        System.out.println("Enter the col");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Value a Array  [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Array : ");
        System.out.println(Arrays.deepToString(arr));

        int[] colSum = new int[col];
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[j][i];
            }
            colSum[j] = sum;
            System.out.println("tong cua  cot : " + j + " la :" + sum);
        }
    }
}
