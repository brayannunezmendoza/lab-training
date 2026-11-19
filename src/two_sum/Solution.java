package src.two_sum;

public class Solution {
    public Solution() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] nums4 = {3, 2, 3};
        int target4 = 6;
        int[] nums5 = {2, 5, 5, 11};
        int target5 = 10;


        int[] res = twoSum(nums5, target5);

    }

    //novo problema, enviar somente a posiçãp dos valores aceitos, ex
    //nums3 return [0 ,1]
    public int[] twoSum(int[] nums, int target) {
        //se houver mais de 2 valores no nums[]
        if (nums.length > 2) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {

                    } else {
                        if (nums[i] + nums[j] == target) {
                            System.out.println(i + ", " + j);
                            return new int[]{i, j};
                        }
                    }
                }
            }
        }
        //some de dois numeros se houver apenas dois valores no nums[]
        if (nums.length == 2) {
            if (nums[0] + nums[1] == target) {
                System.out.println(nums[0] + ", " + nums[1]);
                return new int[]{0, 1};
            } else {
                System.out.println("soma inconpativel");
            }
        }
        return null;
    }
}
