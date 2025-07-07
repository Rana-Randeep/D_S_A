import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    static int longestConsecutiveSequence(int[] nums){
        int n=nums.length;
        int longest=1;
        Set<Integer> set=new HashSet<>();

        for(int i:nums) {
            set.add(i);
        }

        for(int i:set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int starting = i;

                while (set.contains(starting + 1)) {
                    count++;
                    starting++;
                }
                longest = Math.max(longest, count);
            }

        }
        return longest;
    }
    public static void main(String[] args){
        int[] a={100,4,200,1,3,2};
        LongestConsecutive ans=new LongestConsecutive();
        System.out.println("The Longest Consecutive Sequence is :" +longestConsecutiveSequence(a));
    }
}
