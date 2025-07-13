import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public class ThreeSum {
    private static List<List<Integer>> threeSum(int[] nums){
        if(nums==null || nums.length<3) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();

        for (int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }


    public static void main(String[] args){
        int[] nums={8, -6, 5, 4};
        List<List<Integer>> ans=threeSum(nums);

        Iterator<List<Integer>> it=ans.iterator();
        while(it.hasNext()){
            List<Integer> result=it.next();
            System.out.println(result);
        }
    }
}
