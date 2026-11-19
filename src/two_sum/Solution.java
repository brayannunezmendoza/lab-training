package src.two_sum;

public class Solution {
    public Solution() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] nums3 = {3, 3};
        int target3 = 6;


        int[] res = twoSum(nums2, target2);
        // System.out.println(res[0] + ", " + res[1]);

    }

    public int[] twoSum(int[] nums, int target) {
       /* int[] sum1 = nums;
        int[] sum2 = nums;
        int n1;
        int n2;

        for (int i = 0; nums.length > i; i++) {
            for (int j = 0; sum2.length > j; j++) {
                if (sum1.length == 1) {
                    if (sum1[i] == sum2[j] && sum1.length == 1) {
                        n1 = sum1[i];
                        n2 = sum2[j];
                        return new int[]{n1, n2};
                    }
                } else {
                    if (sum1[i] != sum2[j]) {
                        if (sum1[i] + sum2[j] == target) {
                            n1 = sum1[i];
                            n2 = sum2[j];
                            return new int[]{n1, n2};
                        }
                    }
                }

            }
        }
         +-*/
        //se houver mais de 2 valores no nums[]
        if (nums.length > 2) {
            for (int i = 0; i < nums.length; i++) {
                for (int j=0;j<nums.length;j++){
                    if (nums[i]!= nums[j]){
                        if (nums[i]+nums[j]==target){
                            System.out.println(nums[i]+", "+nums[j]);
                            return new int[]{nums[i],nums[j]};
                        }
                    }else{}
                }
            }
        }
        //some de dois numeros se houver apenas dois valores no nums[]
        if (nums.length == 2) {
            if (nums[0]+nums[1]==target){
                System.out.println(nums[0]+", "+nums[1]);
                return new int[]{nums[0],nums[1]};
            }else{
                System.out.println("soma inconpativel");
            }

        }
        return null;
    }


    {
    /*
    * {
    *  for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j]<target){
                        if (nums[i]!=nums[j]){
                            int res= nums[i]+nums[j];
                            System.out.println(res);
                        }
                    }
                }
            }

        }
    * }
    *
    * */
    }
}
