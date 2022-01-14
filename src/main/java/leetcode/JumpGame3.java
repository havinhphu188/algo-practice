package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//1306. Jump Game III
//https://leetcode.com/problems/jump-game-iii/
public class JumpGame3 {
    public boolean canReach(int[] arr, int start) {
//        System.out.println("arr = " + Arrays.toString(arr));
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        int[] path = new int[arr.length];
        Arrays.fill(path, -1);
        Arrays.fill(visited, false);
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentV = queue.poll();
//            System.out.println("currentV = " + currentV);
            if (arr[currentV] == 0) return true;
            int rightNode = currentV + arr[currentV];
//            System.out.println("rightNode = " + rightNode);

            if (rightNode < arr.length) {
                if (!visited[rightNode]){
                    queue.add(rightNode);
                    visited[rightNode] = true;
                }
            }

            int leftNode = currentV - arr[currentV];
//            System.out.println("leftNode = " + leftNode);
            if (leftNode >= 0 ) {
                if (!visited[leftNode]){
                    queue.add(leftNode);
                    visited[leftNode] = true;
                }
            }

        }
        return false;
    }
}
