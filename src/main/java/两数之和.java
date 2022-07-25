public class 两数之和 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        // 线性查找

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int n = nums[i];
            for (int j = i + 1; j < length; j++) {
                if (target - n == nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

}

