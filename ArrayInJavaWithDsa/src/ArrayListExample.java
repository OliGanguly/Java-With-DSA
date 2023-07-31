import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //where size is not fixed
        //stntax
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.contains(10));
        System.out.println(list);
        list.set(0,30);
        System.out.println("updated: " + list);


    }
}
/*
* How Arraylist works Internally ?
* How no size is required?
* 1.Size is actually fixed Internally
* 2.When arraylist fills by 50% or by some amount
* it will create a new arraylist of bigger size, old list
* copied into new list and old one got deleted.
* */
