public class KadanesAlgorithm {
    private int largestSum(int[] nums){
        int n=nums.length;
        int i=0;
        int j=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            if(sum>0){
                maxSum=Math.max(maxSum,sum);
                j++;
            }
            else{
                maxSum=Math.max(maxSum,sum);
                i++;
                j++;
                sum=0;
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args){
        int[] arr={-1, 2, 3, -1, 2, -6, 5};
        KadanesAlgorithm ans=new KadanesAlgorithm();
        int maxSum= ans.largestSum(arr);
        System.out.println("The maximum SubArray is : "+ maxSum );
    }
}
