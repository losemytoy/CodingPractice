import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], -1) + 1);
            if (res.size() < map.get(nums[i]) + 1) {
                res.add(new ArrayList<>());
            }
            res.get(map.get(nums[i])).add(nums[i]);
        }
        return res;
    }
}