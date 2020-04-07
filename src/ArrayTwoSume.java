//Given an array of integers, return indices of two number such that addition of theses two number is equal to target
public class ArrayTwoSume {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 22;
        int sum =0;
        for(int i=0; i<num.length;i++){
            for(int j=i+1; j<num.length;j++) {
                sum = num[i] +num[j];
                if(sum==target)
                {
                    System.out.print(num[i] +", "+ num[j]+"\n");
                    System.out.print(i +", "+ j);

                }
            }
        }
    }
}
