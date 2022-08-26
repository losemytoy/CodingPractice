class NumArray {
    static int[] volumn;

    public NumArray(int[] nums) {
        volumn = nums;
    }

    public void update(int index, int val) {
        volumn[index] = val;
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for (int i = left;i<right;i++) {
            sum += volumn[i];
        }
        return sum;
    }
}