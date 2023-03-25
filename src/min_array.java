import java.util.Arrays;
import java.util.Scanner;

public class min_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for (int i = 0 ; i < size ; i ++ ){
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr) + " ");

        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println(" Value Min is : " + min);
    }
}
