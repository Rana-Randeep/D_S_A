import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PascalSolution{
    private List<Integer> generateRow(int row){
        List<Integer> result=new ArrayList<>();
        int ans=1;
        result.add(ans);

        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            result.add(ans);
        }
        return result;
    }

public List<List<Integer>> pascalTriangleIII(int n){
    List<List<Integer>> pascalTriangleIII=new ArrayList<>();

    for(int row=1;row<=n;row++){
        pascalTriangleIII.add(generateRow(row));
    }
    return pascalTriangleIII;
}
}

public class PascalTriangleIII {
    public static void main(String[] args){
        int n=6;
        PascalSolution ps=new PascalSolution();
        List<List<Integer>> pascalTriangle=ps.pascalTriangleIII(n);

        Iterator<List<Integer>> it= pascalTriangle.iterator();
        while(it.hasNext()){
            List<Integer> ans=it.next();
            System.out.println(ans);
        }

    }
}
