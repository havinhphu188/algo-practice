package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        char[] charS = s.toCharArray();
        int[] map = new int[26];

        for (char c : charS) {
            map[c - 'A'] += 1;
        }

        int maxLengthChar = 0;

        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                int[][] graph = buildgraph(charS, (char) (i + 'A'));
                int maxLengthInGraph = maxLengthInGraph(graph,k);
                System.out.println("graph = " + Arrays.deepToString(graph));
                System.out.println("maxLengthInGraph = " + maxLengthInGraph);
                maxLengthChar = Math.max(maxLengthChar,maxLengthInGraph);
            }
        }

        return maxLengthChar;
    }

    private int maxLengthInGraph(int[][] graph, int k) {
        int maxLength = 0;

        for (int i = 0; i < graph.length; i++) {
            int cost = k;
            int currentLength = graph[i][0];
            for (int j = i + 1; (j < graph.length) && (cost > 0); j++) {
                if (cost >= graph[j][1]) {
                    currentLength += graph[j][0] + graph[j][1];
                    cost -= graph[j][1];
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    private int[][] buildgraph(char[] charS, char c) {
        System.out.println("c = " + c);
        List<int[]> result = new ArrayList<>();
        int sIndex = 0;
        result.add(new int[]{0,0});
        while (sIndex < charS.length) {
            int countChar = 0;
            int countSpace = 0;

            while ((sIndex < charS.length) && (charS[sIndex] != c)) {
                sIndex++;
                countSpace++;
            }

            while ((sIndex < charS.length) && (charS[sIndex] == c)) {
                sIndex++;
                countChar++;
            }

            int[] node = new int[]{countChar, countSpace};
            result.add(node);
        }
        return result.toArray(new int[result.size()][2]);
    }
}
