import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] myArray = {4,7,3,2,1,3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //Меняем местами элементы
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
