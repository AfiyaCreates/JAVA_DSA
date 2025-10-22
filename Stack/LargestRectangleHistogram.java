//how do we know stack is used - whenever somethng like sequences ..ans till here types of questions
//taking maximum so far area we can get startimg from index 0
//starting from 0to1234....
//consider max possible area for each index i 

//brute force approach - 2 loops for(int i =0 to n )....for(int j =i to n)....o(n2)
//optimal - o(n)
//find the largest rectangle(area) for each bar 
//eg - 215623
//for 2 - 2..for 1-6..for 5-10...
//so the largest rectangle is = 10
//intialize ans =0
//calc curr area for each bar ...
//for(int i=0 to n){
//curr area of i th bar
//max area(ans) = max(curr,max)  ...max area for that bar 
//}
//for area height is fixed ...heights[i]...width
//for width extend the left and right boundary of that bar until we get width >=height 
//width = r-l-1
//to get r - use stack push smaller values fromt height[i]..pop larger values...traverse the array in reverse order...coz we want nearest smaller value
//we are storing indexes
//stack<>
//right[n]
//for(int i=n-1;i>=0;i--){
// while(s.size()>0 && ht[s.top()]>=ht[i]){
//     s.pop()
// }
//right[i]=s.isempty()?n:s.top()
// s.push(i)
// }

//same concept for left ..loop goes from 0 to n

import java.util.Stack;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n]; // stores index of nearest smaller to left
        int[] right = new int[n]; // stores index of nearest smaller to right

        Stack<Integer> stack = new Stack<>();

        // Fill left array (Nearest Smaller to Left)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear the stack to reuse it
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the max area using height[i] * width[i]
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

    }
}
