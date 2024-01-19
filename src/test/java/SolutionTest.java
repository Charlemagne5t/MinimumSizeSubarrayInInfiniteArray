import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {1,2,3};
        int target = 5;
        int expected = 2;
        int actual = new Solution().minSizeSubarray(nums, target);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {1,1,1,2,3};
        int target = 4;
        int expected = 2;
        int actual = new Solution().minSizeSubarray(nums, target);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] nums = {2,4,6,8};
        int target = 3;
        int expected = -1;
        int actual = new Solution().minSizeSubarray(nums, target);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int[] nums = {13,3,1,5,13,7,12,5};
        int target = 35;
        int expected = 5;
        int actual = new Solution().minSizeSubarray(nums, target);

        Assert.assertEquals(expected, actual);
    }
}
