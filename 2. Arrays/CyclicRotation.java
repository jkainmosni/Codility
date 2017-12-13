class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] B = new int[A.length];
        int temp=0;

        if (K==A.length || A.length==0) {
            return A;
        }
        else if (K>A.length) {
            K = K%A.length;
        }
        for (int i = 0 ; i < B.length ; i++) {
            temp=i+K;
            if(temp>=B.length){
                temp=temp-B.length;
                }
                  B[temp]=A[i];
        }
        return B;
    }
}
