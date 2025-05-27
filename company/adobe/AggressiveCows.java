/*
   Time Complexity = O(N * log(N))
   Space Complexity = O(log(N))

   Where N is the number of elements in the given array/list.
*/

import java.util.Arrays;

public class AggressiveCows
{
    //    check if a distance of x is possible b/w each cow
    private static boolean check(int x, int k, int []stalls)
    {

        //    Greedy approach, put each cow in the first place you can.
        int cowsPlaced = 1, lastPos = stalls[0];

        int n = stalls.length;

        // Traverse through the array stalls
        for (int i = 1; i < n; i++)
        {
            if ((stalls[i] - lastPos) >= x)
            {
                cowsPlaced = cowsPlaced + 1;

                if (cowsPlaced == k)
                {
                    return true;
                }

                //    Assign current position of stall as the lastPos.
                lastPos = stalls[i];
            }
        }

        return false;
    }

    public static int aggressiveCows(int []stalls, int k)
    {

        Arrays.sort(stalls);

        //    binary search
        int low = 0, high = 1000000000, mid, pos = 0;

        while (high >= low)
        {
            mid = (high + low) / 2;

            if (check(mid, k, stalls))
            {
                low = mid + 1;
                pos = mid;
            }
            else
            {
                high = mid - 1;
            }
        }

        return pos;
    }
} 