import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for (int row=0;row<a.length;row++) {
            System.out.println(Arrays.toString(a[row]));
        }
        //every ele is of type array
        for(int[] i:a){
            System.out.println(Arrays.toString(i));
        }

    }
}
