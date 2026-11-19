package src.two_sum;

public class Solution {
    public Solution() {
        /*o codigo deve retornar a posição dos numeros que somados são igual a target*/
        //exerciocios de entrafa
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] nums4 = {3, 2, 3};
        int target4 = 6;
        int[] nums5 = {2, 5, 5, 11};
        int target5 = 10;
        int[] nums6 = {3, 2, 4};
        int target6 = 6;
        //saidas desejadas
        /*
        1 = 0, 1
        2 = 1, 2
        3 = 0, 1
        4 = 0, 2
        5 = 1, 2
        6 = 1, 2
        * */
        int[] res = twoSum(nums6, target6);
        System.out.println(res[0] + ", " + res[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        //tamanho do nums
        int n = nums.length;
        //guardara apenas 2 valores,[2]{n1,n2}
        int[] res = new int[2];
        //laço i, i = nums.length
        for (int i = 1; i < n; i++) {
            //laço j, j = i. no return j sera j-i
            for (int j = i; j < n; j++) {
                if (nums[j] + nums[j - i] == target) {
                    res[1] = j;
                    res[0] = j - i;
                    return res;
                }
            }
        }
        return null;
    }
}
