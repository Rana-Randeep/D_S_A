import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        List<Integer> result=new ArrayList<>();
        int top=0;
        int right=col-1;
        int bottom=row-1;
        int left=0;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(mat[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i =right;i>=left;i--){
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[][] mat={{1,2},
        {3,4},
        {5,6},
        {7,8}
        };

        SpiralMatrix sol=new SpiralMatrix();

        List<Integer> ans= sol.spiralOrder(mat);

        for(int i=0;i<ans.size();i++){
            System.out.print (ans.get(i)+" ");
        }
    }
}
