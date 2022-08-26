import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
// }


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        if (x<=arr[0]) {
            for (int i=0;i<k;i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        int right = findRight(arr,x);
        int left = right - 1;
        while (k-->0) {
            if (right >= arr.length) {
                left--;
            } else if (left < 0) {
                right++;
            } else if (arr[right]-x >= x-arr[left]) {
                left--;
            } else {
                right++;
            }
        }


        for (int i=left+1;i<right;i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    public int findRight(int[] example,int x) {
        int left = 0,right = example.length-1;
        while (left<right) {
            int mid = left + (right-left)/2;
            if (example[mid] >= x) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}