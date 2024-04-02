package oracle;

//lc 1802

public class MaxValueAtGivenIndexInBoundedArray {

    public int maxValue(int n, int index, int maxSum) {
        int sum = n;
        int l=index, r=index;
        int ans = 1;
        while( sum + (r-l+1) <= maxSum){
            sum += r-l+1;
            r = r == n-1? n-1 : r--;
            l = l == 0? 0 : l--;

            ans++;

//            if(l==0 && r==n-1){
//
//            }

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
