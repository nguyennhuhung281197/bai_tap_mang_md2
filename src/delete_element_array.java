import java.util.Arrays;

public class delete_element_array {
    public static void main(String[] args) {

        int [] arr = {10, 4, 6, 7, 8, 0, 0};
        int deleteNumber = 7;
        int index = -1;
        for (int i = 0 ; i < arr.length ; i ++ ){
            if(arr[i] == deleteNumber){
                index = i;
                break;
            }
        }
        if (index != -1){
            for (int i = index ; i < arr.length - 1;i ++ ){
                arr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
