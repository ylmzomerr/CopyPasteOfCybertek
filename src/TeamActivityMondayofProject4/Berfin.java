package TeamActivityMondayofProject4;

import java.util.Arrays;

public class Berfin {
//    The method takes an integer of array as an argument and returns second largest number from that array.
//  ( Attention! Don't use Arrays.sort() method. if you use ready method, you will get ZERO point)
//
//   Example:
//
//   argument: {12, 23, 3, 5, 89} => array
//   return : 23
public static void main(String[] args) {
    //int [] arr ={3,56,57,78,43,4,4,7};
    //System.out.println(secondLargestNum(arr));

}

  public static int secondLargestNum(int[] arr) {

        int [] ar = new int [arr.length];
        int secondLargest = arr[0];
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                 secondLargest = largest;
                largest= arr[i];

            }else if(arr[i]> secondLargest){
                secondLargest = arr[i];

            }
        }
      return secondLargest;

    }

}

