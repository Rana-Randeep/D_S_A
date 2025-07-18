public class RotateMatrix {

    private static void reverseMatrix(int[] row){
        int start=0;
        int end=row.length-1;
        while(start<end){
            int temp=row[start];
            row[start]=row[end];
            row[end]=temp;
            start++;
            end--;

        }
    }

private static void transposeMatrix(int[][] nums){
    int n=nums.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int temp=nums[i][j];
            nums[i][j]=nums[j][i];
            nums[j][i]=temp;
        }
    }
}

    public static void main(String[] args){
    int[][] arr={{0,1,1,2},{2,0,3,1},{4,5,0,5},{5,6,7,0}};
    int n=arr.length;

    transposeMatrix(arr);
    for(int i=0;i<n;i++){
        reverseMatrix(arr[i]);
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
