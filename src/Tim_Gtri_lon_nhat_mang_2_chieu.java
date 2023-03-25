import java.util.Scanner;

public class Tim_Gtri_lon_nhat_mang_2_chieu {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println("Phan tu lon nhat cua ma tran " + max);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran");
        int row = sc.nextInt();

        System.out.println("nhap so cot cua ma tran");
        int col = sc.nextInt();

        int[][] newArr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhap gia tri phan tu  + [" + i + "][" + j + "] : ");
                newArr[i][j] = sc.nextInt();
            }
        }
        max = newArr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if (max < newArr[i][j]) {
                    max = newArr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trân là : " + max);
        System.out.println("tọa độ có phần tử lớn nhất là :  [" + maxRow + "][" + maxCol + "]");

    }
}
