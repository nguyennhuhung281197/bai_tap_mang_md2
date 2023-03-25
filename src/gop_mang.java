import java.util.Arrays;

public class gop_mang {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5} ;
        int [] arr2 = {6,7,8,9,10};

        for (int i = 0 ; i < arr1.length ; i ++){
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
        for (int j = 0 ; j < arr2.length ; j ++){
            System.out.print(arr2[j] + " ");
        }
        System.out.println();

        int [] newArr = new int[arr1.length + arr2.length ];

        for (int i = 0 ; i < arr1.length ; i ++){
            newArr[i] = arr1[i];

        }
        for (int j = 0 ; j < arr2.length ; j ++){
            newArr[arr1.length + j] = arr2[j];
        }

        System.out.println(Arrays.toString(newArr));

    }
}
