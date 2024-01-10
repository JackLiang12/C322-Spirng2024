package Week1;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;
import java.util.Arrays;

public class TestDrive {
    public static void main(String[] args) {
        int[] nums = {2,7,11};
        int target = 9;
        int[] expected = {0,1};


        System.out.println(Arrays.equals(expected, Problems.problem1(nums,target)));

        int[] nums2 = {3,2,4};
        target = 6;
        int[] expected2 = {1,2};

        System.out.println(Arrays.equals(expected2,Problems.problem1(nums2,target)));

        int[] nums3 = {3,3};
        int[] expected3 = {0,1};

        System.out.println(Arrays.equals(expected3,Problems.problem1(nums3,target)));
        System.out.println("testing git");
    }



}
