import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr [] = {1,2,400,7,8,97};
        swap(arr , 1, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static public void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static  int  max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
