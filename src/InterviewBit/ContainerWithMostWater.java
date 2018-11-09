/*
Source: InterviewBit

Problem Statement: Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Your program should return an integer which corresponds to the maximum area of water that can be contained
(Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity).

Input : [1, 5, 4, 3]
Output : 6

Explanation : 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3.
So total area = 3 * 2 = 6

Reference: https://www.youtube.com/watch?v=cdRaaEYk6tI
 */
package InterviewBit;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // variable that stores the maximum area
        int maxArea = 0;

        // if input array is null
        if(height == null){
            return maxArea;
        }

        // Assign two pointers: left and right
        int left = 0;
        int right = height.length - 1;

        // while the two pointers do not cross over each other
        while(left < right){
            // calculate the area: width * height
            int area = (right - left) * Math.min(height[left], height[right]);

            // find the max
            maxArea = Math.max(area, maxArea);

            // To move the left and right pointers
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
