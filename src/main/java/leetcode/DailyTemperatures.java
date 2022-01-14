package leetcode;

import java.util.Arrays;
import java.util.Stack;

//739. Daily Temperatures
//https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
//        System.out.println("temperatures = " + Arrays.toString(temperatures));
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
//            System.out.println("stack = " + stack);
            while((!stack.empty())&&(temperatures[i] > temperatures[stack.peek()])){
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
            //            if (temperatures[i] < temperatures[stack.peek()]){
//                stack.push(i);
//            }else{
//
//            }
        }

//        System.out.println("result = " + Arrays.toString(result));
        return result;
    }
}
