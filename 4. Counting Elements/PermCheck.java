/ you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public boolean duplicates(final int[] A) {
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : A) {
            if (lump.contains(i)) return true;
            lump.add(i);
        }
        return false;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        if (duplicates(A) == false) {
            // System.out.println("Array does not has Dublicates");
            int expectedSum = 0;
            int realSum = 0;
            for (int i = 0 ; i < A.length ; i++) {
                expectedSum = expectedSum + i + 1;
                realSum = realSum + A[i];
            }
            // System.out.println("ExpectedSum: " + expectedSum);
            // System.out.println("RealSum: " + realSum);
            if (expectedSum != realSum) {
                return 0;
            }
        }
        else {
            // System.out.println("Array has Dublicates");
            return 0;
        }
    return 1;
    }
}
