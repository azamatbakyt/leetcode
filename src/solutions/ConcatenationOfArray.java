package solutions;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            for (int j = i + n; j < result.length; j++) {
                result[j] = nums[i];
            }
        }


        return result;
    }
}
