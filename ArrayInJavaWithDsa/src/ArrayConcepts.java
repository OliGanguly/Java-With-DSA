//Array is collection of data types
public class ArrayConcepts {
    public static void main(String[] args) {
    int a[]=new int[5];
    int []b={10,20,30};

        //memeory
        int rolls[];//decleration + rolls ref variable in created in stack memory -compile time
        rolls=new int[5];//Actyally here a object of size 5 is created in (heap) memory - run time
        //dynamic memory allocated - memory allocated in run time


        /*
        * In java there is no concept of pointers it totally depends on
        * JVM , Whether it will be contiguous or not.\
        * 1. Array obj created in the heap
        * 2.Heap objs are not continuous
        * 3.Dynamic memory allocation
        * 4.Array objs in java may not be continous
        *
        * */

        /*
        * null- it has not data type its a literal you can cast it with any ref type
        * You can assign to non premitives
        * String a=null;
        * */

        String [] arr = new String[6];
        //internal ->
        /*
        * Stack                 Heap
        * arr ----------------->["","","","","",""]
        *                         |  |  |  |  |  | Each ele itself a object
        *                        arr[0] arr[1]----arr[5]
        *                         =
        *                        null
        * Array type, String type, Our own type store in Heap
        * Each particular element it self is an object
        * Each obj store diff parts of memory
        * if we not initialize object its points to null
        * */

    }
}
