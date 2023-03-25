import java.util.Scanner;

public class push_element_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        System.out.println(" nhập số cần chèn ");
        int X = sc.nextInt();

        System.out.println("Nhập ví trí chèn ");
        int index = sc.nextInt();

        if (index < -1 && index >= arr.length ) {
            System.out.println("Không thể chèn phần tử");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            }else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = X;
        arr = newArr;

        System.out.println("Mảng sau khi chèn");
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
