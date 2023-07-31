public class BinarySearch {

    /*
    *  arr =[2,4,6,9,11,12,14,20,36,48]-Find 36 ??
    *        0,1,2,3, 4 5,  6  7  8  9 -indexs
    *
    *       Start = 0 , end = 9 , middle 0+9/2 = 4 ->arr[4]=11
    *       36>11 = serach in rhs
    *       RHS-[12,14,20,36,48]
    *            5   6  7  8  9 -indexs
    *       start=5
    *       end=9
    *       middle 5+9/2=7
    *       [36,48]
    *        8  9
    *       mid=8+9/2=8
    *       ar[mid]=36
    *
    *
    *  target = 36
    *   algo : Imagine assending array
    *  1. take middle of the element ->Start + end / 2
    *  2. taget = 36 , middle is 11 say- so 11 should we in rhs of 11
    *  3. target = 4 , should be in lhs
    *  target > mid ->serach in Right otherwise search in left
    *  4. if middle == target - found my answer
    * */

      /*
      * Array of size n (n/2^0)
      * level =1 (n/2^1) every time search space reduced by 2  = n/2
      * level=2 (n/2^2)  next time n/2/2=n/4
      * level=3 (n/2^3)  n/8
      * .....
      * .....
      *  kth level
      *  n/2^k
      *  end size = 1=n/2^k
      *
      * n/2^k = 1
      * log(n)=log(2^k)
      * logn = klog2
      * k = logn/log2
      * k = log N BASE 2
      * k = total no of levels in worst case (log n)
      *
      * Search
      * 1M ->LINER 1M COM
      * 1M ->Binary log2(1000000) around 20
      * */
    public static void main(String[] args) {

        int arr []={2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(binarySearch(arr, target));


    }
    public static int binarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
//            int mid=(start+end)/2;
            //start+end / 2 if might exceeds the range og integer
            // int mid = start + (end - start)/2
             /*
             * 2s+e-s /2 = s+e/2
             * */
            if(target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                return mid;
            }
        }

       return -1;
    }
}
