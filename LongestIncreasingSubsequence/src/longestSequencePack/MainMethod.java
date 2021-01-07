package longestSequencePack;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
	 

	public static void main(String[] args) {
		TheSequence mySequence = new TheSequence();

        Integer[] theResult = mySequence.getLongestIncreasingSubsequence();

        System.out.println("The Longest Increasing Subsequence Is:");
        for (Integer i : theResult) {
            System.out.println(i);
        }
	}

}