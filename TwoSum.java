import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] findingIndex(int[] arr,int target){
        Map<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int moreNeeded=target-arr[i];
            if(hm.containsKey(moreNeeded)){
                return new int[]{hm.get(moreNeeded),i};
            }
            hm.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] nums={-6, 7, 1, -7, 6, 2};
        int target=3;

        int[] ans=findingIndex(nums,target);
        System.out.println("Indices are : "+ Arrays.toString(ans));
    }
}
