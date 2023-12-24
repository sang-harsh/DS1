package recursion1;

import java.util.ArrayList;

public class ArrayQuestions {
      public static int maxSum = 0;
      // public static int[] maxArray = {};

      public static ArrayList<Integer> maxArray = new ArrayList<Integer>();

      public static int[] reverseArray(int arr[], int first, int last) {
            if (first >= last) {
                  return arr;
            }

            // Switch
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            return reverseArray(arr, first + 1, last - 1);
      }

      public static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i]);
            }
            System.out.println();
      }

      public static void printSubArraysWithIterative(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i; j < arr.length; j++) {

                        for (int k = i; k <= j; k++) {
                              System.out.print(arr[k] + " ");
                        }
                        System.out.println();
                  }
            }

      }

      public static void printSubArraysWithRecursion(int arr[], int head, int tail) {
            // if(index == arr.length){

            if (tail == arr.length) {
                  return;
            } else if (head > tail) {
                  printSubArraysWithRecursion(arr, 0, tail + 1);
            } else {
                  int currentSum = 0;
                  for (int i = head; i <= tail; i++) {
                        currentSum += arr[i];
                        System.out.print(arr[i] + " ");
                  }
                  System.out.println(" ");
                  if (currentSum > maxSum) {
                        maxSum = currentSum;
                        maxArray.clear();
                        for (int i = head; i <= tail; i++) {
                              maxArray.add(arr[i]);
                        }
                  }
                  printSubArraysWithRecursion(arr, head + 1, tail);

            }

      }

      public static void main(String[] args) {
            // int arr[] = { 1, 6, 7, 3, 9, 4, 3 };
            int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
            printSubArraysWithRecursion(arr, 0, 0);
            System.out.println(maxArray);

      }
}
