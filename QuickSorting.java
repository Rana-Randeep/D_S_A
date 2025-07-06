class Program{
    public int pIndex(int[] nums,int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;

        while(i<j){
            while(nums[i]<=pivot && i<=high-1){
                i++;
            }

            while(nums[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp=nums[j];
        nums[j]=nums[low];
        nums[low]=temp;

        return j;
    }

    public void quickSortHelper(int[] nums ,int low,int high){
        if(low>=high) return;
        int pivotIndex=pIndex(nums,low,high);
        quickSortHelper(nums,low,pivotIndex-1);
        quickSortHelper(nums,pivotIndex+1,high);

    }
    public int[] quickSort(int[] nums){
        int n=nums.length;
        quickSortHelper(nums,0,n-1);
        return nums;
    }
}

public class QuickSorting {
    public static void main(String[] args) {
        int[] nums = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = nums.length;

        System.out.println("Before Sorting Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        Program p = new Program();
        int[] sortedArr = p.quickSort(nums);

        System.out.println("After Sorting Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }
}
