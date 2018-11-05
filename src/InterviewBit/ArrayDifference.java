/*
Source: InterviewBit

Problem Statement: Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.
 */
package InterviewBit;

import java.util.HashSet;

public class ArrayDifference {
    public static int printpairs(int arr[],int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && s.contains(temp))
            {
//                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", "+temp+")");
                return 1;
            }else {
                s.add(arr[i]);
            }
        }
        return 0;
    }

    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);
    }
}

/*
Common mistakes people make:
1. Test for the case when k = 0.
2. Try their solution for following 2 cases :
    A: [1, 2, 3] k: 0 Expected result : 0
    A: [1, 2, 1] k:0 Expected result : 1
3. For a hashmap, make sure they understand hashing and different hashing techniques.
    Have a discussion around how they would implement a hashmap.
4. Again, please go into the details of time and space complexity of a hashmap.
5. Common gotcha : Worst case time complexity of a lookup in hashmap is O(n) and not O(1).
    Average case time complexity of a lookup in hashmap is O(1).
6. Check on what data structure would they use if a worst case time complexity of O(log n) is desired.

Once they have completed the solution, check with them for space complexity. In this case, it is O(N).
Ask them on how they will approach the question if O(1) additional space was allowed.
If they get stuck, hint at sorting the array.
Answer : Sorting and then 2 pointer approach. Expected time complexity : O(N log N)
 */

