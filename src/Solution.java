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
    public int maxProduct(int[] nums) {
        int a=0,b=0;
        for (int num:nums) {
            if (num > a) {
                b = a;
                a = num;
            } else if (num > b){
                b = num;
            }
        }
        return (a-1)*(b-1);
    }
}