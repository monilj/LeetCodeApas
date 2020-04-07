////Given an array of integers, return indices of two number such that addition of theses two number is equal to target
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSumAlternateSolution {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 22;
        int [] index= twoSum(num,target);
        System.out.printf(Arrays.toString(index));
    }

    public static int[] twoSum(int[] num, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0; i<num.length;i++)
        {
            int temp= target-num[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(num[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

