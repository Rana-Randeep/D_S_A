import java.util.ArrayList;
import java.util.List;

class Solution {
    void merge(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        List<Integer> temp=new ArrayList<>();

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(nums[i]);
            i++;
        }
        while(j<=right){
            temp.add(nums[j]);
            j++;
        }

        for(int k=left;k<=right;k++){
            nums[k]=temp.get(k-left);
        }
    }

    void mergeSorting(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSorting(nums, left, mid);
        mergeSorting(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeSorting(nums, 0, n - 1);
        return nums;
    }
}

public class MergeSorting {
public static void main(String[] args){
    int[] nums={9,4,7,6,3,1,5};
    int n=nums.length;
    System.out.println("Before Sorting Array");
    for(int i=0;i<n;i++){
        System.out.print(nums[i] + " ");
    }
    System.out.println();
    Solution s=new Solution();

    int[] sortedArray= s.mergeSort(nums);
    System.out.println("After Sorting Array ");
    for(int element:sortedArray){
        System.out.print(element + " ");
    }
}
}


