import java.util.Arrays;
import java.util.Scanner;



public class Programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        takeInput(arr,sc);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max Value/Largest " + largest(arr));
        System.out.println("Min Value/Smallest " + smallest(arr));
//        swap(arr,0,1);
//        System.out.println("After swaped : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr));
        System.out.println("Element :" +searchElement(arr, sc));
    }
    public static void takeInput(int arr[],Scanner sc){
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Element");
            arr[i]=sc.nextInt();
        }
    }
    public static int largest(int arr[]){
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    public static int smallest(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void swap (int arr[],int index1 , int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static  void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    public static int searchElement(int arr[],Scanner sc){
        System.out.println("Enter element you want to search : ");
        int element=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return element;
            }
        }

        System.out.println("Not Found");
        return -1;
    }

}

