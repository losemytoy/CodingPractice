import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }


class Solution {
    public static int widthOfBinaryTree(TreeNode root) {
        List<Pair<TreeNode,Integer>> list = new ArrayList<>();
        list.add(new Pair<>(root,1));
        int ans=0;
        while (!list.isEmpty()) {
            List<Pair<TreeNode,Integer>> tmp = new ArrayList<>();
            for (Pair<TreeNode,Integer> pair:list) {
                TreeNode node = pair.getKey();
                int index = pair.getValue();
                if (node.left != null) {
                    tmp.add(new Pair<>(node.left,2*index));
                }
                if (node.right != null) {
                    tmp.add(new Pair<>(node.right,2*index+1));
                }
            }
            ans = Math.max(ans,list.get(list.size()-1).getValue()-list.get(0).getValue()+1);
            list = tmp;
        }
        return ans;
    }

    public static void main(String[] args) {
        widthOfBinaryTree(new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode()));
    }
}