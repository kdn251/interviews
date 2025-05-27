/*
    Time Complexity - O(N * K)
    Space Complexity - O(1)

    where N is the length of the array and K is the size of subarrays
*/

public class MaximumSubarraySum {



  void printSubarrayMax(int[] arr, int n, int k)
  {
      if (n == 0 || k == 0)
      {
          return;
      }
  
      for (int i = 0; i <= n - k; ++i)
      {
          int maxElement = Integer.MIN_VALUE;
  
          for (int j = i; j < i + k; ++j)
          {
              maxElement = Math.max(maxElement, arr[j]);
          }
  
          System.out.println("Maximum element in subarray [" + i + ", " + (i + k - 1) + "] is: " + maxElement);
      }
  }
  
  }