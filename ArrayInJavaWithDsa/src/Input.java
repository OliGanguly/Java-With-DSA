import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //print it
        for (int i:arr){
            System.out.println(i+ " ");
        }
        //Array class has a toString Methods , when you give a array to it coverts it to a string and print the string
        System.out.println("hi :" + Arrays.toString(arr));


    }
}
